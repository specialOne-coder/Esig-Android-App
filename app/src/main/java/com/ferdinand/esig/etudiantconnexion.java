package com.ferdinand.esig;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class etudiantconnexion extends AppCompatActivity implements View.OnClickListener {



    private etudiantconnexion activity;
    SQLiteOpenHelper a;
    SQLiteDatabase sqlbase;
    EditText user, password;
    String u, p;
    public boolean connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etudiantconnexion);
        this.activity = this;
        //Appel de la base et assignation des variables a leurs id
        sqlbase = openOrCreateDatabase("Global", Context.MODE_PRIVATE, null);
        Button insc = findViewById(R.id.inscription);
        Button log = findViewById(R.id.loginetudiant);
        user = findViewById(R.id.useretudiant);
        password = findViewById(R.id.paxetudiant);

    }


    //Methode pour invoquer le bouton inscription
    public void inscription(View v) {
        startActivity(new Intent(etudiantconnexion.this, Inscription.class));

    }


    // Methode de verification si l'etudiant est connecté ou pas
    public boolean isConnected(){
        if(this.connect == true){
            return true;
        }else{
            return false;
        }
    }


    //Methode de connexion
    public void login(View v) {

        Cursor c = sqlbase.rawQuery("select * from Etudiant", null);

        if (c.getCount() == 0) {
            Toast.makeText(this, "Le contenue de la base est vide", Toast.LENGTH_SHORT).show();
            return;
        }

        StringBuffer buffer = new StringBuffer();
           while (c.moveToNext()){
//            buffer.append("Email :" + c.getString(1) + "\n");
//            buffer.append("Nom   :" + c.getString(2) + "\n");
//            buffer.append("Mot de passe:" + c.getString(3) + "\n");

            u = user.getText().toString().trim();
            p = password.getText().toString().trim();


            if (u.equals(c.getString(1)) && p.equals(c.getString(4))) {
                Intent con = new Intent(this,LoadingConn.class);
                con.putExtra("nom",c.getString(1));
                con.putExtra("prenom",c.getString(2));
                con.putExtra("filiere",c.getString(3));
                startActivity(con);
//                this.connect = true;
//                isConnected();
                finish();
                return;
            }else if (u.equals("") || p.equals("")){
                AlertDialog.Builder popup = new AlertDialog.Builder(activity);
                popup.setTitle("Vide");
                popup.setMessage("Veuillez remplir tous les champs");
                popup.setPositiveButton("Reessayer", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                popup.show();
                return;

//                Toast.makeText(this,"Veuillez remplir tous les champs ",Toast.LENGTH_SHORT).show();
//                return;
            }
            else if(!u.equals(c.getString(2)) && !p.equals(c.getString(3))) {

            }

        }
        AlertDialog.Builder dpopup = new AlertDialog.Builder(activity);
        dpopup.setTitle("Erreur");
        dpopup.setMessage("Username ou mot de passe incorrect");
        dpopup.setPositiveButton("Reessayer", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                user.setText("");
                password.setText("");
            }
        });
        dpopup.show();

    }


    @Override
    public void onClick(View v) {

    }
}
