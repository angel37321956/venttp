package com.venttp.registlogin.controller;

import com.venttp.index.dto.UserCenterInfo;
import com.venttp.registlogin.service.RigistLoginService;
import com.venttp.registlogin.service.impl.RigistLoginServiceImpl;
import com.venttp.utils.logutil.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/registLogin")
public class RigistLoginController {

    @Autowired
    private RigistLoginService rigistLoginService;
    
    /**
     * 用户注册
     * @param userCenterInfo
     * @return
     */
    @ResponseBody
    @RequestMapping("/registUser")
    public Map<String, String> registUser (@RequestBody UserCenterInfo userCenterInfo) {
        Map<String, String> resulMap = new HashMap<String, String>();
        try {
            resulMap = rigistLoginService.registUser(userCenterInfo);
        } catch (Exception e) {
            LogUtils.error("用户注册异常信息:" + e);
        }
        return resulMap;
    }

    /**
     * 用户登录
     * @param userCenterInfo
     * @return
     */
    @ResponseBody
    @RequestMapping("/userLogin")
    public Map<String, String> userLogin (@RequestBody UserCenterInfo userCenterInfo) {
        Map<String, String> resulMap = new HashMap<String, String>();
        try {
            resulMap = rigistLoginService.userLogin(userCenterInfo);
        } catch (Exception e) {
            LogUtils.error("用户登录异常,异常信息:" + e);
        }
        return resulMap;
    }
}
