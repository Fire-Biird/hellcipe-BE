package com.firebird.hellcipe.model.dto;

public class BookmarkDTO {
    private int userId;
    private String rcpSeq;

    public BookmarkDTO() {}

    public BookmarkDTO(int userId, String rcpSeq) {
        this.userId = userId;
        this.rcpSeq = rcpSeq;
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
}
