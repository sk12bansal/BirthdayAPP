package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class Chocolate {
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

    public static ArrayList<Chocolate> getData(){

        ArrayList<Chocolate> dataList=new ArrayList<>();
        int[] images=getImages();
        String[] items=getItemNames();
        String[] price=getPrices();
        for(int i=0;i<images.length;i++){
            Chocolate chocolatedata=new Chocolate();
            chocolatedata.setImage(images[i]);
            chocolatedata.setItemName(items[i]);
            chocolatedata.setPrice(price[i]);
            dataList.add(chocolatedata);
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
                "Special Surprise Arrangement"
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
