package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class Bouquet {
    private int image;
    private String itemName;
    private String price;

    public void setImage(int image) {
        this.image = image;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static ArrayList<Bouquet> getData(){

        ArrayList<Bouquet> dataList=new ArrayList<>();
        int[] images=getImages();
        String[] items=getItemNames();
        String[] price=getPrices();
        for(int i=0;i<images.length;i++){
            Bouquet bouquetData=new Bouquet();
            bouquetData.setImage(images[i]);
            bouquetData.setItemName(items[i]);
            bouquetData.setPrice(price[i]);
            dataList.add(bouquetData);
        }
        return dataList;
    }

    public int getImage() {

        return image;
    }

    public String getItemName() {
        return itemName;
    }

    public String getPrice() {
        return price;
    }

    public static int[] getImages(){
        int[] images={
                R.drawable.thumb_1_9
        };
        return images;
    }
     public static   String[] getItemNames(){
        String[] itemname={
                "Romantic Standard"
        };
        return itemname;
     }

     public static String[] getPrices()
     {
         String[] price={
                "Rs.1049.00"
         };
         return price;
     }
}
