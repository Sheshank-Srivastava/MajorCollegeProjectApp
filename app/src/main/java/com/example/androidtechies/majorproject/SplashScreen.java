package com.example.androidtechies.majorproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.*;

public class SplashScreen extends AppCompatActivity {
private TextView textView;
private ImageView imageView;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.projectName);
        imageView=(ImageView) findViewById(R.id.splashIcon);
        Handler splash = new Handler();
        splash.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent branch = new Intent(SplashScreen.this,HomeScreen.class);
                startActivity(branch);
            }
        },1000);
    }

}
