package com.venttp.utils.indexUtils;

import com.venttp.base.contains.VenttpContains;
import com.venttp.index.dto.UserCenterInfo;
import com.venttp.utils.RandomUtils;

import java.util.List;

public class HandleOnlineUser {

    private static List<UserCenterInfo> userOnlineList = UserOnlineList.getUserList();

    public static void addOnlineUser (UserCenterInfo userCenterInfo) {
        userOnlineList.add(userCenterInfo);
    }
    public static void delOnlineUser (UserCenterInfo onlineUser) {
        userOnlineList.remove(onlineUser);
    }
    public static UserCenterInfo findOnlineUser (UserCenterInfo userCenterInfo) {
        if (userOnlineList.size() < VenttpContains.ONLINE_PERS_COUNT) {
            //如果等待匹配人数不足，则将自己添加进去等待别人匹配到自己
            addOnlineUser(userCenterInfo);
            return userCenterInfo;
        }
        //如果不为空，则随机一个列表长度的下标用来匹配
        int index = RandomUtils.randomNum(userOnlineList.size());
        UserCenterInfo onlineUser = userOnlineList.get(index);
        userCenterInfo.setOnlinePers(onlineUser);
        //匹配成功之后删除匹配到的在线用户
        delOnlineUser(onlineUser);
        return userCenterInfo;
    }
}
