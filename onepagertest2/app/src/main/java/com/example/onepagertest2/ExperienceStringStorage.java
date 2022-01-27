package com.example.onepagertest2;

public class ExperienceStringStorage {

    String workDone;
    String test2;
    int imageview;

    public ExperienceStringStorage(String workDone, String test2, int imageview) {
        this.workDone = workDone;
        this.imageview = imageview;
        this.test2 = test2;
    }


    public String getTest2() {
        return test2;
    }

    public String getWorkDone() {
        return workDone;
    }



    public void setWorkDone(String workDone) {
        this.workDone = workDone;
    }

    public int getImageview() {
        return imageview;
    }

    public void setImageview(int imageview) {
        this.imageview = imageview;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }
}
