package com.example.PortfolioApp;

public class SkillsStringStorage {

    String Title;
    String Desc;
    int Image;


    public SkillsStringStorage(String skills,String Desc, int Image) {
        this.Title = skills;
        this.Desc = Desc;
        this.Image = Image;
    }

    public String getDesc() {
        return Desc;
    }

    public String getSkills() {
        return Title;
    }

    public int getImage() {
        return Image;
    }

    public void setSkills(String skills) {
        this.Title = skills;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public void setImage(int image) {
        Image = image;
    }
}
