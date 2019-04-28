package com.qianfeng.VO;

import com.qianfeng.PO.TbState;
import com.qianfeng.PO.TbStateParent;

import java.util.List;
import java.util.Map;

public class Price {

    private Map<TbStateParent, List<TbState>> propertyInfo;

    public Map<TbStateParent, List<TbState>> getPropertyInfo() {
        return propertyInfo;
    }

    public void setPropertyInfo(Map<TbStateParent, List<TbState>> propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    public Price() {
    }

    public Price(Map<TbStateParent, List<TbState>> propertyInfo) {
        this.propertyInfo = propertyInfo;
    }

    @Override
    public String toString() {
        return "PropertyInfo{" +
                "propertyInfo=" + propertyInfo +
                '}';
    }
}
