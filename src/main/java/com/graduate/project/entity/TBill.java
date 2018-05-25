package com.graduate.project.entity;

public class TBill {
    Integer tbillid;
    Integer deskId;
    String tbillremark;

    public Integer getTbillid() {
        return tbillid;
    }

    public void setTbillid(Integer tbillid) {
        this.tbillid = tbillid;
    }

    public Integer getDeskId() {
        return deskId;
    }

    public void setDeskId(Integer deskId) {
        this.deskId = deskId;
    }

    public String getTbillremark() {
        return tbillremark;
    }

    public void setTbillremark(String tbillremark) {
        this.tbillremark = tbillremark;
    }

    @Override
    public String toString() {
        return "TBill{" +
                "tbillid=" + tbillid +
                ", deskId=" + deskId +
                ", tbillremark='" + tbillremark + '\'' +
                '}';
    }
}
