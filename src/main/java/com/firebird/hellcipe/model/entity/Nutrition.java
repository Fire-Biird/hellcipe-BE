package com.firebird.hellcipe.model.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Nutrition {

    private int userId;
    private int rcpSeq;
    
    // sql 문 말고 자바 코드에서 default로 today 넣기
    private Date nutritionDate;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getRcpSeq() {
        return rcpSeq;
    }
    public void setRcpSeq(int rcpSeq) {
        this.rcpSeq = rcpSeq;
    }
    public Date getNutritionDate() {
        return nutritionDate;
    }
    public void setNutritionDate(Date nutritionDate) {
        this.nutritionDate = nutritionDate;
    }

}
