package com.venttp.utils.time;

import java.util.Date;

public class TimeUtils {

    /**
     * 获取当前时间
     * @return
     */
    public static Date getSysdate () {
        Date date = new Date(System.currentTimeMillis());
        return date;
    }

}
