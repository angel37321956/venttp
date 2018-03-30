package com.venttp.index.dto;

import com.venttp.base.dto.AccountInfoDTO;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.Objects;

public class UserCenterInfo extends AccountInfoDTO {

    //昵称
    private String nickName;

    //中文姓名
    private String chineseName;

    //英文姓名
    private String englishName;

    //年龄
    private Integer userAge;

    //地址
    private String userAddress;

    //邮编
    private String userPostalCode;

    //出生日期
    private Date birthday;

    //userId
    private String userId;

    //配对在线用户
    private UserCenterInfo onlinePers;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPostalCode() {
        return userPostalCode;
    }

    public void setUserPostalCode(String userPostalCode) {
        this.userPostalCode = userPostalCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserCenterInfo getOnlinePers() {
        return onlinePers;
    }

    public void setOnlinePers(UserCenterInfo onlinePers) {
        this.onlinePers = onlinePers;
    }
}
