package com.qianfeng.PO;


public class TbState {

  private String stateId;
  private String stateName;
  private String stateDescribe;
  private String stateParentId;
  private String stateAssessmentId;
  private String stateSelect;
  private Integer depreciationPrice;

  public Integer getDepreciationPrice() {
    return depreciationPrice;
  }

  public void setDepreciationPrice(Integer depreciationPrice) {
    this.depreciationPrice = depreciationPrice;
  }

  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }


  public String getStateName() {
    return stateName;
  }

  public void setStateName(String stateName) {
    this.stateName = stateName;
  }


  public String getStateDescribe() {
    return stateDescribe;
  }

  public void setStateDescribe(String stateDescribe) {
    this.stateDescribe = stateDescribe;
  }


  public String getStateParentId() {
    return stateParentId;
  }

  public void setStateParentId(String stateParentId) {
    this.stateParentId = stateParentId;
  }


  public String getStateAssessmentId() {
    return stateAssessmentId;
  }

  public void setStateAssessmentId(String stateAssessmentId) {
    this.stateAssessmentId = stateAssessmentId;
  }


  public String getStateSelect() {
    return stateSelect;
  }

  public void setStateSelect(String stateSelect) {
    this.stateSelect = stateSelect;
  }

}
