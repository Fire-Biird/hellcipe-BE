package com.firebird.hellcipe.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Bookmark {

    @Column(name = "Bookmark")
    private int userId;
    private int rcpSeq;

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

}
