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


    // scene 1
    private Scene aboutMeScene = null;
    // scene 2
    private Scene homeScene = null;
    // scene 3
    private Scene myWorkScene = null;
    // scene 4
    private Scene skillsScene = null;
    // scene 5
    private Scene contactScene = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // scene 1
        homeScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.home_activity_scene, this);
        // scene 2
        aboutMeScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.overmij_scene, this);
        // scene 3
        myWorkScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.mywork, this);
        // scene 4
        skillsScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.skills_scene, this);
        // scene 5
        contactScene = Scene.getSceneForLayout((ViewGroup) findViewById(R.id.rootContainer), R.layout.gegevens_scene, this);

        homeScene.enter();

    }


    public void myWorkButton(View view) {
        Transition explode = new Explode();
        TransitionManager.go(myWorkScene, explode);
    }
    public void contactButton(View view) {
        Transition explode = new Explode();
        TransitionManager.go(contactScene, explode);
    }


    public void aboutMeButton(View view) {
        Transition explode = new Explode();
        TransitionManager.go(aboutMeScene, explode);
    }

    public void skillsbutton(View view) {
        Transition explode = new Explode();
        TransitionManager.go(skillsScene, explode);
    }

    public void home_From_Skills(View view) {
        Transition explode = new Explode();
        TransitionManager.go(homeScene, explode);
    }
}
