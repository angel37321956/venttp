package com.venttp.utils;

import java.util.Random;

public class RandomUtils {
    public static int randomNum (int i) {
        return new Random().nextInt(i);
    }
}
