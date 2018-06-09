package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class Packages {
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

    public static ArrayList<Packages> getData(){

        ArrayList<Packages> dataList=new ArrayList<>();
        int[] images=getImages();
        String[] items=getItemNames();
        String[] price=getPrices();
        for(int i=0;i<images.length;i++){
            Packages packagesdata=new Packages();
            packagesdata.setImage(images[i]);
            packagesdata.setItemName(items[i]);
            packagesdata.setPrice(price[i]);
            dataList.add(packagesdata);
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
                R.drawable.thumb_1_9,R.drawable.thumb_1_8,R.drawable.thumb_1_1,R.drawable.thumb_1_2,
                R.drawable.thumb_2_6,R.drawable.thumb_2_7,R.drawable.thumb_4_2,R.drawable.thumb_3_2,
                R.drawable.thumb_2_5,R.drawable.thumb_4_4,R.drawable.thumb_4_6,R.drawable.thumb_3_6
        };
        return images;
    }
     public static   String[] getItemNames(){
        String[] itemname={
                "BD-STANDARD","BIRTHDAY-GOLD","BIRTHDAY DIAMOND","BIRTHDAY PREMIUM","BIRTHDAY SURPRISE",
                "DIAMOND PACKAGE","DIAMOND PLUS","GOLDEN PACKAGE","GOLDEN PLUS PACKAGE","BIRTHDAY SURPRISE+",
                "SILVER HOME PACKAGE","SILVER PLUS PACKAGE"
        };
        return itemname;
     }

     public static String[] getPrices()
     {
         String[] price={
                 "Rs.999.00","Rs.2499.00","4999.00","Rs.5999.00","Rs.6499.00",
                 "Rs.999.00","Rs.17999.00","Rs.22999.00","Rs.9999.00","Rs.12999.00",
                 "Rs.3999.00","Rs.5999.00"
         };
         return price;
     }
}
