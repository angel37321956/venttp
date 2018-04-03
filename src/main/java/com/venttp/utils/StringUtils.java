package com.venttp.utils;

public class StringUtils {

    public static Boolean isEquals (String str1, String str2) {
        if (isEmpty(str1) || isEmpty(str2)) {
            return false;
        }
        if (!str1.equals(str2)) {
            return false;
        }
        return true;
    }

    public static Boolean isNotEquals (String str1, String str2) {
        if (isEquals(str1, str2)) {
            return false;
        }
        return true;
    }

    public static Boolean isNull (String str) {
        if (null == str) {
            return true;
        }
        return false;
    }

    public static Boolean isNotNull (String str) {
        if (isNull(str)) {
            return false;
        }
        return true;
    }

    public  static  Boolean isEmpty (String str) {
        if (isNull(str)) {
            return true;
        }
        if ("".equals(str)) {
            return true;
        }
        return false;
    }

    public static Boolean isNotEmpty (String str) {
        if (isEmpty(str)) {
            return false;
        }
        return true;
    }
}
