package com.example.onepagertest2;

public class SkillsStringStorage {

    String Title;
    String Desc;
    int Image;


    public SkillsStringStorage(String skills) {
        this.Title = skills;
    }

    public String getSkills() {
        return Title;
    }

    public void setSkills(String skills) {
        this.Title = skills;
    }
}
