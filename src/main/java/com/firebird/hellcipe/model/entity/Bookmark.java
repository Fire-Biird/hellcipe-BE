package com.firebird.hellcipe.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bookmark")
    private int userId;
    private String rcpSeq;

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

}
