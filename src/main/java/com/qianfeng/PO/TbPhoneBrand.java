package com.qianfeng.PO;


public class TbPhoneBrand {

  private String brandId;
  private String brandName;
  private String typeId;
  private String reserved;

  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }

  public void setReserved(String reserved) {
    this.reserved = reserved;
  }

  public String getBrandId() {
    return brandId;
  }

  public String getBrandName() {
    return brandName;
  }

  public String getTypeId() {
    return typeId;
  }

  public String getReserved() {
    return reserved;
  }
}
