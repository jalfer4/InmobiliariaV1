package com.example.inmobiliariav1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = ((EditText)findViewById(R.id.etUuario)).getText().toString();
                String password = ((EditText)findViewById(R.id.etpassword)).getText().toString();

                if(usuario.equals("jaf")&& password.equals("jaf")){
                    Intent menu = new Intent(getApplicationContext(), MenuLeft.class);
                    startActivity(menu);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Credenciales no validas", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
