package com.example.PortfolioApp;

public class ExperienceStringStorage {

    String title;
    String desc;
    int imageview;

    public ExperienceStringStorage(String workDone, String test2, int imageview) {
        this.title = workDone;
        this.imageview = imageview;
        this.desc = test2;
    }


    public String getTest2() {
        return desc;
    }

    public String getWorkDone() {
        return title;
    }

    public void setWorkDone(String workDone) {
        this.title = workDone;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public void setTest2(String test2) {
        this.desc = test2;
    }
}
