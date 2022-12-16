package com.example.tourguidewithnavigation.model;

public class TourModel {
    private int imageId ;
    private String title ;
    private String body ;

    public TourModel(int imageId, String title, String body) {
        this.imageId = imageId;
        this.title = title;
        this.body = body;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
