package me.zhengjie.modules.yueba.domain;

import java.util.Date;

public class VisitorRecord {
    private Long id;

    private Long vistorId;

    private Long userId;

    private Date vistorTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVistorId() {
        return vistorId;
    }

    public void setVistorId(Long vistorId) {
        this.vistorId = vistorId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getVistorTime() {
        return vistorTime;
    }

    public void setVistorTime(Date vistorTime) {
        this.vistorTime = vistorTime;
    }
}