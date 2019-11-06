package me.zhengjie.modules.yueba.domain;

import java.util.Date;

public class GiftRecord {
    private Long id;

    private Long giftId;

    private Long giveGift;

    private Long reciveGift;

    private Date giveTime;

    private Integer giftNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGiftId() {
        return giftId;
    }

    public void setGiftId(Long giftId) {
        this.giftId = giftId;
    }

    public Long getGiveGift() {
        return giveGift;
    }

    public void setGiveGift(Long giveGift) {
        this.giveGift = giveGift;
    }

    public Long getReciveGift() {
        return reciveGift;
    }

    public void setReciveGift(Long reciveGift) {
        this.reciveGift = reciveGift;
    }

    public Date getGiveTime() {
        return giveTime;
    }

    public void setGiveTime(Date giveTime) {
        this.giveTime = giveTime;
    }

    public Integer getGiftNum() {
        return giftNum;
    }

    public void setGiftNum(Integer giftNum) {
        this.giftNum = giftNum;
    }
}