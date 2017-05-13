package com.example.vitaly.myepsproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ventanaRegistrarUsuario(View v) {
        Intent i = new Intent(this, RegistroUsuarioActivity.class);
        startActivity(i);

    }

    public void ingresarUsuario(View v){
        Intent i = new Intent(this, OpcionesUsuarioActivity.class);
        startActivity(i);
    }


}
