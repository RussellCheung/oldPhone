package com.qianfeng.PO;


import java.util.List;

public class TbStateParent {

  private String parentId;
  private String parentName;
  private String reserved;

  public List<TbState> stateList;


  public List<TbState> getStateList() {
    return stateList;
  }

  public void setStateList(List<TbState> stateList) {
    this.stateList = stateList;
  }



  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  public String getParentName() {
    return parentName;
  }

  public void setParentName(String parentName) {
    this.parentName = parentName;
  }


  public String getReserved() {
    return reserved;
  }

  public void setReserved(String reserved) {
    this.reserved = reserved;
  }

}
