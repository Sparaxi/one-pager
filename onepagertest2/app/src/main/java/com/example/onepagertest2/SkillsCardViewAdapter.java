package com.example.onepagertest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class SkillsCardViewAdapter  extends PagerAdapter {
    private Context context;
    private ArrayList<SkillsCardViewStringStorage> skillsArrayList;

    // constructor
    public SkillsCardViewAdapter(Context context, ArrayList<SkillsCardViewStringStorage> skillsArrayList) {
        this.context = context;
        this.skillsArrayList = skillsArrayList;
    }

    @Override
    public int getCount() {
        return skillsArrayList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(context).inflate(R.layout.skills_scene, container, false);

        ImageView CardviewIV = view.findViewById(R.id.cardviewIV);
        TextView CardviewTv = view.findViewById(R.id.cardviewTvTitle);
        TextView CardViewDsc = view.findViewById(R.id.cardviewDsc);


        // gets the items
        SkillsCardViewStringStorage skills = skillsArrayList.get(position);
        String title = skills.getTitle();
        String desc = skills.getDescription();
        int image = skills.getImage();


        //sets the items
        CardviewTv.setText(title);
        CardViewDsc.setText(desc);
        CardviewIV.setImageResource(image);

        container.addView(view, position);
        return view;


    }

}
