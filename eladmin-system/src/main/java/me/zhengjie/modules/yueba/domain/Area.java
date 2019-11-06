package me.zhengjie.modules.yueba.domain;

public class Area {
    private Integer areaId;

    private Integer areaPid;

    private String areaName;

    private Integer areaDepth;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getAreaPid() {
        return areaPid;
    }

    public void setAreaPid(Integer areaPid) {
        this.areaPid = areaPid;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Integer getAreaDepth() {
        return areaDepth;
    }

    public void setAreaDepth(Integer areaDepth) {
        this.areaDepth = areaDepth;
    }
}