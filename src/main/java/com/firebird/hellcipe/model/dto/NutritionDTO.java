package com.firebird.hellcipe.model.dto;

import java.util.Date;

public class NutritionDTO {
    private int userId;
    private int rcpSeq;
    private Date nutritionDate;

    public NutritionDTO() {}

    public NutritionDTO(int userId, int rcpSeq, Date nutritionDate) {
        this.userId = userId;
        this.rcpSeq = rcpSeq;
        this.nutritionDate = nutritionDate;
    }
    
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
