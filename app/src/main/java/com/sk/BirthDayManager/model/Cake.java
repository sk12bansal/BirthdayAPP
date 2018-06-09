package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class Cake {
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

    public static ArrayList<Cake> getData(){

        ArrayList<Cake> dataList=new ArrayList<>();
        int[] images=getImages();
        String[] items=getItemNames();
        String[] price=getPrices();
        for(int i=0;i<images.length;i++){
            Cake cakeData=new Cake();
            cakeData.setImage(images[i]);
            cakeData.setItemName(items[i]);
            cakeData.setPrice(price[i]);
            dataList.add(cakeData);
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
                R.drawable.thumb_2_5,R.drawable.thumb_4_4,R.drawable.thumb_4_6,R.drawable.thumb_3_6,
                R.drawable.thumb_3_0,R.drawable.thumb_3_5,R.drawable.thumb_2_9,R.drawable.thumb_4_1,
                R.drawable.thumb_3_3,R.drawable.thumb_2_4,R.drawable.thumb_5_2,R.drawable.thumb_6_8
        };
        return images;
    }
    public static   String[] getItemNames(){
        String[] itemname={
                "Almond Honey","Black Currant Gel Cake","BlackForest","Bluebarry Gel Cake","Choco Chips",
                "Chocolate","Chocolate Fig","Chocolate Truffle","Coffee Crackle","Fresh Fruit Gel Cake",
                "Fresh Fruit","Kit-Kat","kiwi","Mango","Pineapple",
                "Pineapple Gel Cake","Strawberry","Vanilla","White Forest","Vanilla Cake"
        };
        return itemname;
    }

    public static String[] getPrices()
    {
        String[] price={
                "Rs.350.00","Rs.350.00","300.00","Rs.350.00","Rs.350.00",
                "Rs.350.00","Rs.300.00","Rs.300.00","Rs.350.00","Rs.350.00",
                "Rs.350.00","Rs.350.00","Rs.350.00","Rs.250.00","Rs.350.00",
                "Rs.250.00","Rs.350.00","Rs.250.00","Rs.350.00","Rs.400.00"
        };
        return price;
    }
}
