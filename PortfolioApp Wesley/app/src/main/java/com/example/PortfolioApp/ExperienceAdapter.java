package com.example.PortfolioApp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ExperienceAdapter extends ArrayAdapter<ExperienceStringStorage> {
    private Context mContext;
    private int mResource;


    public ExperienceAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ExperienceStringStorage> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        ImageView experienceListItem = convertView.findViewById(R.id.experienceItemImage);

        TextView experienceText2 = convertView.findViewById(R.id.testText);

        TextView experienceListText = convertView.findViewById(R.id.experienceItemText);

        experienceText2.setText(getItem(position).getWorkDone());
        experienceListText.setText(getItem(position).getTest2());
        experienceListItem.setImageResource(getItem(position).getImageview());

        return convertView;
    }
}