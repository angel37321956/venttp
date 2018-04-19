package com.venttp.registlogin.controller;

import com.venttp.base.contains.VenttpContains;
import com.venttp.index.dto.UserCenterInfo;
import com.venttp.registlogin.service.RigistLoginService;
import com.venttp.utils.StringUtils;
import com.venttp.utils.logutil.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
            LogUtils.error("用户注册异常信息:", e);
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
    public Map<String, String> userLogin (@RequestBody UserCenterInfo userCenterInfo, HttpServletRequest httpServletRequest) {
        Map<String, String> resulMap = new HashMap<String, String>();
        try {
            resulMap = rigistLoginService.userLogin(userCenterInfo);
        } catch (Exception e) {
            LogUtils.error("用户登录异常,异常信息:", e);
        }
        //如果登录成功，将用户信息保存到session中
        if (StringUtils.isEquals(VenttpContains.SUCCESS_FLAG ,resulMap.get(VenttpContains.RESULT_CODE))){
            HttpSession session = httpServletRequest.getSession(Boolean.TRUE);
            session.setAttribute(VenttpContains.LOGIN_SESSION_KEY, userCenterInfo.getUserAccount());
        }
        return resulMap;
    }
}
