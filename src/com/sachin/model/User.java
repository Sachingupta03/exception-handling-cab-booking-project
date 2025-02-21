package com.sachin.model;

public class User {
    protected int userId;
    public String name;
    public String email;
    public String phone;
    public String address;

    public User(int userId, String name, String email,String phone,String address){
        this.userId =userId;
        this.name =name;
        this.email = email;
        this.phone = phone;
        this. address = address;
    }

    public void displayUser(){
        System.out.println("User ID:" + userId + "Name:" + name+ "Email:" + email + " Phone:" + phone + " Address:" + address );

    }
}
