package com.example.PortfolioApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button backButton = findViewById(R.id.contactBackButton);
        ImageButton callButton = findViewById(R.id.callMeButton);
        ImageButton emailButton = findViewById(R.id.emailMeButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ContactActivity.this, MainActivity.class);
            startActivity(intent);
        });

        callButton.setOnClickListener(v -> {
            Intent call = new Intent(Intent.ACTION_DIAL);
            call.setData(Uri.parse("tel:0618611769"));
            startActivity(call);
        });

        emailButton.setOnClickListener(v -> {
            startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:wvdrp@hotmail.com")));
        });

    }
}