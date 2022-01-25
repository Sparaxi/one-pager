package com.example.onepagertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class SkillsActivity extends AppCompatActivity {

    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        ListView skillsL;
        skillsL = findViewById(R.id.skillsList);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        fade.excludeTarget(android.R.id.background, true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        ArrayList<skills> arrayList = new ArrayList<>();
        arrayList.add(new skills(R.layout.list_item_skills, "nice"));

        skillsAdapter skillsAdapter = new skillsAdapter(context, R.layout.list_item_skills,arrayList);
        skillsL.setAdapter(skillsAdapter);

    }
}