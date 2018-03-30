package com.example.androidtechies.majorproject;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    TextView introTextView, technologyUsed, titleTextView;
    CollapsingToolbarLayout toolbarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);
//        introTextView = findViewById(R.id.intro_brief);
//        technologyUsed = findViewById(R.id.tech_brief);
//        //titleTextView = findViewById(R.id.)
//
        Intent intent = getIntent();
        InformationModel model = intent.getParcelableExtra("Information");
//        introTextView.setText(model.getIntroProject());
//        technologyUsed.setText(model.getTechnologyUsed());
//        toolbarLayout.setTitle(model.getTitleOfProject());

        Log.d("description", model.getTitleOfProject());

    }
}
