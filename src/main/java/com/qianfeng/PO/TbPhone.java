package com.qianfeng.PO;


import java.util.List;

public class TbPhone {

  private String phoneId;
  private String phoneName;
  private long phonePrice;
  private String phoneImg;
  private String phoneBrandId;

  public List<TbStateParent> stateParentList;

  public List<TbStateParent> getStateParentList() {
    return stateParentList;
  }

  public void setStateParentList(List<TbStateParent> stateParentList) {
    this.stateParentList = stateParentList;
  }

  public String getPhoneId() {
    return phoneId;
  }

  public void setPhoneId(String phoneId) {
    this.phoneId = phoneId;
  }


  public String getPhoneName() {
    return phoneName;
  }

  public void setPhoneName(String phoneName) {
    this.phoneName = phoneName;
  }


  public long getPhonePrice() {
    return phonePrice;
  }

  public void setPhonePrice(long phonePrice) {
    this.phonePrice = phonePrice;
  }


  public String getPhoneImg() {
    return phoneImg;
  }

  public void setPhoneImg(String phoneImg) {
    this.phoneImg = phoneImg;
  }


  public String getPhoneBrandId() {
    return phoneBrandId;
  }

  public void setPhoneBrandId(String phoneBrandId) {
    this.phoneBrandId = phoneBrandId;
  }

}
