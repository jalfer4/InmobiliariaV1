package com.example.inmobiliariav1.ui.contrato;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.inmobiliariav1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleContrato extends Fragment {


    public DetalleContrato() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_detalle_contrato, container, false);
        TextView tvpripiedad = view.findViewById(R.id.tvPropiedad);

        String id =  getArguments().getString("item");
        String Contrato1 = "";

        if(id == "0"){
            Contrato1  = "Nombre: Juan Perez - Inicio: 2019-09-11 - Fin: 2020-09-11 - Monto: $8000" + id;
        }else{
        if(id == "1"){
            Contrato1  = "Nombre: Rolando Rueda - Inicio: 2019-09-11 - Fin: 2020-09-11 - Monto: $18000" + id;
        }
        else
        if(id == "2"){
            Contrato1  = "Nombre:Eteban Quito - Inicio: 2019-09-11 - Fin: 2020-09-11 - Monto: $180000" + id;
        }}

        tvpripiedad.setText(Contrato1);

                Button btnAceptar = view.findViewById(R.id.btnAceptar);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        Button btnCancelar = view.findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });
        return view;
    }
    }
