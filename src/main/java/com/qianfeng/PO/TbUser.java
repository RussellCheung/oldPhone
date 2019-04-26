package com.qianfeng.PO;


public class TbUser {

  private String userId;
  private String userTele;
  private String userPassword;
  private long userMoney;
  private long freezeTransient;
  private long freezeCash;
  private String payPassword;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserTele() {
    return userTele;
  }

  public void setUserTele(String userTele) {
    this.userTele = userTele;
  }


  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }


  public long getUserMoney() {
    return userMoney;
  }

  public void setUserMoney(long userMoney) {
    this.userMoney = userMoney;
  }


  public long getFreezeTransient() {
    return freezeTransient;
  }

  public void setFreezeTransient(long freezeTransient) {
    this.freezeTransient = freezeTransient;
  }


  public long getFreezeCash() {
    return freezeCash;
  }

  public void setFreezeCash(long freezeCash) {
    this.freezeCash = freezeCash;
  }


  public String getPayPassword() {
    return payPassword;
  }

  public void setPayPassword(String payPassword) {
    this.payPassword = payPassword;
  }

}
