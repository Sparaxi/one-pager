package com.example.onepagertest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SkillsAdapter extends ArrayAdapter<SkillsStringStorage> {
    private Context mContext;
    private int mResource;


    public SkillsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<SkillsStringStorage> objects) {

        super(context, resource, objects);
        this.mContext = context;
        this.mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        TextView textView = convertView.findViewById(R.id.skillsItemText);

        textView.setText(getItem(position).getSkills());

        return convertView;
    }
}
