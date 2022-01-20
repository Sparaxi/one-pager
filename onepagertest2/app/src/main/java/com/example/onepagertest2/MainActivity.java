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
    private Scene aboutMeScene = null;
    // this goes to Homescreen
    private Scene homeScene = null;
    // scene 3
    private Scene mywork = null;
    // scene 4



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;
        button = findViewById(R.id.myworkButton);

        // scene 1
        homeScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.home_activity_scene, this);
        // scene 2
        aboutMeScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.overmij_scene, this);
        // scene 3
        mywork = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.mywork, this);
        // scene 4

        homeScene.enter();

    }

    public void skillsButton(View view) {
        Transition explode = new Explode();
        TransitionManager.go(mywork, explode);
    }


    public void HomefromWork(View view) {
        Transition explode = new Explode();
        TransitionManager.go(homeScene, explode);
    }

    public void aboutmeClick(View view) {

    }
}