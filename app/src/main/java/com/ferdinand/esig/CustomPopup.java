package com.ferdinand.esig;

import android.app.Activity;
import android.app.Dialog;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.badge.BadgeUtils;

public class CustomPopup extends Dialog {

    private String titre;
    String na,co;
    private String description;
    private Button yesButton,noButton;
    private TextView titleView,descriptionView,commentaires;
    EditText name,Comment;



    public CustomPopup(Activity activity){

        super(activity,R.style.Theme_AppCompat_Dialog);
        setContentView(R.layout.savplus_popup_template);
        this.titre = "Mon Titre";
        this.description = String.valueOf(R.string.descsavplus);
        this.yesButton = findViewById(R.id.envoyer_comment_yes);
        this.noButton = findViewById(R.id.no);
        this.titleView = findViewById(R.id.Title);
        this.descriptionView = findViewById(R.id.description);
        this.name = findViewById(R.id.useretudiant);
        this.Comment = findViewById(R.id.commentaires_users);
        this.commentaires = findViewById(R.id.commentaires);


    }

    public String setTitre(String titre){return this.titre = titre;}

    public String setDescription(String description){return this.description = description;}

    public Button getYesButton(){return this.yesButton;}

    public Button getNoButton(){return this.noButton;}


    public void build(){
        show();
        titleView.setText(titre);
        descriptionView.setText(description);
    }

    public void sendComment(){


        commentaires.setText("@"+name+": "+Comment);

    }





}
