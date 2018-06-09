package com.sk.BirthDayManager.model;

import com.sk.BirthDayManager.R;

import java.util.ArrayList;

public class Service {

    private  String title;
    private int images;
    private String description;

    public String getTitle() {
        return title;
    }

    public int getImages() {
        return images;
    }

    public String getDescription() {
        System.out.println("suraj "+description);
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Service> getData() {

        ArrayList<Service> dataList = new ArrayList<>();

        int[] images = getImage();
        String[] titles=getTitles();
        String[] desc=getDescriptions();

        for (int i = 0; i < images.length; i++) {

            Service serviceData = new Service();
            serviceData.setImages(images[i]);
            serviceData.setDescription(desc[i]);
            serviceData.setTitle(titles[i]);

            dataList.add(serviceData);
        }

        return dataList;
    }


    public static int[] getImage(){
        int [] images={
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3
        };

        return images;
    }

    public static String[] getTitles(){

        String[] titles={
                "Theme Decor","Destination Weddings","Entertainment","Video Photography","Catering Bartending"
        };
        return titles;
    }

    public static String[] getDescriptions(){

        String[] desc={
                "At L’amore Weddings, we design décor as per your style and budget, by utilising the natural beauty of the venue itself or by transforming the venue with creative designs such as lighting, flowing fabrics and traditional elements to create a lasting impression and a wedding beyond dreams, all planned to complement the decor and colour theme. The beautiful versatility of our theme décor allows for a perfect blend of the color scheme to create an aura of style and creativity, and experiment with innovative arrangements for a magical effect that suit your sense of sophistication.",
                "Are you in search of a remote or exotic destination for your wedding? L’amore brings to you destination weddings like none other! All our destinations have been carefully picked, tried, and tested. Be it a royal wedding in Rajasthan, a beach wedding in Goa or an exotic wedding outside India, we ensure all the details, from the venue to the menu, are worked best for you. Our destination-wedding package proffers all prominent services such as Location, Accommodation, Airfare, Guest Management, Vendor Selection, and complete co-ordination. Allow L’amore to plan for you while you plan for an enjoyable day full of love and happiness!",
                "The dream team at L’amore showcases its experience and competency in providing a host of wedding entertainment packages to choose from to cater to a wide variety of needs and budgets, making it the most sought after international wedding planning companies in the business today. Be it your wedding day or smaller events of a wedding such as ladies Sangeet and Mehendi, we assure you of entertainment that will live on in your memory forever. The finest of performers from the country and from across the world have partnered with us to make your wedding day memorable. Scintillating belly dancers from Europe, Dance troupes, choreographers, singers, DJ artists. we have them all!",
                "L’amore has an empanelled team of proficient photographers and videographers to capture your magical moments beautifully using state of the art technology such that each picture speaks volumes of love, promise, memory and joy for years to come. Be it a grand traditional ceremony or a classic intimate wedding at an exotic destination, we help you create unforgettable memories of your special day. Allow our professional craftsmen to work magic with their lens and astonish you with their vast range of timeless and priceless wedding photography like never before.",
                "We understand how special your wedding day is to you and take great pride in fulfilling your requirements and giving you the well-deserved peace of mind. An event as important as this day should be fabulous in all aspects and one of a kind. We understand that it must get our complete attention so as not to miss the finer details. Our large range of quality branded equipment spell style and reliability. We are wedding planners with a flair for making things grand and that is why our expert chefs devise exotic theme based menus to satiate your palates with a delectable menu, while leaving you free to mingle with your guests. Like our weddings, we customize our bartending services too, to suit your needs, budget, and theme. In our relentless pursuit of excellence, we leave no stone unturned!"
        };
        return desc;
    }
}
