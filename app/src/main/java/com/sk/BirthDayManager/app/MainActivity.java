package com.sk.BirthDayManager.app;

import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.sk.BirthDayManager.R;

public class MainActivity extends AppCompatActivity {
    Fragment prevfragment=null;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setSupportActionBar(toolbar);

        setUpTollbar();

        setUpDrawerView();

        HomeScreen homeScreen=new HomeScreen();
        switchContent(R.id.home_frag,homeScreen);

        ImageView picture=(ImageView)findViewById(R.id.profile_picture);
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Signin.class);
                startActivity(intent);
            }
        });



        /*mRecyclerView=(RecyclerView) findViewById(R.id.drawerList);
        mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                *//*Intent intent=null;
                String title=current.getTitle().toString();
                if(title.equals("HOME")){
                    MainActivity.showFragmentA();
                }*//*
                int id = view.getId();
                switch (id) {
                    case R.drawable.home:
                        // Toast.makeText(,"hi i am home".toString(),Toast.LENGTH_LONG).show();
                        //System.out.println("suraj i am home");
                        showFragmentA();
                        break;
                    case R.drawable.about:
                        System.out.println("suraj i am home");
                        break;
                    case R.drawable.service:

                        break;
                    case R.drawable.shop:

                        break;
                    case R.drawable.contact:

                        break;
                    case R.drawable.gallery:

                        break;
                }


            }
        });
*/
        // toolbar.setSubtitle("Folks !");
        // toolbar.setElevation(10f);
//        toolbar.setLogo(R.drawable.ic_launcher_background);
//        toolbar.setNavigationIcon(R.drawable.ic_launcher_foreground);
       // setRecylerView();
    }

    /*public void showFragmentA(){
        HomeScreen home=new HomeScreen();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container,home,"home");
        transaction.addToBackStack(null);
        transaction.commit();
    }
*/

    private void setUpTollbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("BirthDayMania");
        toolbar.inflateMenu(R.menu.menu_main);
    }

    private void setUpDrawerView() {
        NavigationDrawerFragment navigationDrawerFragment = (NavigationDrawerFragment) getSupportFragmentManager().findFragmentById(R.id.drawerfrag);
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        navigationDrawerFragment.setUpDrawer(R.id.drawerfrag, drawerLayout, toolbar);

    }

    public void switchContent(int id, Fragment fragment) {
        hidePreviousScreen(fragment);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(id, fragment, fragment.toString());
        ft.addToBackStack(fragment.getTag());
        ft.commit();
    }

    private void hidePreviousScreen(Fragment fragment) {
        if(prevfragment==null){
            prevfragment=fragment;
        }else{
            getSupportFragmentManager().beginTransaction().remove(prevfragment).commit();
            prevfragment=fragment;
        }
    }





/*    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.discard:
                msg = "Delete";
                break;
            case R.id.search:
                msg = "search";
                break;
            case R.id.settings:
                msg = "setting";
                break;
            case R.id.edit:
                msg = "edit";
                break;
            case R.id.exit:
                msg = "exit";
                break;
        }
        Toast.makeText(this, msg + "clicked!", Toast.LENGTH_LONG).show();

        return super.onOptionsItemSelected(item);
    }*/
}
