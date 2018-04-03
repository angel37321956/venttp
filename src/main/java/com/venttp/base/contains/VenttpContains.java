package com.venttp.base.contains;

import com.venttp.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class VenttpContains {

    /**
     * 常用字段常量
     */
    //session保存用户账号信息键值
    public static final String LOGIN_SESSION_KEY = "userAccount";

    //返回结果标志
    public static final String RESULT_CODE = "resultCode";
    //返回消息标志
    public static final String RESULT_MSG = "resultMsg";
    //成功编码
    public static final String SUCCESS_FLAG = "1";
    //失败编码
    public static final String FAILED_FLAG = "0";

    /**
     * 注册返回常量
     */
    //注册成功消息
    public static final String RIGIST_SUCCESS_MSG = "注册成功";
    //注册失败消息
    public static final String RIGIST_FAILED_MSG = "注册失败";

    /**
     * 校验账号返回常量
     */
    //账号未使用消息
    public static final String VALID_ACCOUNT_SUCCESS_MSG = "该账号未使用";
    //账号已使用消息
    public static final String VALID_ACCOUNT_FAILED_MSG = "该账号已使用";

    /**
     * 登录信息返回常量
     */
    //登录成功消息
    public static final String LOGIN_SUCCESS_MSG = "登录成功";
    //登录失败消息
    public static final String LOGIN_FAILED_MSG = "登录失败";

    /**
     * 返回map结果集相关功能常量
     */
    //返回注册信息map标志
    public static final String REGIST_TYPE_FALG = "regist";
    //返回校验账号唯一性map标志
    public static final String  VALID_ACCOUNT_FLAG = "validAccount";
    //返回登录结果map标志
    public static final String LOGIN_FLAG = "login";

    /**
     * 跳转路径
     */
    //未登录跳转登录页面
    public static final String LOGIN_URL = "/html/registAndLogin/login.html";

    /**
     * 返回map通用方法
     * @param integer
     * @return
     */
    public static Map<String, String> getRegistResultMap (Integer integer, String type) {
        Map<String, String> resultMap = new HashMap<String, String>();
        if (StringUtils.isEquals(REGIST_TYPE_FALG, type)) {
            //注册标志，返回1则表示成功注册，则调用相应方法
            resultMap = integer == 1 ? getRegistSuccessMap(resultMap) : getRegistFailedMap(resultMap);
        }
        if (StringUtils.isEquals(VALID_ACCOUNT_FLAG, type)) {
            //校验账号是否已注册方法，0表示未注册，则调用相应的方法
            resultMap = integer == 0 ? getValidAccountSuccessMap(resultMap) : getValidAccountFailedMap(resultMap);
        }
        if (StringUtils.isEquals(LOGIN_FLAG, type)) {
            //返回登录结果,0表示登录失败，未注册
            resultMap = integer == 0 ? getLoginFailedMap(resultMap) : getLoginSuccessMap(resultMap);
        }
        return resultMap;
    }

    /**
     * 返回注册信息map结果集
     * @param resultMap
     * @return
     */
    private static Map<String, String> getRegistSuccessMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, SUCCESS_FLAG, RIGIST_SUCCESS_MSG);
        return resultMap;
    }
    private static Map<String, String> getRegistFailedMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, FAILED_FLAG, RIGIST_FAILED_MSG);
        return resultMap;
    }

    /**
     * 返回校验账号是否注册map结果集
     * @param resultMap
     * @return
     */
    private static Map<String, String> getValidAccountSuccessMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, SUCCESS_FLAG, VALID_ACCOUNT_SUCCESS_MSG);
        return resultMap;
    }
    private static Map<String, String> getValidAccountFailedMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, FAILED_FLAG, VALID_ACCOUNT_FAILED_MSG);
        return resultMap;
    }

    private static Map<String, String> getLoginSuccessMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, SUCCESS_FLAG, LOGIN_SUCCESS_MSG);
        return resultMap;
    }
    private static Map<String, String> getLoginFailedMap (Map<String, String> resultMap) {
        handleResultMap(resultMap, FAILED_FLAG, LOGIN_FAILED_MSG);
        return resultMap;
    }

    /**
     * map处理通用方法
     * @param map
     * @param flag
     * @param msg
     */
    private static void handleResultMap (Map<String, String> map, String flag, String msg) {
        map.put(RESULT_CODE, flag);
        map.put(RESULT_MSG, msg);
    }
}
