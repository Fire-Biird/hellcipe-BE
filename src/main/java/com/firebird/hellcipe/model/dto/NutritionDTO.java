package com.firebird.hellcipe.model.dto;

import java.util.Date;

public class NutritionDTO {
    private int userId;
    private String rcpSeq;
    private Date nutritionDate;

    public NutritionDTO() {}

    public NutritionDTO(int userId, String rcpSeq, Date nutritionDate) {
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
    public String getRcpSeq() {
        return rcpSeq;
    }
    public void setRcpSeq(String rcpSeq) {
        this.rcpSeq = rcpSeq;
    }
    public Date getNutritionDate() {
        return nutritionDate;
    }
    public void setNutritionDate(Date nutritionDate) {
        this.nutritionDate = nutritionDate;
    }

    
}
