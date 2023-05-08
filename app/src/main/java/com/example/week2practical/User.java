package com.example.week2practical;

public class User {
    String name;
    String description;
    int id;
    boolean followed;

    public User(String Name, String Description, int Id, boolean Followed){
        Name = name;
        Description = description;
        Id = id;
        Followed = followed;
    }

    public String getName(){
        return name;
    }
    public void setName(String Name){
        Name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String Description){
        Description = description;
    }

    public int getId(){
        return id;
    }
    public void setId(int Id){
        Id = id;
    }

    public boolean getFollowed(){
        return followed;
    }
    public void setFollowed(boolean Followed){
        Followed = followed;
    }
}
