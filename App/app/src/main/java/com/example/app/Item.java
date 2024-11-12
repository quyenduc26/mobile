package com.example.app;

public class Item {
    int id;
    String name;
    int price;
    int image;
    int rate;
    public Item(int id, String name, int price, int image, int rate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
        this.rate = rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
