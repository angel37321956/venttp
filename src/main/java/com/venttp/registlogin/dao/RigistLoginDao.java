package com.venttp.registlogin.dao;

import com.venttp.index.dto.UserCenterInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface RigistLoginDao {
    /**
     * 用户注册
     * @param userCenterInfo
     * @return
     */
    Integer registUser (UserCenterInfo userCenterInfo);

    /**
     * 验证用户名是否已使用
     * @param centerInfo
     * @return
     */
   Integer validAcconutOnly (UserCenterInfo centerInfo);
}
