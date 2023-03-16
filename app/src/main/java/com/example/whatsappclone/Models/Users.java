package com.example.whatsappclone.Models;

public class Users {

    String profilePic, userName, mail, password, userId, lastMessage, status;

    public Users()
    {

    }

    public Users (String profilePic, String userName, String mail, String password, String lastMessage, String userId, String status) {
        this.profilePic = profilePic;
        this.userName = userName;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
        this.status = status;
    }

    public Users(String userName, String mail, String password) {
        this.userName = userName;
        this.mail = mail;
        this.password = password;
    }
    
}
