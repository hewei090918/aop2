package com.aop.domain;

import java.util.Date;

public class PlaneModel {
    private Integer id;

    private String model;

    private Integer saloonSeatMaximum;

    private Integer businessSeatMaximum;

    private Integer economySeatMaximum;

    private Long voyage;

    private Date gmtCreate;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Integer getSaloonSeatMaximum() {
        return saloonSeatMaximum;
    }

    public void setSaloonSeatMaximum(Integer saloonSeatMaximum) {
        this.saloonSeatMaximum = saloonSeatMaximum;
    }

    public Integer getBusinessSeatMaximum() {
        return businessSeatMaximum;
    }

    public void setBusinessSeatMaximum(Integer businessSeatMaximum) {
        this.businessSeatMaximum = businessSeatMaximum;
    }

    public Integer getEconomySeatMaximum() {
        return economySeatMaximum;
    }

    public void setEconomySeatMaximum(Integer economySeatMaximum) {
        this.economySeatMaximum = economySeatMaximum;
    }

    public Long getVoyage() {
        return voyage;
    }

    public void setVoyage(Long voyage) {
        this.voyage = voyage;
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