package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerItem {
    private String title;
    private int imageId;

    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static List<NavigationDrawerItem> getData() {
        List<NavigationDrawerItem> navigationDrawerItemList = new ArrayList<>();

        int[] imageIds = getImages();
        String[] titles = getTitles();

        for (int i = 0; i < titles.length; i++) {
            NavigationDrawerItem navItem = new NavigationDrawerItem();
            navItem.setTitle(titles[i]);
            navItem.setImageId(imageIds[i]);
            navigationDrawerItemList.add(navItem);
        }

        /*for(int i=0;i<navigationDrawerItemList.size();i++)
            System.out.println("suraj "+navigationDrawerItemList.get(i).getTitle());*/
        return navigationDrawerItemList;
    }

    private static int[] getImages() {

        int[] images = new int[]{
                R.drawable.home, R.drawable.about, R.drawable.service, R.drawable.shop,
                R.drawable.gallery, R.drawable.contact
        };
        return images;
    }

    private static String[] getTitles() {
        String[] titles = new String[]{

                "HOME", "ABOUT", "SERVICES", "SHOP", "GALLERY", "CONTACT US"

        };
        return titles;
    }
}
