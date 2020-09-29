package com.example.tel306;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TareasPendientes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_pendientes);

        setTitle("Tareas Pendientes");

        Intent intent = getIntent();
        Usuario usuarionuevo = (Usuario) intent.getSerializableExtra("usuario");
        Especialidad especialidad = usuarionuevo.getEspecialidad();
        String nombreEspecialidad = especialidad.getNombre();

        ImageView imagenMascota = findViewById(R.id.mascota);

        if(nombreEspecialidad == "Telecomunicaciones"){
            imagenMascota.setImageResource(R.drawable.ic_telito);

        }else if (nombreEspecialidad == "Electronica") {
            imagenMascota.setImageResource(R.drawable.erectrito);
        }else if (nombreEspecialidad == "Mecatronica")  {
            imagenMascota.setImageResource(R.drawable.bender);
        }


    }

    public void regresar (View view){

        Intent intent = new Intent(TareasPendientes.this, AgregarUsuario.class);
        startActivity(intent);
    }

    public void cambioSecreto (View view){

        TextView textViewContador = findViewById(R.id.textView4);
        String textoContador = (String) textViewContador.getText();
        int contador = Integer.parseInt(textoContador);
        contador++;
        textViewContador.setText(String.valueOf(contador));

        if(contador==5)
        {
            //first time clicked to do this
            Toast.makeText(TareasPendientes.this,"Has desbloqueado la opcion oscura", Toast.LENGTH_SHORT).show();
            getApplication().setTheme(R.style.TemaOscuro);
        }
    }



}