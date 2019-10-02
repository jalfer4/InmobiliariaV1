package com.example.inmobiliariav1.ui.pagos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.example.inmobiliariav1.R;

public class PagosFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pagos, container, false);

        final ListView lvPodiedad = view.findViewById(R.id.lvPropiedad);

        lvPodiedad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle  = new Bundle();
                String pos;
                pos =  Integer.toString(position);
                bundle.putString("item",pos);
                Navigation.findNavController(view).navigate(R.id.detallesPagosFragment, bundle);



            }
        });


        return view;
    }
}