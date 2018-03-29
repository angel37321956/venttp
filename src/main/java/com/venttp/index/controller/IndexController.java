package com.venttp.index.controller;

import com.venttp.index.dto.UserCenterInfo;
import com.venttp.utils.indexUtils.HandleOnlineUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/indexCtrl")
public class IndexController {

    @ResponseBody
    @RequestMapping("/findPers")
    public UserCenterInfo login(@RequestBody UserCenterInfo userCenterInfo, HttpSession httpSession) {
        userCenterInfo.setUserId(userCenterInfo.getNickName());
        UserCenterInfo onlineUser = HandleOnlineUser.findOnlineUser(userCenterInfo);
        httpSession.setAttribute("userInfo", onlineUser);
        return onlineUser;
    }
}

