package com.firebird.hellcipe.model.dto;

public class UserDTO {
    private String userNickname;
    private String userPassword;
    private String userEmail;
    private String userId;

    public UserDTO() {}

    public UserDTO(String userNickname, String userPassword, String userEmail, String userId) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userId = userId;
    }
    public String getUserNickname() {
        return userNickname;
    }
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }

    

}
