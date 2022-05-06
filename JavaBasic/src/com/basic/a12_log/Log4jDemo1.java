package com.basic.a12_log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *  对于 Log4j 2:
 *  1.去官网下载最新版本
 *  2.导入 jar 包 ：log4j-core-xx.jar， log4j-api-xx.jar
 *  3.在某个类中使用Log4j记录日志，需要申明下面成员变量(为了方便调用)
 *    private static Logger logger = LogManager.getLogger(MyApp.class.getName());
 *  4.日志级别(包含关系，小的包含大的)：
 *    trace < debug < info < wan < error < fatal
 *    a.trace： 是追踪，就是程序推进以下，你就可以写个trace输出，所以trace应该会特别多，
 *              不过没关系，我们可以设置最低日志级别不让他输出。
 *    b.debug： 调试么，我一般就只用这个作为最低级别，trace压根不用。
 *              是在没办法就用eclipse或者idea的debug功能就好了么。
 *    c.info：  输出一下你感兴趣的或者重要的信息，这个用的最多了。
 *    d.warn：  有些信息不是错误信息，但是也要给程序员的一些提示，
 *              类似于eclipse中代码的验证不是有error 和warn（不算错误但是也请注意，
 *              比如以下depressed的方法）。
 *    e.error： 错误信息。用的也比较多。
 *    f.fatal： 级别比较高了。重大错误，这种级别你可以直接停止程序了，是不应该出现的错误！
 */
public class Log4jDemo1 {

    private static Logger LOGGER =
            LogManager.getLogger(Log4jDemo1.class.getName());

    public static void main(String[] args) {
        LOGGER.debug("Debug。。。。 ");
        LOGGER.info("Infor .....");


    }
}
