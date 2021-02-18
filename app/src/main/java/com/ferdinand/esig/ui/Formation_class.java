package com.ferdinand.esig.ui;

public class Formation_class {

    private int id;
    private String titre;
    private String description;

    public Formation_class(int id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public int setId(int id){
        return this.id = id;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
