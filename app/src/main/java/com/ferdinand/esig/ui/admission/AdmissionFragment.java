package com.ferdinand.esig.ui.admission;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ferdinand.esig.R;

import java.util.ArrayList;

public class AdmissionFragment extends Fragment {

    private AdmissionViewModel mViewModel;

    public static AdmissionFragment newInstance() {
        return new AdmissionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        View vue = inflater.inflate(R.layout.admission_fragment, container, false);


        //ArrayAdapter De la liste Des Sous-Admissions

        ListView liste =  vue.findViewById(R.id.listadmission);

        ArrayList<String> li = new ArrayList<String>();

        li.add("Dossier D'Inscription");
        li.add("Frais de Scolarité");
        li.add("Concours De Bourse");
        li.add("Rentrée Universitaire");
        li.add("Pré-Inscriptionion");

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,li);

        liste.setAdapter(adapt);

        //Fin

        return vue;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AdmissionViewModel.class);
        // TODO: Use the ViewModel
    }

}
