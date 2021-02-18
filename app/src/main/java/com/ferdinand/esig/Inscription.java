package com.ferdinand.esig;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Inscription extends AppCompatActivity implements View.OnClickListener {


    EditText name, prename,filiere, password, confpassword;
    SQLiteDatabase sqlbase;
    Button inscription;
    String na, pr, fil, pass, conf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        sqlbase = openOrCreateDatabase("Global", Context.MODE_PRIVATE, null);
        sqlbase.execSQL("CREATE TABLE IF NOT EXISTS Etudiant(idetudiant Integer PRIMARY KEY AUTOINCREMENT ,nom VARCHAR(255),prenom VARCHAR(255),filiere VARCHAR(255), password VARCHAR(255),note Varchar(255) );");
        name = findViewById(R.id.nom);
        prename = findViewById(R.id.prenom);
        filiere = findViewById(R.id.filiere);
        password = findViewById(R.id.password);
        confpassword = findViewById(R.id.confirmpass);
        inscription = findViewById(R.id.btinscript);
        inscription.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btinscript) {


            na = name.getText().toString().trim();
            pr = prename.getText().toString().trim();
            fil = filiere.getText().toString().trim();
            pass = password.getText().toString().trim();
            conf = confpassword.getText().toString().trim();


            if (na.equals("") || pr.equals("") || fil.equals("") || pass.equals("")) {
                Toast.makeText(this, " Veuillez remplir les champs et reessayer", Toast.LENGTH_LONG).show();
                return;

            } else if (!pass.equals(conf)) {
                Snackbar.make(v, "Les mots de passes entrés ne sont pas les memes.Reessayer.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                password.setText("");
                confpassword.setText("");
                return;
            } else {
                sqlbase.execSQL("INSERT INTO Etudiant(nom,prenom,filiere,password) VALUES('" + na + "','" + pr + "','"+ fil + "','" + pass + "');");
                Toast.makeText(this, "Vous venez de vous inscrire !! Connectez-vous maintenant", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, Loading.class));
                finish();
            }

        }
    }

}
