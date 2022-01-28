package com.example.PortfolioApp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutMeButtonButton = findViewById(R.id.aboutMeButtonButton);
        Button skillsButtonButton = findViewById(R.id.skillsButtonButton);
        Button experienceButtonButton = findViewById(R.id.experienceButtonButton);
        Button contactButtonButton = findViewById(R.id.contactButtonButton);

        aboutMeButtonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
            startActivity(intent);
        });

        skillsButtonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SkillsActivity.class);
            startActivity(intent);
        });

        experienceButtonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ExperienceActivity.class);
            startActivity(intent);
        });

        contactButtonButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
            startActivity(intent);
        });

    }

}
