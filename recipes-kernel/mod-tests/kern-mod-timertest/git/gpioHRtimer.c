#include <linux/kernel.h>
#include <linux/init.h>
#include <linux/module.h>
#include <linux/kdev_t.h>
#include <linux/fs.h>
#include <linux/cdev.h>
#include <linux/device.h>
#include <linux/hrtimer.h>
#include <linux/ktime.h>
#include <linux/err.h>

//#include <linux/gpio/consumer.h>
#include <linux/gpio.h>

#include <linux/moduleparam.h>

#define TIMEOUT_NSEC   ( 1000000000L )      //1 second in nano seconds

static struct hrtimer dv_hr_timer;

static int gpioN = 0;
static long ival = TIMEOUT_NSEC;
static u32 dv_state;

module_param(gpioN, int, S_IRUSR | S_IWUSR);
MODULE_PARM_DESC(gpioN, "GPIO pin number");
module_param(ival, long, S_IRUSR | S_IWUSR);
MODULE_PARM_DESC(ival, "HR Timer interval");

enum hrtimer_restart timer_callback(struct hrtimer *timer) {
 dv_state++;
 gpio_set_value( gpioN, dv_state % 2);
 hrtimer_forward_now( &dv_hr_timer, ktime_set( 0, ival));
 if ( dv_state % 10000 == 0) printk( KERN_INFO "%s() 10000 switches are done\n", __FUNCTION__);
 return( HRTIMER_RESTART);  }

static int __init my_init(void) {
 int ret;
 ktime_t ktime;
 
 printk( KERN_INFO "%s() requesting gpio pin %d...\n", __FUNCTION__, gpioN);
 ret = gpio_request( gpioN, "gpioHRpin");
 if ( ret < 0) {
   printk( KERN_INFO "%s() gpio_request(%d) failed\n", __FUNCTION__, gpioN);
   return( ret);   }
 printk( KERN_INFO "%s() setting pin %d to OUT(0)...\n", __FUNCTION__, gpioN);
 ret = gpio_direction_output( gpioN, 0);
 if ( ret < 0) {
   printk( KERN_INFO "%s() gpio_direction_output(%d) failed\n", __FUNCTION__, gpioN);
   return( ret);   }
 printk( KERN_INFO "%s() pin %d setup done\n", __FUNCTION__, gpioN);
 printk( KERN_INFO "%s() setting up the timer...\n", __FUNCTION__);

 ktime = ktime_set( 0, TIMEOUT_NSEC);
 hrtimer_init( &dv_hr_timer, CLOCK_MONOTONIC, HRTIMER_MODE_REL);
 dv_hr_timer.function = &timer_callback;
 hrtimer_start( &dv_hr_timer, ktime, HRTIMER_MODE_REL);

 return( 0);  }

static void __exit my_exit( void) {
 printk( KERN_INFO "Module Unloading\n");
 hrtimer_cancel( &dv_hr_timer);
 gpio_free( gpioN);
 return;  }

module_init( my_init);
module_exit( my_exit);

MODULE_AUTHOR("Dvorkin Dmitry");
MODULE_DESCRIPTION("Test HR timer with GPIO");
MODULE_LICENSE("GPL v2");
