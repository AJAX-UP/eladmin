package me.zhengjie.modules.yueba.domain;

import java.util.Date;

public class Message {
    private Long id;

    private Long sendUser;

    private Long reciveUser;

    private String type;

    private Double vedio;

    private Date sendTime;

    private String context;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSendUser() {
        return sendUser;
    }

    public void setSendUser(Long sendUser) {
        this.sendUser = sendUser;
    }

    public Long getReciveUser() {
        return reciveUser;
    }

    public void setReciveUser(Long reciveUser) {
        this.reciveUser = reciveUser;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Double getVedio() {
        return vedio;
    }

    public void setVedio(Double vedio) {
        this.vedio = vedio;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}