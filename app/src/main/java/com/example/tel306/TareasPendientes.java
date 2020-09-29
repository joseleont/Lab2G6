package com.example.tel306;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

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

        if(nombreEspecialidad == "Telecom"){

            imagenMascota.setImageResource(R.drawable.ic_telito);
        }else{
            if (nombreEspecialidad == "Electronica"){
                imagenMascota.setImageResource(R.drawable.erectrito);
            }
        }

        //estamos probando el commit


    }
}