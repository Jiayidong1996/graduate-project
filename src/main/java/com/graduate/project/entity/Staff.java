package com.graduate.project.entity;

import java.math.BigDecimal;

public class Staff {
    private Integer staffid;

    private String staffname;

    private String stafftitle;

    private BigDecimal staffsalary;

    private String staffaddress;

    private String staffpassword;

    private String staffdepartment;

    private String staffmail;

    private String staffphone;

    public Staff(Integer staffid, String staffname, String stafftitle, BigDecimal staffsalary, String staffaddress, String staffpassword, String staffdepartment, String staffmail, String staffphone) {
        this.staffid = staffid;
        this.staffname = staffname;
        this.stafftitle = stafftitle;
        this.staffsalary = staffsalary;
        this.staffaddress = staffaddress;
        this.staffpassword = staffpassword;
        this.staffdepartment = staffdepartment;
        this.staffmail = staffmail;
        this.staffphone = staffphone;
    }

    public Staff() {
        super();
    }

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getStafftitle() {
        return stafftitle;
    }

    public void setStafftitle(String stafftitle) {
        this.stafftitle = stafftitle == null ? null : stafftitle.trim();
    }

    public BigDecimal getStaffsalary() {
        return staffsalary;
    }

    public void setStaffsalary(BigDecimal staffsalary) {
        this.staffsalary = staffsalary;
    }

    public String getStaffaddress() {
        return staffaddress;
    }

    public void setStaffaddress(String staffaddress) {
        this.staffaddress = staffaddress == null ? null : staffaddress.trim();
    }

    public String getStaffpassword() {
        return staffpassword;
    }

    public void setStaffpassword(String staffpassword) {
        this.staffpassword = staffpassword == null ? null : staffpassword.trim();
    }

    public String getStaffdepartment() {
        return staffdepartment;
    }

    public void setStaffdepartment(String staffdepartment) {
        this.staffdepartment = staffdepartment == null ? null : staffdepartment.trim();
    }

    public String getStaffmail() {
        return staffmail;
    }

    public void setStaffmail(String staffmail) {
        this.staffmail = staffmail == null ? null : staffmail.trim();
    }

    public String getStaffphone() {
        return staffphone;
    }

    public void setStaffphone(String staffphone) {
        this.staffphone = staffphone == null ? null : staffphone.trim();
    }
}