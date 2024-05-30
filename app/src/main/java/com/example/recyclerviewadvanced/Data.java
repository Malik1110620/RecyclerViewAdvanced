package com.example.recyclerviewadvanced;

public class Data {
    private String name;
    private String like;
    private String mB;
    private int ImageResourceId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getmB() {
        return mB;
    }

    public void setmB(String mB) {
        this.mB = mB;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        ImageResourceId = imageResourceId;
    }

    public Data() {
    }

    public Data(String name, String like, String mB, int imageResourceId) {
        this.name = name;
        this.like = like;
        this.mB = mB;
        ImageResourceId = imageResourceId;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", like='" + like + '\'' +
                ", mB='" + mB + '\'' +
                ", ImageResourceId=" + ImageResourceId +
                '}';
    }
}

