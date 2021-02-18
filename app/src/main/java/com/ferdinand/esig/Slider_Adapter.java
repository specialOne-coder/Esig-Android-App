package com.ferdinand.esig;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Slider_Adapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Slider_Adapter(Context cont){
        this.context = cont;
    }

    //Les Tableaux

    public String Titres[] = {
            "Actualités",
            "Evènements",
            "Facebook"
    };

    public String description[] = {
            "The system includes other programs where a different license is used. " +
                    "It is your responsibility to aknowledge and respect all the licenses of the programs you use.",
            "The system includes other programs where a different license is used. " +
                    "It is your responsibility to aknowledge and respect all the licenses of the programs you use.",
            "The system includes other programs where a different license is used. " +
                    "It is your responsibility to aknowledge and respect all the licenses of the programs you use."
    };

    @Override
    public int getCount() {
        return Titres.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (LinearLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View vue = layoutInflater.inflate(R.layout.homepage_slider,container,false);

        TextView slide_title = vue.findViewById(R.id.Grandtitre);
        TextView  slide_description = vue.findViewById(R.id.description);

        slide_title.setText(Titres[position]);
        slide_description.setText(description[position]);

        container.addView(vue);


        return  vue;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }






}
