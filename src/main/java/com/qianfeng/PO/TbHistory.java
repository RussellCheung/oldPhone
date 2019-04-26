package com.qianfeng.PO;


public class TbHistory {

  private String historyId;
  private String historyId1;
  private long historyPrice;
  private java.sql.Date historyTime;


  public String gethistoryId() {
    return historyId;
  }

  public void sethistoryId(String historyId1) {
    this.historyId = historyId1;
  }


  public String gethistoryId1() {
    return historyId1;
  }

  public void sethistoryId1(String historyId1) {
    this.historyId1 = historyId1;
  }


  public long getHistoryPrice() {
    return historyPrice;
  }

  public void setHistoryPrice(long historyPrice) {
    this.historyPrice = historyPrice;
  }


  public java.sql.Date getHistoryTime() {
    return historyTime;
  }

  public void setHistoryTime(java.sql.Date historyTime) {
    this.historyTime = historyTime;
  }

}
