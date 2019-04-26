package com.qianfeng.PO;


public class TbOrder {

  private String orderId;
  private String userId;
  private String phoneName;
  private String phoneImg;
  private long assessmentMoney;
  private String assessmentDescribe;
  private java.sql.Date orderTime;
  private String orderGetpayId;
  private String orderStute;
  private String getpayName;
  private String getpayAccount;
  private String contactId;
  private String lockId;


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getPhoneName() {
    return phoneName;
  }

  public void setPhoneName(String phoneName) {
    this.phoneName = phoneName;
  }


  public String getPhoneImg() {
    return phoneImg;
  }

  public void setPhoneImg(String phoneImg) {
    this.phoneImg = phoneImg;
  }


  public long getAssessmentMoney() {
    return assessmentMoney;
  }

  public void setAssessmentMoney(long assessmentMoney) {
    this.assessmentMoney = assessmentMoney;
  }


  public String getAssessmentDescribe() {
    return assessmentDescribe;
  }

  public void setAssessmentDescribe(String assessmentDescribe) {
    this.assessmentDescribe = assessmentDescribe;
  }


  public java.sql.Date getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Date orderTime) {
    this.orderTime = orderTime;
  }


  public String getOrderGetpayId() {
    return orderGetpayId;
  }

  public void setOrderGetpayId(String orderGetpayId) {
    this.orderGetpayId = orderGetpayId;
  }


  public String getOrderStute() {
    return orderStute;
  }

  public void setOrderStute(String orderStute) {
    this.orderStute = orderStute;
  }


  public String getGetpayName() {
    return getpayName;
  }

  public void setGetpayName(String getpayName) {
    this.getpayName = getpayName;
  }


  public String getGetpayAccount() {
    return getpayAccount;
  }

  public void setGetpayAccount(String getpayAccount) {
    this.getpayAccount = getpayAccount;
  }


  public String getContactId() {
    return contactId;
  }

  public void setContactId(String contactId) {
    this.contactId = contactId;
  }


  public String getLockId() {
    return lockId;
  }

  public void setLockId(String lockId) {
    this.lockId = lockId;
  }

}
