package com.example.vitaly.myepsproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpcionesUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_usuario);
    }

    public void CerrarSesionUsuario(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    public void citasDisponibles(View v){
        Intent i = new Intent(this, TipoCitaActivity.class);
        startActivity(i);
    }
}
