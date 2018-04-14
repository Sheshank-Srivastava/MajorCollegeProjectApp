package com.example.androidtechies.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.androidtechies.majorproject.RoomSample.AppDatabase;
import com.example.androidtechies.majorproject.RoomSample.DatabaseInitializer;

public class HomeScreen extends AppCompatActivity {
    public static final String HomeScreenTag = "HomeScreen";
    public static final Integer cseValue = 1;
    public static final Integer itValue = 0;
//    public static final Integer eceValue = 2;
//    public static final Integer eeeValue = 3;
    AppDatabase appDatabase;
    Toolbar homeToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        homeToolbar = findViewById(R.id.hometToolbar);
        homeToolbar.setTitle("Select Branch");

        Button cse = (Button) findViewById(R.id.cseTag);
//        Button ece = (Button) findViewById(R.id.eceTag);
        Button it = (Button) findViewById(R.id.itTag);
//        Button eee = (Button) findViewById(R.id.eeeTag);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cseIntent = new Intent(HomeScreen.this, ListPage.class);
                cseIntent.putExtra(HomeScreenTag, cseValue);
                startActivity(cseIntent);

            }
        });
//        ece.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent eceIntent = new Intent(HomeScreen.this, ListPage.class);
//                eceIntent.putExtra(HomeScreenTag, eceValue);
//                startActivity(eceIntent);
//
//
//            }
//        });
        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent itIntent = new Intent(HomeScreen.this, ListPage.class);

                itIntent.putExtra(HomeScreenTag, itValue);
                startActivity(itIntent);


            }
        });
//        eee.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent eeeIntent = new Intent(HomeScreen.this, ListPage.class);
//                eeeIntent.putExtra(HomeScreenTag,eeeValue);
//                startActivity(eeeIntent);
//
//
//            }
//        });
    }


    private void populateDatabase() {
        DatabaseInitializer.populateAsync(AppDatabase.getAppDatabase(this));
    }
}


