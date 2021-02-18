package com.ferdinand.esig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

public class LoadingConn extends AppCompatActivity {

    private ConstraintLayout conslinear;
    String name,prename,filiere;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_conn);
        Intent inte = getIntent();


        if(inte!= null){
            name =   inte.getStringExtra("nom");
            prename = inte.getStringExtra("prenom");
            filiere = inte.getStringExtra("filiere");
        }

        this.conslinear = findViewById(R.id.consconn);
        //Redirection vers la page principale de l'etudiant avec l'envoi des informations

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent redirection = new Intent(LoadingConn.this,EtudiantActivity.class);
                redirection.putExtra("nom",name);
                redirection.putExtra("prenom",prename);
                redirection.putExtra("filiere",filiere);
                startActivity(redirection);
                finish();
            }
        },5000);






    }
}
