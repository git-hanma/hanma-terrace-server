package com.terrace.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by 小妞 on 2019/7/16.
 */
public class TerraceVO {
    //员工主键
    private Long staffId;
    //员工姓名
    private String staffName;
    //员工手机号
    private String staffPhone;
    //员工密码
    private String staffPass;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date staffCreateTime;
    //修改时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date staffUpdateTime;
    //状态
    private Integer staffYn;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getStaffPass() {
        return staffPass;
    }

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass;
    }

    public Date getStaffCreateTime() {
        return staffCreateTime;
    }

    public void setStaffCreateTime(Date staffCreateTime) {
        this.staffCreateTime = staffCreateTime;
    }

    public Date getStaffUpdateTime() {
        return staffUpdateTime;
    }

    public void setStaffUpdateTime(Date staffUpdateTime) {
        this.staffUpdateTime = staffUpdateTime;
    }

    public Integer getStaffYn() {
        return staffYn;
    }

    public void setStaffYn(Integer staffYn) {
        this.staffYn = staffYn;
    }
}
