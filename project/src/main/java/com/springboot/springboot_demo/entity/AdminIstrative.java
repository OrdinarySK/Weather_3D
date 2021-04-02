package com.springboot.springboot_demo.entity;

public class AdminIstrative {
    /**
     * id
     */
    private Integer id;

    /**
     * 行政区划编码
     */
    private String gbcode;

    /**
     * 行政区划名称
     */
    private String cname;

    /**
     * 行政区划级别
     */
    private String xlevel;

    /**
     * 中心点x坐标
     */
    private Double centerx;

    /**
     * 中心点y坐标
     */
    private Double centery;

    /**
     * 地图级别
     */
    private String maplevel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGbcode() {
        return gbcode;
    }

    public void setGbcode(String gbcode) {
        this.gbcode = gbcode;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getXlevel() {
        return xlevel;
    }

    public void setXlevel(String xlevel) {
        this.xlevel = xlevel;
    }

    public Double getCenterx() {
        return centerx;
    }

    public void setCenterx(Double centerx) {
        this.centerx = centerx;
    }

    public Double getCentery() {
        return centery;
    }

    public void setCentery(Double centery) {
        this.centery = centery;
    }

    public String getMaplevel() {
        return maplevel;
    }

    public void setMaplevel(String maplevel) {
        this.maplevel = maplevel;
    }
}