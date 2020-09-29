package com.example.tel306;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AgregarNuevaTarea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_nueva_tarea);

        // Agregar una nueva tarea
        Button btn = findViewById(R.id.btnAgregarTareaN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                EditText texto= findViewById(R.id.editMultiTarea);
                String tarea=texto.getText().toString();


                if (TextUtils.isEmpty(tarea)){
                    texto.setError("Debe ingresar una nueva tarea");
                }
                else{
                    intent.putExtra("tarea",tarea);
                    setResult(RESULT_OK,intent);

                    finish();

                }



            }
        });


    }




}