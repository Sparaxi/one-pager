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

public class skillsAdapter extends ArrayAdapter<skills> {

    private int mResource;
    private Context mContext;

    public skillsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<skills> objects) {
        super(context, resource, objects);
        this.mResource = mResource;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResource, parent, false);

        TextView skillsL = convertView.findViewById(R.id.skillsItemList);

        skillsL.setText(getItem(position).getSkills());

        return convertView;
    }


}
