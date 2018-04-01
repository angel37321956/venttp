package com.venttp.registlogin.service.impl;

import com.venttp.base.contains.VenttpContains;
import com.venttp.index.dto.UserCenterInfo;
import com.venttp.registlogin.dao.RigistLoginDao;
import com.venttp.registlogin.service.RigistLoginService;
import com.venttp.utils.StringUtils;
import com.venttp.utils.logutil.LogUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Integer integer = 0;
        try {
            if (!validRegist(userCenterInfo)) {
                //校验账号是否被使用，被使用则返回注册失败map结果集
                VenttpContains.getRegistResultMap(integer, VenttpContains.REGIST_TYPE_FALG);
            }
            userCenterInfo.setCreateBy(userCenterInfo.getUserAccount());
            userCenterInfo.setUpdateBy(userCenterInfo.getUserAccount());
            integer = rigistLoginDao.registUser(userCenterInfo);
        } catch (Exception e) {
            LogUtils.error("用户注册异常信息:" + e);
        }
        return VenttpContains.getRegistResultMap(integer, VenttpContains.REGIST_TYPE_FALG);
    }

    /**
     * 注册校验
     * @param userCenterInfo
     * @return
     */
    private Boolean validRegist (UserCenterInfo userCenterInfo) {
        Boolean result = true;
        if (StringUtils.isEquals(VenttpContains.FAILED_FLAG, validAcconutOnly(userCenterInfo).get(VenttpContains.RESULT_CODE))){
            //校验账号是否被使用，被使用则返回false
            result = false;
        }
        return result;
    }

    /**
     * 校验账号是否已被注册
     * @param userCenterInfo
     * @return
     */
    @Override
    public Map<String, String> validAcconutOnly(UserCenterInfo userCenterInfo) {
        Integer integer = rigistLoginDao.validAcconutOnly(userCenterInfo);
        return VenttpContains.getRegistResultMap(integer, VenttpContains.VALID_ACCOUNT_FLAG);
    }
}
