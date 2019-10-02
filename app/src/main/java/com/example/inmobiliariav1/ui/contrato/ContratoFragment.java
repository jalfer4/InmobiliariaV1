package com.example.inmobiliariav1.ui.contrato;

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

public class ContratoFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_contrato, container, false);

        final ListView lvPodiedad = view.findViewById(R.id.lvPropiedad);

        lvPodiedad.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Bundle bundle  = new Bundle();
                String mipropiedad;
                 mipropiedad =  Integer.toString(position);
                bundle.putString("item",mipropiedad);

                Navigation.findNavController(view).navigate(R.id.detalleContrato, bundle);




            }
        });


        return view;

    }
}