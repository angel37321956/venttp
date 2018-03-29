package com.venttp.utils.indexUtils;

import com.venttp.index.dto.UserCenterInfo;
import com.venttp.utils.CollectionUtils;
import com.venttp.utils.RandomUtils;

import java.util.List;

public class HandleOnlineUser {

    private static List<UserCenterInfo> userOnlineList = UserOnlineList.getUserList();

    public static void addOnlineUser (UserCenterInfo userCenterInfo) {
        userOnlineList.add(userCenterInfo);
    }
    public static void delOnlineUser (int index) {
        userOnlineList.remove(index);
    }
    public static UserCenterInfo findOnlineUser (UserCenterInfo userCenterInfo) {
        if (CollectionUtils.isEmpty(userOnlineList)) {
            addOnlineUser(userCenterInfo);
            return userCenterInfo;
        }
        int index = RandomUtils.randomNum(userOnlineList.size());
        UserCenterInfo onlineUser = userOnlineList.get(index);
        if (onlineUser.getNickName().equals(userCenterInfo.getNickName())) {
                return userCenterInfo;
        }
        userCenterInfo.setOnlinePers(onlineUser);
        delOnlineUser(index);
        return userCenterInfo;
    }
}
