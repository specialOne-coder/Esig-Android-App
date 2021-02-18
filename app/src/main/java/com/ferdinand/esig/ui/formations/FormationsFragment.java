package com.ferdinand.esig.ui.formations;

import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ferdinand.esig.BTS;
import com.ferdinand.esig.FormationContinue;
import com.ferdinand.esig.Langue;
import com.ferdinand.esig.Licence;
import com.ferdinand.esig.Modulaire;
import com.ferdinand.esig.R;

public class FormationsFragment extends Fragment {

    private FormationsViewModel mViewModel;

    public static FormationsFragment newInstance() {
        return new FormationsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View root = inflater.inflate(R.layout.formations_fragment, container, false);

        CardView card1 = root.findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(FormationsFragment.super.getContext(), BTS.class));
            }
        });

        CardView card2 = root.findViewById(R.id.card2);
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormationsFragment.super.getContext(), Langue.class));
            }
        });

        CardView card3 = root.findViewById(R.id.card3);
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormationsFragment.super.getContext(), Licence.class));
            }
        });

        CardView card4 = root.findViewById(R.id.card4);
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormationsFragment.super.getContext(), Modulaire.class));
            }
        });

        CardView card5 = root.findViewById(R.id.card5);
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormationsFragment.super.getContext(), FormationContinue.class));
            }
        });


        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FormationsViewModel.class);
        // TODO: Use the ViewModel
    }

}
