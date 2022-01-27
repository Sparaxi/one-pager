package com.example.PortfolioApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Button moreInterestsButton = findViewById(R.id.clickbaitButtonSkills);
        Button aboutMeBackButton = findViewById(R.id.aboutMeBackButton);

        moreInterestsButton.setOnClickListener(v -> {
            startActivity(new Intent(AboutMeActivity.this, SkillsActivity.class));
        });

        aboutMeBackButton.setOnClickListener(v -> {
            startActivity(new Intent(AboutMeActivity.this, MainActivity.class));
        });


    }
}