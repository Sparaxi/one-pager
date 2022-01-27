package com.example.onepagertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ExperienceActivity extends AppCompatActivity {

    ListView experienceLV;
    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        experienceLV = findViewById(R.id.experienceList);
        Button experienceBackButton = findViewById(R.id.experienceBackButton);

        ArrayList<ExperienceStringStorage> arrayList = new ArrayList<>();
        arrayList.add(new ExperienceStringStorage("Gegrilde asperges met varkenshaas en een tomaten saus","Examen opdracht koks opleiding", R.drawable.experiencefoto1));
        arrayList.add(new ExperienceStringStorage("Dit was een opdracht vanuit System & devices, er was een opdracht gever in Lelystad die graag een website wou waar media gedeeld kon worden door curators.","Unusual.tv", R.drawable.experiencefoto2));
        arrayList.add(new ExperienceStringStorage("Dit is mijn eerste creatie in blender, ik ben hier zeer trots op want het ziet er echt goed uit.","Blender Donut", R.drawable.experiencefoto3));
        arrayList.add(new ExperienceStringStorage("voor de intake hebben we een opdracht gekregen om een website te maken, ik heb hier dus een soort van portfolio van gemaakt.","Instap Opdracht Software developer", R.drawable.experiencefoto4));

        ExperienceAdapter experienceAdapter = new ExperienceAdapter(this,R.layout.list_item_experience,arrayList);
        experienceLV.setAdapter(experienceAdapter);

        experienceBackButton.setOnClickListener(v ->{
            startActivity(new Intent(ExperienceActivity.this, MainActivity.class));
        });

    }
}