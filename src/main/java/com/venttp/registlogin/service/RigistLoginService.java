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
    Map<String, String> registUser (UserCenterInfo userCenterInfo) throws Exception;

    /**
     * 校验账号的唯一性
     * @param userCenterInfo
     * @return
     */
    Map<String, String> validAcconutOnly (UserCenterInfo userCenterInfo) throws Exception;

    /**
     * 用户登录
     * @param userCenterInfo
     * @return
     */
    Map<String, String> userLogin (UserCenterInfo userCenterInfo) throws Exception;

}
