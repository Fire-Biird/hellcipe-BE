package com.firebird.hellcipe.model.dto;

public class BookmarkDTO {
    private int userId;
    private int rcpSeq;

    public BookmarkDTO() {}

    public BookmarkDTO(int userId, int rcpSeq) {
        this.userId = userId;
        this.rcpSeq = rcpSeq;
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
}
