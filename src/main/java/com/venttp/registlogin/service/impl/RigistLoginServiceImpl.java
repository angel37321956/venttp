package com.venttp.registlogin.service.impl;

import com.venttp.base.contains.VenttpContains;
import com.venttp.index.dto.UserCenterInfo;
import com.venttp.registlogin.dao.RigistLoginDao;
import com.venttp.registlogin.service.RigistLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@Service
public class RigistLoginServiceImpl implements RigistLoginService {

    @Autowired
    private RigistLoginDao rigistLoginDao;

    /**
     * 用户注册
     * @param userCenterInfo
     * @return
     */
    @Override
    public Map<String, String> registUser(UserCenterInfo userCenterInfo) {
        Integer integer = 1;
        try {
            userCenterInfo.setCreateBy(userCenterInfo.getUserAccount());
            userCenterInfo.setUpdateBy(userCenterInfo.getUserAccount());
            integer = rigistLoginDao.registUser(userCenterInfo);
        } catch (Exception e) {
            integer = 0;
            System.out.println(e);
        }
        return VenttpContains.getRegistResultMap(integer);
    }
}
