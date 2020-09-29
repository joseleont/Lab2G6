package com.example.tel306;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AgregarUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_usuario);

        setTitle("Agregar usuario");

    }

    public void obtenerDatos(View vista){
        EditText nombre = findViewById(R.id.nombre);
        String nuevoNombre= nombre.getText().toString();

        EditText apellido = findViewById(R.id.apellido);
        String nuevoApellido= apellido.getText().toString();

        EditText dni= findViewById(R.id.dni);
        int nuevoDni = Integer.parseInt(dni.getText().toString());

        EditText contrasenia = findViewById(R.id.contrasenia);
        String nuevoContrasenia= contrasenia.getText().toString();

        RadioGroup especialidad = findViewById(R.id.radioGroup);
        int selectedId = especialidad.getCheckedRadioButtonId();
        RadioButton especialidadEscogida=findViewById(selectedId);

        if(especialidad.getCheckedRadioButtonId() == -1) {
            TextView textView2 =findViewById(R.id.textView2);
            textView2.setText("Debe seleccionar una opción");
            textView2.setVisibility(View.VISIBLE);
        } else{

        }
        if (nuevoNombre.isEmpty()){
            nombre.setError("Debe ingresar el nombre");
        } else {

        }
        if (nuevoApellido.isEmpty()){
            apellido.setError("Debe ingresar el apellido");
        } else {

        }
        if (String.valueOf(nuevoDni).isEmpty() | String.valueOf(nuevoDni).length()<9){
            dni.setError("Debe el DNI correctamente");
        } else {

        }

        if (nuevoContrasenia.isEmpty()){
            contrasenia.setError("Debe el DNI correctamente");
        } else {

        }
        if (nuevoContrasenia.isEmpty()){
            contrasenia.setError("Debe el DNI correctamente");
        } else {

        }

    }
}