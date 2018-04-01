package com.venttp.utils.logutil;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {
    private static Logger logger = LogManager.getLogger("venttpLog");
    public static void trace(Object object)
    {
        logger.trace(object);
    }
    public static void debug(Object object) {
        logger.debug(object);
    }

    public static void info(Object object) {
        logger.info(object);
    }

    public static void warn(Object object) {
        logger.warn(object);
    }

    public static void error(Object object) {
        logger.error(object);
    }

    public static void fatal(Object object) {
        logger.fatal(object);
    }
}
