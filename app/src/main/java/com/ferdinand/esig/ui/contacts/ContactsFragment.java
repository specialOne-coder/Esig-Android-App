package com.ferdinand.esig.ui.contacts;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ferdinand.esig.R;

public class ContactsFragment extends Fragment {

    private ContactsViewModel mViewModel;

    public static ContactsFragment newInstance() {
        return new ContactsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       final View root =  inflater.inflate(R.layout.contacts_fragment, container, false);

        final EditText mail = root.findViewById(R.id.edi1);
        final EditText msg  = root.findViewById(R.id.edi2);
        Button b = root.findViewById(R.id.btn_send);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String m = mail.getText().toString();
                String ms = msg.getText().toString();

                if(m.equals("")||ms.equals("")){
                    Toast.makeText(ContactsFragment.super.getContext(),"Veuillez remplir tous les champs avant d'envoyer le message",Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(ContactsFragment.super.getContext(),"Merci,veuillez consulter vos mails pour une  reponse eventuelle",Toast.LENGTH_SHORT).show();
                    msg.setText("");
                }
            }
        });





     return  root;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ContactsViewModel.class);
        // TODO: Use the ViewModel
    }


    public void send(View vue){




    }


}
