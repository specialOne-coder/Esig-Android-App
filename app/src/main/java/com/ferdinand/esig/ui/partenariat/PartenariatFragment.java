package com.ferdinand.esig.ui.partenariat;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.ferdinand.esig.Partner_Adapter;
import com.ferdinand.esig.R;
import com.ferdinand.esig.ui.partner;

import java.util.ArrayList;

public class PartenariatFragment extends Fragment {

    private PartenariatViewModel mViewModel;
    private GridView gris;
    public static PartenariatFragment newInstance() {
        return new PartenariatFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View root =  inflater.inflate(R.layout.partenariat_fragment, container, false);

        gris = root.findViewById(R.id.gridpart);
        ArrayList<partner> pa = new ArrayList<partner>();

        pa.add(new partner(1,R.drawable.pn,"voila moi"));
        pa.add(new partner(1,R.drawable.empact,"voila moi"));
        pa.add(new partner(1,R.drawable.moov,"voila moi"));
        pa.add(new partner(1,R.drawable.ci,"voila moi"));
        pa.add(new partner(1,R.drawable.zeph,"voila moi"));
        pa.add(new partner(1,R.drawable.zm,"voila moi"));
        pa.add(new partner(1,R.drawable.rcj,"voila moi"));
        pa.add(new partner(1,R.drawable.weekcon,"voila moi"));
        pa.add(new partner(1,R.drawable.tvt,"voila moi"));
        pa.add(new partner(1,R.drawable.sgs,"voila moi"));
        pa.add(new partner(1,R.drawable.aoct,"voila moi"));
        pa.add(new partner(1,R.drawable.etg,"voila moi"));
        pa.add(new partner(1,R.drawable.weekcon,"voila moi"));



        Partner_Adapter padapter = new Partner_Adapter(PartenariatFragment.super.getContext(),pa);

        gris.setAdapter(padapter);


        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PartenariatViewModel.class);
        // TODO: Use the ViewModel
    }

}
