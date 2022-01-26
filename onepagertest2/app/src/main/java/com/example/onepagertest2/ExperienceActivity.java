package com.example.onepagertest2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
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

        ArrayList<ExperienceStringStorage> arrayList = new ArrayList<>();
        arrayList.add(new ExperienceStringStorage("test", R.drawable.skills));

        ExperienceAdapter experienceAdapter = new ExperienceAdapter(this,R.layout.list_item_experience,arrayList);
        experienceLV.setAdapter(experienceAdapter);

    }
}