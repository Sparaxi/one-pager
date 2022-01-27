package com.example.PortfolioApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;
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

        Button skillsBackButton = findViewById(R.id.skillsBackButton);

        ArrayList<SkillsStringStorage> arrayList = new ArrayList<>();

        arrayList.add(new SkillsStringStorage("Albert Heijn: Kassamedewerker","Parttime; juli 2017 - september 2017", R.drawable.suitcaseblauw));
        arrayList.add(new SkillsStringStorage("Onderweg Buffet Restaurant:","Bediening/serveerster.\nParttime juni 2019 - maart 2021", R.drawable.suitcaseorange));
        arrayList.add(new SkillsStringStorage("Hema"," Verkoop/kassamedewerkster Parttime \n maart 2021 - april 2021", R.drawable.suitcaseblauw));
        arrayList.add(new SkillsStringStorage("Vero Moda","verkoop/kassamedewerkster Parttiime \napril 2021 - december 2021", R.drawable.suitcaseorange));




        SkillsAdapter skillsAdapter = new SkillsAdapter(this,R.layout.list_item_skills,arrayList);
        skillsList.setAdapter(skillsAdapter);

        skillsBackButton.setOnClickListener(v -> {
            startActivity(new Intent(SkillsActivity.this, MainActivity.class));
        });


    }
}