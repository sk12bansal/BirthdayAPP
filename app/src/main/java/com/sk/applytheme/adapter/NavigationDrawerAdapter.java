package com.sk.applytheme.adapter;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sk.applytheme.R;
import com.sk.applytheme.app.AboutScreen;
import com.sk.applytheme.app.ContactScreen;
import com.sk.applytheme.app.GalleryScreen;
import com.sk.applytheme.app.HomeScreen;
import com.sk.applytheme.app.MainActivity;
import com.sk.applytheme.app.ServiceScreen;
import com.sk.applytheme.app.ShopScreen;
import com.sk.applytheme.model.NavigationDrawerItem;

import java.util.Collections;
import java.util.List;

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.MyViewHolder> {

    private List<NavigationDrawerItem> mDataList = Collections.emptyList();
    private LayoutInflater inflater;
    private Context context;

    public NavigationDrawerAdapter(Context context, List<NavigationDrawerItem> data) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.mDataList = data;
    }

    @NonNull
    @Override

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.nav_drawer_list_item, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        final NavigationDrawerItem current = mDataList.get(position);
        holder.title.setText(current.getTitle());
        holder.imageView.setImageResource(current.getImageId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentJump(current);
            }
        });
    }

    private void fragmentJump(NavigationDrawerItem item) {
        String title = item.getTitle();
        switch (title) {
            case "HOME":
                fragmentHome(item);
                break;
            case "ABOUT":
                fragmentAbout(item);
                break;
            case "SERVICES":
                fragmentService(item);
                break;
            case "SHOP":
                fragmentShop(item);
                break;
            case "CONTACT US":
                fragmentContact(item);
                break;
            case "GALLERY":
                fragmentGallery(item);
                break;
        }
    }

    private void fragmentHome(NavigationDrawerItem item) {
        HomeScreen homeScreen = new HomeScreen();
        switchContent(R.id.home_frag, homeScreen);
    }

    private void fragmentAbout(NavigationDrawerItem current) {
        AboutScreen aboutScreen = new AboutScreen();
        switchContent(R.id.about_frag, aboutScreen);
    }

    private void fragmentService(NavigationDrawerItem current) {
        ServiceScreen serviceScreen = new ServiceScreen();
        switchContent(R.id.service_frag, serviceScreen);
    }

    private void fragmentShop(NavigationDrawerItem current) {
        ShopScreen shopScreen = new ShopScreen();
        switchContent(R.id.shop_frag, shopScreen);
    }

    private void fragmentContact(NavigationDrawerItem current) {
        ContactScreen contactScreen = new ContactScreen();
        switchContent(R.id.contact_frag, contactScreen);
    }

    private void fragmentGallery(NavigationDrawerItem current) {
        GalleryScreen galleryScreen = new GalleryScreen();
        switchContent(R.id.gallery_frag, galleryScreen);
    }


    private void switchContent(int id, Fragment fragment) {
        if (context == null)
            return;
        if (context instanceof MainActivity) {
            MainActivity mainActivity = (MainActivity) context;
            Fragment frag = fragment;
            mainActivity.switchContent(id, frag);
        }
    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.texttitle);
            imageView = itemView.findViewById(R.id.imgtitle);
        }


    }
}
