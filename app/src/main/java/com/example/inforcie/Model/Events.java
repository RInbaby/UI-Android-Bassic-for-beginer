package com.example.inforcie.Model;

public class Events {
    int img;
    String name1;
    String name2;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Events(int img, String name1, String name2) {
        this.img = img;
        this.name1 = name1;
        this.name2 = name2;
    }
}
