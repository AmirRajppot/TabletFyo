package com.example.tablet.Models;

public class MenuModel {
    int Id , Img;
    String Name;

    public MenuModel(int id, int img, String name) {
        Id = id;
        Img = img;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
