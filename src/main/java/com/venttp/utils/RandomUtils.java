package com.venttp.utils;

import java.util.Random;
import java.util.UUID;

public class RandomUtils {
    /**
     * 随机匹配在线人数使用
     * @param i
     * @return
     */
    public static int randomNum (int i) {
        return new Random().nextInt(i);
    }

    public static String getUUID () {
        String uuid = String.valueOf(UUID.randomUUID());
        return uuid;
    }
}
