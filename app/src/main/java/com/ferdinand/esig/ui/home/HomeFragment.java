package com.ferdinand.esig.ui.home;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ferdinand.esig.CustomPopup;
import com.ferdinand.esig.EtudiantActivity;
import com.ferdinand.esig.Home_Adapter;
import com.ferdinand.esig.R;
import com.ferdinand.esig.Slider_Adapter;
import com.ferdinand.esig.ui.Actualités;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;
    private GridView mygrid;
    ViewFlipper viewFlipper;
    private HomeFragment activity;
    private TextView textView;



    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeViewModel =  ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        this.textView = root.findViewById(R.id.savplus);

        viewFlipper = root.findViewById(R.id.v_flip);


//        for (){
//
//        }
//        mygrid = root.findViewById(R.id.gridFlipper);
//
//        ArrayList<Actualités> lesactualités = new ArrayList<>();
//
//        lesactualités.add(new Actualités(1,"Voici le titre dcfsh ffegher","voici la description"));
//        lesactualités.add(new Actualités(1,R.drawable.logo,"Voici le titre","voici la description"));
//        lesactualités.add(new Actualités(1,R.drawable.logo,"Voici le titre","voici la description"));
//        lesactualités.add(new Actualités(1,R.drawable.logo,"Voici le titre","voici la description"));
//        lesactualités.add(new Actualités(1,R.drawable.logo,"Voici le titre","voici la description"));
//        lesactualités.add(new Actualités(1,R.drawable.logo,"Voici le titre","voici la description"));
//
//
//          Home_Adapter adapter = new Home_Adapter(HomeFragment.super.getContext(),lesactualités);
//          mygrid.setAdapter(adapter);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final CustomPopup customPopup = new CustomPopup((Activity) HomeFragment.super.getContext());
                customPopup.setDescription(getResources().getString(R.string.descsavplus));
                customPopup.getNoButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customPopup.dismiss();
                    }
                });

                customPopup.getYesButton().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        customPopup.sendComment();
                    }
                });
                customPopup.build();

            }
        });





        return root;
    }




    public void Slider(int image){

        //Mettre l'image qui est en parametre en background
        ImageView img = new ImageView(HomeFragment.super.getContext());
        img.setBackgroundResource(image);
        //Ajout de l'image a la vue,definition du temps du slider et autres
        viewFlipper.addView(img);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        //Animation de la vue
        viewFlipper.setInAnimation(HomeFragment.super.getContext(),android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(HomeFragment.super.getContext(),android.R.anim.slide_out_right);


    }







}