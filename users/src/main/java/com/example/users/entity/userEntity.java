package com.example.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class userEntity {
    @Id
    private int id;
    private String username;
    private String password;
    private String mail;
    private String firstname;
    private String lastname;
    private String phone;

    public userEntity(){

    }
    /*@@@@@@@@@@@@@@@@@@      getter @@@@@@@@@@@@@@@@@@@@@@@@*/

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }
    /*@@@@@@@@@@@@@@@@@@      setter @@@@@@@@@@@@@@@@@@@@@@@@*/

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    /*@@@@@@@@@@@@@@@@@@      toString  @@@@@@@@@@@@@@@@@@@@@@@@*/

    @Override
    public String toString() {
        return "userEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
