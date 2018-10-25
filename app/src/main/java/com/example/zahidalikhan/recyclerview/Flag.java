package com.example.zahidalikhan.recyclerview;

public class Flag {
    private String F_name;
     private int thumbnail;

    public Flag() {
    }

    public Flag(String f_name, int thumbnail) {
        this.F_name = f_name;
        this.thumbnail = thumbnail;
    }

    public String getF_name() {
        return F_name;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setF_name(String f_name) {
        this.F_name = f_name;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
