package com.example.vitaly.myepsproyect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BuscarUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_usuario);
    }
    public void volverOpcionesAdmin(View v){
        Intent i = new Intent(this, AdministradorActivity.class);
        startActivity(i);
    }
}
