package com.graduate.project.entity;

public class Admin {
    private Integer adminid;

    private String adminpass;

    private String limits;

    public Admin(Integer adminid, String adminpass, String limits) {
        this.adminid = adminid;
        this.adminpass = adminpass;
        this.limits = limits;
    }

    public Admin() {
        super();
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    public String getAdminpass() {
        return adminpass;
    }

    public void setAdminpass(String adminpass) {
        this.adminpass = adminpass == null ? null : adminpass.trim();
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits == null ? null : limits.trim();
    }
}