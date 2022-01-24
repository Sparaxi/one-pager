package com.example.onepagertest2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.transition.Explode;
import androidx.transition.Fade;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView aboutMeText;
        TextView skillsText;
        TextView expText;
        TextView ContactText;

        aboutMeText = findViewById(R.id.aboutmeText);
        skillsText = findViewById(R.id.skillsText);
        expText = findViewById(R.id.expText);
        ContactText = findViewById(R.id.ContactText);

        final ImageView imageView = findViewById(R.id.aboutMeIcon);

        Button aboutMeButtonButton;
        aboutMeButtonButton = findViewById(R.id.aboutMeButtonButton);
        Button skillsButtonButton;
        Button experienceButtonButton;
        Button contactButtonButton;

        skillsButtonButton = findViewById(R.id.skillsButtonButton);
        experienceButtonButton = findViewById(R.id.experienceButtonButton);
        contactButtonButton = findViewById(R.id.contactButtonButton);

        aboutMeButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "About me", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
            }
        });

        skillsButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Skills", Toast.LENGTH_SHORT).show();
            }
        });

        experienceButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Experience", Toast.LENGTH_SHORT).show();
            }
        });

        contactButtonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CONTACT", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
