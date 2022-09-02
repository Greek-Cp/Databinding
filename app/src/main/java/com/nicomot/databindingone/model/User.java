package com.nicomot.databindingone.model;

public class User {
    private String username;
    private String email;
    private int nomerHp;


    public User(String username, String email, int nomerHp) {
        this.username = username;
        this.email = email;
        this.nomerHp = nomerHp;
    }

    public int getNomerHp() {
        return nomerHp;
    }

    public void setNomerHp(int nomerHp) {
        this.nomerHp = nomerHp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
