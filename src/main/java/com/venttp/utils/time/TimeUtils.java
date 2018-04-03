package com.venttp.utils.time;

import java.util.Date;

public class TimeUtils {

    public static Date getSysdate () {
        Date date = new Date(System.currentTimeMillis());
        return date;
    }

    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
    }
}
