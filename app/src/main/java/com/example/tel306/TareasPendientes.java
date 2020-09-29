package com.example.tel306;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.CheckBox;
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

// agregar
        findViewById(R.id.buttonAgregar).setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(TareasPendientes.this,AgregarNuevaTarea.class);

                int requestCode = 20;
                startActivityForResult(intent,requestCode);




            }
        });

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




//extras

    CheckBox c1=findViewById(R.id.check1);
    CheckBox c2=findViewById(R.id.check2);
    CheckBox c3=findViewById(R.id.check3);
    CheckBox c4=findViewById(R.id.check4);
    CheckBox c5=findViewById(R.id.check5);
    CheckBox c6=findViewById(R.id.check6);
    CheckBox c7=findViewById(R.id.check7);
    CheckBox c8=findViewById(R.id.check8);
    CheckBox[] listaChecks= {c1,c2,c3,c4,c5,c6,c7,c8};

    public void desaparecerCheckbox(View view){

        CheckBox check= (CheckBox) view;

        if (check.isChecked())
        {
            view.setVisibility(view.GONE);
            check.setText("vacio");
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


        if (requestCode==20&& resultCode==RESULT_OK){

            int i=0;
            int a=0;
            String infoActivity = data.getStringExtra("tarea");

            while (a==0){
                if (listaChecks[i].getText().toString()=="vacio"){

                    listaChecks[i].setText(infoActivity);
                    a=1;
                    listaChecks[i].setVisibility(View.VISIBLE);
                }
                else{
                    i++;
                }
            }


        }



    }



}