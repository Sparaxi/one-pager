package com.example.onepagertest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.Explode;
import androidx.transition.Scene;
import androidx.transition.Slide;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    // this goes to aboutmeScene
    private Scene homeToAboutMe = null;
    // this goes to Homescreen
    private Scene aboutMeToHome = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton aboutMeImage;
        aboutMeImage = findViewById(R.id.aboutMe);

        Button button;
        button = findViewById(R.id.aboutmeButton);




        // vg = ViewGroup,
        ViewGroup root = findViewById(R.id.rootContainer);
        ViewGroup aboutMeVg = findViewById(R.id.aboutMeContainer);


        homeToAboutMe = Scene.getSceneForLayout(root, R.layout.overmij_scene, this);


        aboutMeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Transition explode = new Explode();
                TransitionManager.go(homeToAboutMe, explode);


            }
        });
    }
}