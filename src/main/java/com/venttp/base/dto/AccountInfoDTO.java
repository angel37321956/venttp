package com.venttp.base.dto;

public class AccountInfoDTO extends Venttpuid {

    //用户编码
    private String userCode;

    //用户IP地址
    private String userIP;

    //用户等级
    private String userLevel;

    //用户账号
    private String userAccount;

    //用户密码
    private String userPassWord;

    //用户名
    private String UserName;

    //手机
    private String phoneNum;

    //邮箱
    private String eMain;

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    public String getUserIP() {
        return userIP;
    }

    public void setUserIP(String userIP) {
        this.userIP = userIP;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String geteMain() {
        return eMain;
    }

    public void seteMain(String eMain) {
        this.eMain = eMain;
    }
}
