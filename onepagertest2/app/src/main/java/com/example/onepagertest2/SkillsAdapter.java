package com.example.onepagertest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

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
        TextView textView2 = convertView.findViewById(R.id.skillsDesc);
        ImageView imageView = convertView.findViewById(R.id.skillsItemImage);

        textView.setText(getItem(position).getSkills());
        textView.setText(getItem(position).getDesc());
        imageView.setImageResource(getItem(position).getImage());

        return convertView;
    }
}
