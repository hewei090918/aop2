package com.aop.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Flight {
    private Integer id;

    private Integer schedularId;

    private Date fromDate;

    private Integer saloonSeatLeft;

    private Integer businessSeatLeft;

    private Integer economySeatLeft;

    private BigDecimal discount;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSchedularId() {
        return schedularId;
    }

    public void setSchedularId(Integer schedularId) {
        this.schedularId = schedularId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Integer getSaloonSeatLeft() {
        return saloonSeatLeft;
    }

    public void setSaloonSeatLeft(Integer saloonSeatLeft) {
        this.saloonSeatLeft = saloonSeatLeft;
    }

    public Integer getBusinessSeatLeft() {
        return businessSeatLeft;
    }

    public void setBusinessSeatLeft(Integer businessSeatLeft) {
        this.businessSeatLeft = businessSeatLeft;
    }

    public Integer getEconomySeatLeft() {
        return economySeatLeft;
    }

    public void setEconomySeatLeft(Integer economySeatLeft) {
        this.economySeatLeft = economySeatLeft;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}