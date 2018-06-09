package com.sk.BirthDayManager.model;

public class CartItem {
    private String title;
    private int image;
    private String itemName;
    private int price;

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
