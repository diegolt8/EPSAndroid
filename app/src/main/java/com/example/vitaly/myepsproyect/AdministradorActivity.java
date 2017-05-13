package com.example.vitaly.myepsproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AdministradorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
    }

    public void BuscarUsu (View v){
        Intent i = new Intent(this, BuscarUsuarioActivity.class);
        startActivity(i);
    }
    public void listaUsuario (View v) {
        Intent i = new Intent(this, ListaUsuariosActivity.class);
        startActivity(i);
    }
    public void cerrarAdmin(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
