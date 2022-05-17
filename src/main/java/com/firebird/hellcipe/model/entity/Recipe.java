package com.firebird.hellcipe.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Recipe {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rcpSeq;
    
    private String rcpNM;
    private String infoEng;
    private String infoCar;
    private String infoPro;
    private String infoFat;
    private String attFileNoMain;
    private String attFileNoMk;
    private String rcpPartsDtls;
    private String manual01;
    private String manual02;
    private String manual03;
    private String manual04;
    private String manual05;
    private String manual06;
    private String manual07;
    private String manual08;
    private String manual09;
    private String manual10;
    private String manual11;
    private String manual12;
    private String manual13;
    private String manual14;
    private String manual15;
    private String manual16;
    private String manual17;
    private String manual18;
    private String manual19;
    private String manual20;

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
    public String getManual01() {
        return manual01;
    }
    public void setManual01(String manual01) {
        this.manual01 = manual01;
    }
    public String getManual02() {
        return manual02;
    }
    public void setManual02(String manual02) {
        this.manual02 = manual02;
    }
    public String getManual03() {
        return manual03;
    }
    public void setManual03(String manual03) {
        this.manual03 = manual03;
    }
    public String getManual04() {
        return manual04;
    }
    public void setManual04(String manual04) {
        this.manual04 = manual04;
    }
    public String getManual05() {
        return manual05;
    }
    public void setManual05(String manual05) {
        this.manual05 = manual05;
    }
    public String getManual06() {
        return manual06;
    }
    public void setManual06(String manual06) {
        this.manual06 = manual06;
    }
    public String getManual07() {
        return manual07;
    }
    public void setManual07(String manual07) {
        this.manual07 = manual07;
    }
    public String getManual08() {
        return manual08;
    }
    public void setManual08(String manual08) {
        this.manual08 = manual08;
    }
    public String getManual09() {
        return manual09;
    }
    public void setManual09(String manual09) {
        this.manual09 = manual09;
    }
    public String getManual10() {
        return manual10;
    }
    public void setManual10(String manual10) {
        this.manual10 = manual10;
    }
    public String getManual11() {
        return manual11;
    }
    public void setManual11(String manual11) {
        this.manual11 = manual11;
    }
    public String getManual12() {
        return manual12;
    }
    public void setManual12(String manual12) {
        this.manual12 = manual12;
    }
    public String getManual13() {
        return manual13;
    }
    public void setManual13(String manual13) {
        this.manual13 = manual13;
    }
    public String getManual14() {
        return manual14;
    }
    public void setManual14(String manual14) {
        this.manual14 = manual14;
    }
    public String getManual15() {
        return manual15;
    }
    public void setManual15(String manual15) {
        this.manual15 = manual15;
    }
    public String getManual16() {
        return manual16;
    }
    public void setManual16(String manual16) {
        this.manual16 = manual16;
    }
    public String getManual17() {
        return manual17;
    }
    public void setManual17(String manual17) {
        this.manual17 = manual17;
    }
    public String getManual18() {
        return manual18;
    }
    public void setManual18(String manual18) {
        this.manual18 = manual18;
    }
    public String getManual19() {
        return manual19;
    }
    public void setManual19(String manual19) {
        this.manual19 = manual19;
    }
    public String getManual20() {
        return manual20;
    }
    public void setManual20(String manual20) {
        this.manual20 = manual20;
    }

    
}
