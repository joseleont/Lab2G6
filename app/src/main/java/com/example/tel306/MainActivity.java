package com.example.tel306;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        AgregarUsuario agregarUsuario;
        AgregarNuevaTarea agregarNuevaTarea;

        Intent intent = new Intent( this , AgregarUsuario.class );
        startActivity( intent );
    }
}