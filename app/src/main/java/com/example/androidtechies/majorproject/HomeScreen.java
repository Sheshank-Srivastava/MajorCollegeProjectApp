package com.example.androidtechies.majorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

<<<<<<< HEAD
public class HomeScreen extends AppCompatActivity {
    public static final String HomeScreenTag = "HomeScreen";
    public static final Integer cseValue = 0;
    public static final Integer itValue = 1;
    public static final Integer eceValue = 2;
    public static final Integer eeeValue = 3;
=======
import com.example.androidtechies.majorproject.RoomSample.AppDatabase;
import com.example.androidtechies.majorproject.RoomSample.DatabaseInitializer;

public class HomeScreen extends AppCompatActivity {
    public static final String HomeScreenTag = "HomeScreen";
    public static final Integer cseValue = 0;
    public static final Integer it = 0;
    public static final Integer ece = 0;
    public static final Integer eee = 0;
    AppDatabase appDatabase;
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        final Button cse = (Button) findViewById(R.id.cseTag);
        Button ece = (Button) findViewById(R.id.eceTag);
        Button it = (Button) findViewById(R.id.itTag);
        Button eee = (Button) findViewById(R.id.eeeTag);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
<<<<<<< HEAD
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
=======
//                Intent cseIntent = new Intent(HomeScreen.this, ListPage.class);
//                cseIntent.putExtra(HomeScreenTag, cseValue);
//                startActivity(cseIntent);
                populateDatabase();

            }
        });
        

        
        
//        ece.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent ece = new Intent(HomeScreen.this, ECEHomeScreen.class);
//                startActivity(ece);
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
//
//            }
//        });
//        it.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
<<<<<<< HEAD
//                Intent itIntent = new Intent(HomeScreen.this, ListPage.class);
//
//                itIntent.putExtra(HomeScreenTag, itValue);
//                startActivity(itIntent);
=======
//                Intent it = new Intent(HomeScreen.this, ITHomeScreen.class);
//                startActivity(it);
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
//
//            }
//        });
//        eee.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
<<<<<<< HEAD
//                Intent eeeIntent = new Intent(HomeScreen.this, ListPage.class);
//                eeeIntent.putExtra(HomeScreenTag,eeeValue);
//                startActivity(eeeIntent);
=======
//                Intent eee = new Intent(HomeScreen.this, EEEHomeScreen.class);
//                startActivity(eee);
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a
//
//            }
//        });
    }
<<<<<<< HEAD
    }
=======

    private void populateDatabase() {
        DatabaseInitializer.populateAsync(AppDatabase.getAppDatabase(this));
    }
}
>>>>>>> 410389ff97e9d50f3246ef333c98e2167f3c0e4a

