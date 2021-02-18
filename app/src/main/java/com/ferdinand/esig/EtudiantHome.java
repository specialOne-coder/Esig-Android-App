package com.ferdinand.esig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ferdinand.esig.ui.etudianthome.EtudiantHomeFragment;

public class EtudiantHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etudiant_home_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, EtudiantHomeFragment.newInstance())
                    .commitNow();
        }
    }
}
