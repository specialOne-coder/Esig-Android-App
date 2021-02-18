package com.ferdinand.esig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class EcranDeChargement extends AppCompatActivity {

    private ProgressBar bar;
    private ConstraintLayout linear;
    private etudiantconnexion con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_de_chargement);

        this.linear = findViewById(R.id.mylinear);
        //Redirection vers la page principale

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                    Intent redirection = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(redirection);
                    finish();

            }
        },1000);



    }









}
