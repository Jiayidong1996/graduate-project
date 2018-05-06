package com.graduate.project.entity;

import java.util.Date;

public class Department {
    private Integer departmentid;

    private String departmentname;

    private Date establisheddate;

    private Integer departmentpernum;

    private String departmentmanager;

    public Department(Integer departmentid, String departmentname, Date establisheddate, Integer departmentpernum, String departmentmanager) {
        this.departmentid = departmentid;
        this.departmentname = departmentname;
        this.establisheddate = establisheddate;
        this.departmentpernum = departmentpernum;
        this.departmentmanager = departmentmanager;
    }

    public Department() {
        super();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public Date getEstablisheddate() {
        return establisheddate;
    }

    public void setEstablisheddate(Date establisheddate) {
        this.establisheddate = establisheddate;
    }

    public Integer getDepartmentpernum() {
        return departmentpernum;
    }

    public void setDepartmentpernum(Integer departmentpernum) {
        this.departmentpernum = departmentpernum;
    }

    public String getDepartmentmanager() {
        return departmentmanager;
    }

    public void setDepartmentmanager(String departmentmanager) {
        this.departmentmanager = departmentmanager == null ? null : departmentmanager.trim();
    }
}