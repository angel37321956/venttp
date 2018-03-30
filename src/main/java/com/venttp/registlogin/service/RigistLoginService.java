package com.venttp.registlogin.service;

import com.venttp.index.dto.UserCenterInfo;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface RigistLoginService {

    /**
     * 用户注册
     * @param userCenterInfo
     * @return
     */
    Map<String, String> registUser (UserCenterInfo userCenterInfo);

}
