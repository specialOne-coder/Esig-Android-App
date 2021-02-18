package com.ferdinand.esig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.ferdinand.esig.ui.partner;

import java.util.ArrayList;

public class Partner_Adapter extends BaseAdapter {

    private Context ct;
    private ArrayList<partner> part;

    public Partner_Adapter(Context ct, ArrayList<partner> part) {
        this.ct = ct;
        this.part = part;
    }

    @Override
    public int getCount() {
        return part.size();
    }

    @Override
    public Object getItem(int position) {
        return part.get(position);
    }

    @Override
    public long getItemId(int position) {
        return part.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater li = LayoutInflater.from(ct);

        View v = li.inflate(R.layout.partner_adapter,null);

        ImageView im = v.findViewById(R.id.imgpartner);

        partner partenariat = part.get(position);

        im.setImageResource(partenariat.getPhoto());

        return v;
    }
}
