package com.example.PortfolioApp;

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
        arrayList.add(new ExperienceStringStorage("Dit is een donut die ik heb gemaakt in Blender, dit is een programma waarmee je 3d objecten kan maken","Blender Donut", R.drawable.photoexperience1));
        arrayList.add(new ExperienceStringStorage("Dit project moesten we maken als een soort voor het instappen van Software development, ik wou altijd een soort van portfolio hebben dus heb hier ook aan gewerkt. wat ik hiervan heb geleerd is dat je altijd je website responsive moet opbouwen.","Instap project", R.drawable.photoexperience2));
        arrayList.add(new ExperienceStringStorage("Deze website moesten we maken vanuit een opdracht gever toen ik nog IT System & devices deed. hij wou een website waar mensen hun media en ervaringen konden delen, ervaringen en media die gemaakt zijn in Lelystad zouden dan op deze website kunnen komen.","Unusual.TV", R.drawable.photoexperience3));
        arrayList.add(new ExperienceStringStorage("Bij dit project moesten we een game maken of klimaat verandering, we zijn uiteindelijk gekozen tot een van de favorieten. ","Climate disaster -Microsoft GameJam 2021", R.drawable.gamejam));

        ExperienceAdapter experienceAdapter = new ExperienceAdapter(this,R.layout.list_item_experience,arrayList);
        experienceLV.setAdapter(experienceAdapter);

        experienceBackButton.setOnClickListener(v ->{
            startActivity(new Intent(ExperienceActivity.this, MainActivity.class));
        });

    }
}