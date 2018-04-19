package com.venttp.utils.logutil;


import com.venttp.utils.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtils {
    private static Logger logger = LogManager.getLogger("venttpLog");
    public static void trace(Object ...objects)
    {
        logger.trace(handleLog(objects));
    }
    public static void debug(Object ...objects) {
        logger.debug(handleLog(objects));
    }

    public static void info(Object ...objects) {
        logger.info(handleLog(objects));
    }

    public static void warn(Object ...objects) {
        logger.warn(handleLog(objects));
    }

    public static void error(Object ...objects) {

        logger.error(handleLog(objects));
    }

    public static void fatal(Object ...objects) {
        logger.fatal(handleLog(objects));
    }

    private static String handleLog(Object ...objects) {
        return StringUtils.handleString(objects);
    }
}
