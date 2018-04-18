package com.example.androidtechies.majorproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DescriptionActivity extends AppCompatActivity {

    @BindView(R.id.intro_brief)
    TextView introDescription;
    @BindView(R.id.tech_brief)
    TextView techDescription;
    @BindView(R.id.collapsingtoolbar)
    CollapsingToolbarLayout cToolBar;
    @BindView(R.id.projectModule)
    TextView modulein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description);

        ButterKnife.bind(this);

        Intent intent = getIntent();
        InformationModel model = intent.getParcelableExtra("Information");
        String title = model.getTitleOfProject();
        String intro = model.getIntroProject();
        String tech = model.getTechnologyUsed();
        String module = model.getModulein();
        Log.d("Information", title+ " 2 "+intro+ " 3 "+tech);
        introDescription.setText(intro);
        introDescription.setTextSize(20f);
        techDescription.setText(tech);
        techDescription.setTextSize(20f);
        modulein.setText(module);
        modulein.setTextSize(20f);
        cToolBar.setTitle(title);

    }
}
