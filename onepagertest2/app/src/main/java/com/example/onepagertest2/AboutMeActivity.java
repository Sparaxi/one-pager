package com.example.onepagertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;

public class AboutMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_me);

        Button moreInterestsButton = findViewById(R.id.clickbaitButtonSkills);

        moreInterestsButton.setOnClickListener(v -> {
            Intent intent = new Intent(AboutMeActivity.this, SkillsActivity.class);
            startActivity(intent);
        });

    }
}