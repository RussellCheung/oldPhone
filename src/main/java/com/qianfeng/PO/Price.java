package com.qianfeng.PO;

import java.util.Objects;

public class Price {

        //手机id
        private String gid;
        //单选
        private String property_ids;
        //多选
        private String desc_ids;
        //配件多选
        private String pj_ids;

        public String getGid() {
            return gid;
        }

        public void setGid(String gid) {
            this.gid = gid;
        }

        public String getProperty_ids() {
            return property_ids;
        }

        public void setProperty_ids(String property_ids) {
            this.property_ids = property_ids;
        }

        public String getDesc_ids() {
            return desc_ids;
        }

        public void setDesc_ids(String desc_ids) {
            this.desc_ids = desc_ids;
        }

        public String getPj_ids() {
            return pj_ids;
        }

        public void setPj_ids(String pj_ids) {
            this.pj_ids = pj_ids;
        }

        public Price() {
        }

        public Price(String gid, String property_ids, String desc_ids, String pj_ids) {
            this.gid = gid;
            this.property_ids = property_ids;
            this.desc_ids = desc_ids;
            this.pj_ids = pj_ids;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Price that = (Price) o;
            return Objects.equals(gid, that.gid) &&
                    Objects.equals(property_ids, that.property_ids) &&
                    Objects.equals(desc_ids, that.desc_ids) &&
                    Objects.equals(pj_ids, that.pj_ids);
        }

        @Override
        public int hashCode() {
            return Objects.hash(gid, property_ids, desc_ids, pj_ids);
        }

        @Override
        public String toString() {
            return "PageAllPrice{" +
                    "gid='" + gid + '\'' +
                    ", property_ids='" + property_ids + '\'' +
                    ", desc_ids='" + desc_ids + '\'' +
                    ", pj_ids='" + pj_ids + '\'' +
                    '}';
        }


}
