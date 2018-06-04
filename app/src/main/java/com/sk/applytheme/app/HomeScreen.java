package com.sk.applytheme.app;

import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.sk.applytheme.R;

public class HomeScreen extends Fragment {

    String [] workingArea;
    ListView listView;
    RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_fragment,container,false);
        mRecyclerView=(RecyclerView)view.findViewById(R.id.drawerList);
        /*mRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = view.getId();
                switch (id) {
                    case R.drawable.home:
                        // Toast.makeText(,"hi i am home".toString(),Toast.LENGTH_LONG).show();
                        //System.out.println("suraj i am home");
                        HomeScreen home=new HomeScreen();
                        FragmentManager manager = getFragmentManager();
                        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();
                        transaction.add(R.id.container,home,"home");
                        transaction.addToBackStack(null);
                        transaction.commit();
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
        });*/

        workingArea=getResources().getStringArray(R.array.working_area);
        listView=(ListView)view.findViewById(R.id.working_list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (getContext(), android.R.layout.simple_list_item_1, workingArea){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.BLACK);

                // Generate ListView Item using TextView
                return view;
            }
        };
        return view;
    }

    /*@Override
    protected void onCreateV(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



        *//*
        populating listview using string array

        workingArea=getResources().getStringArray(R.array.working_area);
        listView=findViewById(R.id.working_list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, workingArea);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);*//*




        // DataBind ListView with items from ArrayAdapter

    }
*/
}
