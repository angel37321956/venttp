package com.venttp.utils.indexUtils;

import com.venttp.index.dto.UserCenterInfo;

import java.util.ArrayList;
import java.util.List;

public class UserOnlineList {
    private static List<UserCenterInfo> userList;

    private UserOnlineList() {
    }

    public static List<UserCenterInfo> getUserList() {
        if (null == userList) {
            userList = new ArrayList<UserCenterInfo>();
        }
        return userList;
    }
}
