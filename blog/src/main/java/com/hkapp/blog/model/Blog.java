package com.hkapp.blog.model;

public class Blog {
    private String id;
    private String title;

    public Blog(String id, String title){
        this.id = id;
        this.title = title;
    }
    public Blog(String title){
        this.title = title;
    }
    public Blog(){
        this.id = "空ID";
        this.title = "空Title";
    }
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
}