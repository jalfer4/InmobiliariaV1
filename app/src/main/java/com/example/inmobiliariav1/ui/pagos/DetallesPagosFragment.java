package com.example.inmobiliariav1.ui.pagos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.inmobiliariav1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetallesPagosFragment extends Fragment {


    public DetallesPagosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View vista = inflater.inflate(R.layout.fragment_detalles_pagos,container,false);

        String id =  getArguments().getString("item");
        String[] menuItem = {"","",""}; ;

        if(id == "0"){
             menuItem = new String[]{"Cod:00001 Fecha: 2019-10-02 Total: 80000","\"Cod:00002 Fecha: 2019-08-02 Total: 80000\"","\"Cod:00003 Fecha: 2019-08-02 Total: 80000\""};
        }else{
            if(id == "1"){
                menuItem = new String[]{"Cod:00004 Fecha: 2019-10-02 Total: 18000","\"Cod:00005 Fecha: 2019-08-02 Total: 18000\"","\"Cod:00006 Fecha: 2019-08-02 Total: 18000\""};

            }
            else
            if(id == "2"){
                menuItem = new String[]{"Cod:00007 Fecha: 2019-10-02 Total: 180000","\"Cod:00008 Fecha: 2019-08-02 Total: 180000\"","\"Cod:00009 Fecha: 2019-08-02 Total: 180000\""};

            }}


        ListView listview = (ListView)vista.findViewById(R.id.lvPagos);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItem
        );
        listview.setAdapter(listViewAdapter);

        Button btnCancelar = vista.findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        return vista;

    }

}
