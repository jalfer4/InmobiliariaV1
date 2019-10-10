package com.example.inmobiliariav1.ui.perfil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.inmobiliariav1.R;

public class PerfilFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

       final  EditText etDni = view.findViewById(R.id.etDni);
        final  EditText etNombre = view.findViewById(R.id.etNombre);
        final  EditText stApellido = view.findViewById(R.id.stApellido);
        final  EditText etTelefono = view.findViewById(R.id.etTelefono);

        final  EditText etEmail = view.findViewById(R.id.etEmail);
        final  EditText etPassword = view.findViewById(R.id.etPassword);
        final CheckBox cbEditar = view.findViewById(R.id.CbEditar);
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


         cbEditar.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {

                 if(cbEditar.isChecked()){
                     etDni.setEnabled(true);
                     etNombre.setEnabled(true);
                     stApellido.setEnabled(true);
                     etTelefono.setEnabled(true);
                     etEmail.setEnabled(true);
                     etPassword.setEnabled(true);
                 }
                 else{
                     etDni.setEnabled(false);
                     etNombre.setEnabled(false);
                     stApellido.setEnabled(false);
                     etTelefono.setEnabled(false);
                     etEmail.setEnabled(false);
                     etPassword.setEnabled(false);
                 }

             }
         });
        return view;
    }
}