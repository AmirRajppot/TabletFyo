package com.example.tablet.Models;

public class ProductModel {
    int Id, Price,Img;
    String Description, Name;

    public ProductModel(int id, int price, int img, String description, String name) {
        Id = id;
        Price = price;
        Img = img;
        Description = description;
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

