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

public class ExperienceAdapter extends ArrayAdapter<ExperienceStringStorage> {
    private Context mContext;
    private int mResource;

    public ExperienceAdapter(@NonNull Context context, int resource, @NonNull List<ExperienceStringStorage> objects, Context mContext, int mResource) {
        super(context, resource, objects);
        this.mContext = mContext;
        this.mResource = mResource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        TextView textView = convertView.findViewById(R.id.experienceItemText);

        textView.setText(getItem(position).getWorkDone());

        return convertView;
    }
}
