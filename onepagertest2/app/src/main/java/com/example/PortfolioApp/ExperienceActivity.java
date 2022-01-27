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
        arrayList.add(new ExperienceStringStorage("Ik heb leren werken met PS en heb geleerd om een dierencollage te maken van verschillende afbeeldingen. Ook heb ik geleerd om schaduw en bliksem te gebruiken op bepaalde plaatsen","Maak je eigen logo", R.drawable.experiencephoto1));
        arrayList.add(new ExperienceStringStorage("Ik heb geleerd om met AI te werken en met het op een bepaalde manier vormgeven van woorden. Ook ontdekte ik alle termen voor de verschillende onderdelen van de opbouw van een woord of zin.","Maak je eigen logo", R.drawable.experiencephoto2));
        arrayList.add(new ExperienceStringStorage("Ik heb leren werken met de programma's AI en ID. Ook leerde ik werken met het op een bepaalde manier vormgeven van de letters en lettertypes.","Maak je eigen logo", R.drawable.experiencephoto3));
        arrayList.add(new ExperienceStringStorage("Ik heb leren werken met de programma's AI en PS. Ook heb ik geleerd om een eigen ontwerp te maken voor een huisstijl.","Creëer je eigen huisstijl", R.drawable.experiencephoto4));

        ExperienceAdapter experienceAdapter = new ExperienceAdapter(this,R.layout.list_item_experience,arrayList);
        experienceLV.setAdapter(experienceAdapter);

        experienceBackButton.setOnClickListener(v ->{
            startActivity(new Intent(ExperienceActivity.this, MainActivity.class));
        });

    }
}