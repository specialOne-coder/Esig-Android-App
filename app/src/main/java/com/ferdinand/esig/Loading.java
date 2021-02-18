package com.ferdinand.esig;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class Loading extends AppCompatActivity {

    private ProgressBar bar;
    private ConstraintLayout clinear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        this.clinear = findViewById(R.id.cons);
        //Redirection vers la page principale

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent redirection = new Intent(getApplicationContext(),etudiantconnexion.class);
                startActivity(redirection);
                finish();
            }
        },5000);


    }
}
