package com.firebird.hellcipe.model.dto;

import java.util.ArrayList;

public class RecipeDTO {
    private int rcpSeq;
    private String rcpNM;
    private String infoEng;
    private String infoCar;
    private String infoPro;
    private String infoFat;
    private String attFileNoMain;
    private String attFileNoMk;
    private String rcpPartsDtls;
    private ArrayList<String> manual;

    public RecipeDTO() {}
    
    public RecipeDTO(int recipeSeqNum, String rcpNM, String infoEng, String infoCar, String infoPro, String infoFat,
            String attFileNoMain, String attFileNoMk, String rcpPartsDtls, ArrayList<String> manual) {
        this.rcpSeq = recipeSeqNum;
        this.rcpNM = rcpNM;
        this.infoEng = infoEng;
        this.infoCar = infoCar;
        this.infoPro = infoPro;
        this.infoFat = infoFat;
        this.attFileNoMain = attFileNoMain;
        this.attFileNoMk = attFileNoMk;
        this.rcpPartsDtls = rcpPartsDtls;
        this.manual = manual;
    }

    public int getRcpSeq() {
        return rcpSeq;
    }

    public void setRcpSeq(int rcpSeq) {
        this.rcpSeq = rcpSeq;
    }

    public String getRcpNM() {
        return rcpNM;
    }
    public void setRcpNM(String rcpNM) {
        this.rcpNM = rcpNM;
    }
    public String getInfoEng() {
        return infoEng;
    }
    public void setInfoEng(String infoEng) {
        this.infoEng = infoEng;
    }
    public String getInfoCar() {
        return infoCar;
    }
    public void setInfoCar(String infoCar) {
        this.infoCar = infoCar;
    }
    public String getInfoPro() {
        return infoPro;
    }
    public void setInfoPro(String infoPro) {
        this.infoPro = infoPro;
    }
    public String getInfoFat() {
        return infoFat;
    }
    public void setInfoFat(String infoFat) {
        this.infoFat = infoFat;
    }
    public String getAttFileNoMain() {
        return attFileNoMain;
    }
    public void setAttFileNoMain(String attFileNoMain) {
        this.attFileNoMain = attFileNoMain;
    }
    public String getAttFileNoMk() {
        return attFileNoMk;
    }
    public void setAttFileNoMk(String attFileNoMk) {
        this.attFileNoMk = attFileNoMk;
    }
    public String getRcpPartsDtls() {
        return rcpPartsDtls;
    }
    public void setRcpPartsDtls(String rcpPartsDtls) {
        this.rcpPartsDtls = rcpPartsDtls;
    }
    public ArrayList<String> getManual() {
        return manual;
    }
    public void setManual(ArrayList<String> manual) {
        this.manual = manual;
    }
    
    
}
