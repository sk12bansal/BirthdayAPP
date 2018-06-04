package com.sk.applytheme.app;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SlidingDrawer;

import com.sk.applytheme.R;
import com.sk.applytheme.adapter.NavigationDrawerAdapter;
import com.sk.applytheme.model.NavigationDrawerItem;

public class NavigationDrawerFragment extends Fragment {

    private ActionBarDrawerToggle mActionBarDrawerToggle;
    private DrawerLayout mDrawerLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_drawer, container, false);
        setUpRecyclerView(view);
        return view;
    }

    private void setUpRecyclerView(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.drawerList);
        NavigationDrawerAdapter navigationDrawerAdapter = new NavigationDrawerAdapter(getActivity(), NavigationDrawerItem.getData());

        recyclerView.setAdapter(navigationDrawerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }

    public void setUpDrawer(int drawerfrag, DrawerLayout drawerLayout, Toolbar toolbar) {

        mDrawerLayout = drawerLayout;
        mActionBarDrawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                //                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                //                getActivity().invalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                // Do something of Slide of Drawer
            }
        };

        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);

        mDrawerLayout.post(new Runnable() {
            @Override
            public void run() {
                mActionBarDrawerToggle.syncState();
            }
        });
    }
}
