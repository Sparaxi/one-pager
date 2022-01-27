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
        arrayList.add(new ExperienceStringStorage("It better work","text is verry important yayeet", R.drawable.skills));

        ExperienceAdapter experienceAdapter = new ExperienceAdapter(this,R.layout.list_item_experience,arrayList);
        experienceLV.setAdapter(experienceAdapter);

        experienceBackButton.setOnClickListener(v ->{
            startActivity(new Intent(ExperienceActivity.this, MainActivity.class));
        });

    }
}