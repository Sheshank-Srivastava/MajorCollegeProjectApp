package com.example.androidtechies.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {
    ArrayList<InformationModel> informationModelArrayList;
    RecyclerView recyclerView;
    ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_page);

        Intent intent = getIntent();
        Integer value = intent.getIntExtra(HomeScreen.HomeScreenTag,1);
        informationModelArrayList = new ArrayList<>();
        informationModelArrayList = createFakeData(value);


        recyclerView = findViewById(R.id.recyclerView);
      //  listAdapter = new ListAdapter(informationModelArrayList, this);

        listAdapter = new ListAdapter(informationModelArrayList, this, new ListAdapter.ClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(ListPage.this, DescriptionActivity.class);
                intent.putExtra("Information",informationModelArrayList.get(position));
                startActivity(intent);

            }
        });

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(listAdapter);
    }

    // Todo check value and apply switch case

    private ArrayList<InformationModel> createFakeData(int value) {
        ArrayList<InformationModel> arrayList = new ArrayList<>();
        Toolbar toolbar = findViewById(R.id.listtoolbar);
        InformationModel model;
        int length;
        switch (value){
            /**
             * Display content of Information Technology
             */
            case 0:
                toolbar.setTitle("IT-Select Project");
                 length = getResources().getStringArray(R.array.project_title_it).length;

                for(int i=0 ; i<length; i++) {
                    model = new InformationModel(
                            getResources().getStringArray(R.array.project_title_it)[i],
                            getResources().getStringArray(R.array.project_introduction_it)[i],
                            getResources().getStringArray(R.array.project_technology_used_it)[i],
                            getResources().getStringArray(R.array.project_module_it)[i]
                    );
                    arrayList.add(model);
                }
            break;
            /**
             * Display content of Computer Science Engineering
             */
            case 1:
                toolbar.setTitle("CSE-Select Project");
                length = getResources().getStringArray(R.array.project_title_it).length;
                for(int i=0 ; i<length; i++) {
                    model = new InformationModel(
                            getResources().getStringArray(R.array.project_title_it)[i],
                            getResources().getStringArray(R.array.project_introduction_it)[i],
                            getResources().getStringArray(R.array.project_technology_used_it)[i],
                            getResources().getStringArray(R.array.project_module_it)[i]
                    );
                    arrayList.add(model);
                }
            break;
            /**
             * Display content of Electronic
             */
            case 2:
//                toolbar.setTitle("ECE-Select Project");
//                 length = getResources().getStringArray(R.array.project_title_ece).length;
//
//                for(int i=0 ; i<length; i++) {
//                    model = new InformationModel(
//                            getResources().getStringArray(R.array.project_title_ece)[i],
//                            getResources().getStringArray(R.array.project_introduction_ece)[i],
//                            getResources().getStringArray(R.array.project_technology_used_ece)[i]
//                    );
//                    arrayList.add(model);
//                }
             break;
            /**
             * Display content of Information Technology
             */
            case 3:
//                toolbar.setTitle("EEE-Select Project");
//                 length = getResources().getStringArray(R.array.project_title_eee).length;
//
//                for(int i=0 ; i<length; i++) {
//                    model = new InformationModel(
//                            getResources().getStringArray(R.array.project_title_eee)[i],
//                            getResources().getStringArray(R.array.project_introduction_eee)[i],
//                            getResources().getStringArray(R.array.project_technology_used_eee)[i]
//                    );
//                    arrayList.add(model);
//                }
            break;



        }
        return arrayList;
    }

}
