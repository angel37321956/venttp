package com.venttp.base.contains;

import java.util.HashMap;
import java.util.Map;

public class VenttpContains {
    //返回结果标志
    public static final String RESULT_CODE = "resultCode";
    //返回消息标志
    public static final String RESULT_MSG = "resultMsg";

    //注册成功编码
    public static final String RIGIST_SUCCESS_FLAG = "1";
    //注册失败编码
    public static final String RIGIST_FAILED_FLAG = "0";
    //注册成功消息
    public static final String RIGIST_SUCCESS_MSG = "注册成功";
    //注册失败消息
    public static final String RIGIST_FAILED_MSG = "注册失败";
    public static Map<String, String> getRegistResultMap (Integer integer) {
        Map<String, String> resultMap = new HashMap<String, String>();
        return integer == 1 ? getRegistSuccessMap(resultMap) : getRegistFailedMap(resultMap);
    }
    private static Map<String, String> getRegistSuccessMap (Map<String, String> resultMap) {
        resultMap.put(RESULT_CODE, RIGIST_SUCCESS_FLAG);
        resultMap.put(RESULT_MSG, RIGIST_SUCCESS_MSG);
        return resultMap;
    }
    private static Map<String, String> getRegistFailedMap (Map<String, String> resultMap) {
        resultMap.put(RESULT_CODE, RIGIST_FAILED_FLAG);
        resultMap.put(RESULT_MSG, RIGIST_FAILED_MSG);
        return resultMap;
    }
}
