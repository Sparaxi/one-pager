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
    ListView skillsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(decor.findViewById(R.id.action_bar_container), true);
        fade.excludeTarget(android.R.id.statusBarBackground, true);
        fade.excludeTarget(android.R.id.navigationBarBackground, true);
        fade.excludeTarget(android.R.id.background, true);

        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        skillsList = findViewById(R.id.skillsList);

        ArrayList<SkillsStringStorage> arrayList = new ArrayList<>();

        arrayList.add(new SkillsStringStorage("sheeesh","yes",R.drawable.skills));

        SkillsAdapter skillsAdapter = new SkillsAdapter(this,R.layout.list_item_skills,arrayList);
        skillsList.setAdapter(skillsAdapter);


    }
}