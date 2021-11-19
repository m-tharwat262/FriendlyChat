package com.google.firebase.udacity.friendlychat;

public class TestObject {

    private String string1;
    private String string2;
    private String string3;
    private int num;
    private boolean bool;
    private float flo;

    public TestObject() {
    }

    public TestObject(String string1, String string2, String string3 , int num, boolean bool, float flo) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
        this.num = num;
        this.bool = bool;
        this.flo = flo;
    }

//    public void setString1(String string1) {
//        this.string1 = string1;
//    }
//
//    public void setString2(String string2) {
//        this.string2 = string2;
//    }
//
//    public void setFlo(float flo) {
//        this.flo = flo;
//    }
//
//    public void setString3(String string3) {
//        this.string3 = string3;
//    }
//
//    public void setBool(boolean bool) {
//        this.bool = bool;
//    }
//
//    public void setNum(int num) {
//        this.num = num;
//    }

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public float getFlo() {
        return flo;
    }

    public boolean isBool() {
        return bool;
    }

    public int getNum() {
        return num;
    }

    public String getString3() {
        return string3;
    }
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhotoUrl() {
//        return photoUrl;
//    }
//
//    public void setPhotoUrl(String photoUrl) {
//        this.photoUrl = photoUrl;
//    }
}

