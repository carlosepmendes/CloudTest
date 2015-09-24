package com.example.myapplication.backend;

/**
 * Created by U80030343 on 24-09-2015.
 */
public class Quote {
    private Long id;
    private String who;
    private String whom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }
}
