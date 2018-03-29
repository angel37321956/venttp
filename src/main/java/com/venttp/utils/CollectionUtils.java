package com.venttp.utils;

import java.util.Collection;

public class CollectionUtils {

    public static Boolean isNull (Collection<?> collection) {
        if (null == collection) {
            return true;
        }
        return false;
    }

    public static Boolean isNotNull (Collection<?> collection) {
        if (isNull(collection)) {
            return false;
        }
        return true;
    }
    public static Boolean isNotEmpty (Collection<?> collection) {
        if (isNull(collection) || collection.size() == 0) {
            return false;
        }
        return true;
    }

    public static Boolean isEmpty (Collection<?> collection) {
        if (isNotEmpty(collection)) {
            return false;
        }
        return true;
    }
}
