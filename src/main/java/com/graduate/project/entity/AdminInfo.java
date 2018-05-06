package com.graduate.project.entity;

public class AdminInfo {
    private Integer adminid;

    private String adminpass;

    private String adminname;

    private String truename;

    private Integer adminphone;

    private String adminmail;

    private String adminaddress;

    private Integer adminsalary;

    private String limits;

    public AdminInfo(Integer adminid, String adminpass, String adminname, String truename, Integer adminphone, String adminmail, String adminaddress, Integer adminsalary, String limits) {
        this.adminid = adminid;
        this.adminpass = adminpass;
        this.adminname = adminname;
        this.truename = truename;
        this.adminphone = adminphone;
        this.adminmail = adminmail;
        this.adminaddress = adminaddress;
        this.adminsalary = adminsalary;
        this.limits = limits;
    }

    public AdminInfo() {
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

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public Integer getAdminphone() {
        return adminphone;
    }

    public void setAdminphone(Integer adminphone) {
        this.adminphone = adminphone;
    }

    public String getAdminmail() {
        return adminmail;
    }

    public void setAdminmail(String adminmail) {
        this.adminmail = adminmail == null ? null : adminmail.trim();
    }

    public String getAdminaddress() {
        return adminaddress;
    }

    public void setAdminaddress(String adminaddress) {
        this.adminaddress = adminaddress == null ? null : adminaddress.trim();
    }

    public Integer getAdminsalary() {
        return adminsalary;
    }

    public void setAdminsalary(Integer adminsalary) {
        this.adminsalary = adminsalary;
    }

    public String getLimits() {
        return limits;
    }

    public void setLimits(String limits) {
        this.limits = limits == null ? null : limits.trim();
    }
}