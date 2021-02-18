package com.ferdinand.esig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ferdinand.esig.ui.Actualités;
import com.ferdinand.esig.ui.home.HomeFragment;

import java.util.ArrayList;

public class Home_Adapter extends BaseAdapter {

     private Context lecontext;
     private ArrayList<Actualités> mesactualités;

    public Home_Adapter(Context lecontext, ArrayList<Actualités> mesactualités) {
        this.lecontext = lecontext;
        this.mesactualités = mesactualités;
    }

    @Override
    public int getCount() {
        return mesactualités.size();
    }

    @Override
    public Object getItem(int position) {
        return mesactualités.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mesactualités.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater lin = LayoutInflater.from(lecontext);

        View vue = lin.inflate(R.layout.home_adapter,null);

        TextView titre = vue.findViewById(R.id.actutitle);
        TextView description = vue.findViewById(R.id.actudesc);

        Actualités uneactualite = mesactualités.get(position);

        titre.setText(uneactualite.getTitre());
        description.setText(uneactualite.getDescription());

        return vue;
    }





}
