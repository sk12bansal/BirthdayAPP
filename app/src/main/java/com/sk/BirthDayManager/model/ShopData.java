package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class ShopData {
    private int imageID;
    private String title;
    private  String items;
    private String description;

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageID() {
        return imageID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setItem(String items) {
        this.items = items;
    }

    public String getItem() {
        return items;
    }

    public static ArrayList<ShopData> getData() {

        ArrayList<ShopData> dataList = new ArrayList<>();

        int[] images = getImages();
        String[] items=getItems();
        String[] titles=getTitles();

        for (int i = 0; i < images.length; i++) {

            ShopData shopData = new ShopData();
            shopData.setImageID(images[i]);
            shopData.setItem(items[i]);
            shopData.setTitle(titles[i]);

            dataList.add(shopData);
        }

        return dataList;
    }

    public static int[] getImages() {

        int[] images = {
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3
        };

        return images;
    }
    public static String[] getItems() {

        String[] items = {
                "1", "20", "1", "12"
        };

        return items;
    }

    public static String[] getTitles() {

        String[] titles = {
                "Bouquet", "Cakes", "Chocolates", "Packages"
        };
        return titles;
    }
}
