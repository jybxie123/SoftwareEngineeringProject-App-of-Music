package com.example.myapplication1;

import android.widget.ImageView;

public class Feature {
    private String txt;
    private int img;

    public Feature() {
    }

    public Feature(String txt, int img) {
        this.txt = txt;
        this.img = img;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
