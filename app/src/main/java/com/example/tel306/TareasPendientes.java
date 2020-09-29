package com.example.tel306;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TareasPendientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_pendientes);

        setTitle("Tareas Pendientes");

        Intent intent = getIntent();
        Usuario usuarionuevo = (Usuario) intent.getSerializableExtra("usuario");


    }
}