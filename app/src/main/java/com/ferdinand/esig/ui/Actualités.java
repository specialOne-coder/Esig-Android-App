package com.ferdinand.esig.ui;

public class Actualités {

    private int id;
    private int photo;
    private String titre;
    private String description;



    public Actualités() {
    }


    public Actualités(int id, int photo, String titre, String description) {
        this.id = id;
        this.photo = photo;
        this.titre = titre;
        this.description = description;
    }

    public Actualités(int id, String titre, String description){
        this.id = id;
        this.titre = titre;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getPhoto() {
        return photo;
    }

    public String getTitre() {
        return titre;
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

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }





}
