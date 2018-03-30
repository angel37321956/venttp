package com.venttp.registlogin.controller;

import com.venttp.index.dto.UserCenterInfo;
import com.venttp.registlogin.service.RigistLoginService;
import com.venttp.registlogin.service.impl.RigistLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return rigistLoginService.registUser(userCenterInfo);
    }
}
