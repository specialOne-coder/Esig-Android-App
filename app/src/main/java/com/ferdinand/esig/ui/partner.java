package com.ferdinand.esig.ui;

public class partner {

    private int id;
    private int photo;
    private String description;


    public partner(int id, int photo, String description) {
        this.id = id;
        this.photo = photo;
        this.description = description;
    }


    public int getId(){
        return id;
    }


    public int getPhoto() {
        return photo;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
