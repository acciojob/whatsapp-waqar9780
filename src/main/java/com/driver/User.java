package com.driver;

public class User {
    private String name;
    private String mobile;

    //constructor
    public User(){

    }
    public User(String name,String mobile){
        this.name = name;
        this.mobile = mobile;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getMobile(){
        return this.mobile;
    }
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
}