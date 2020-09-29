package com.example.tel306;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Intent intent = getIntent();
        Usuario usuarionuevo = (Usuario) intent.getSerializableExtra("usuario");
        Especialidad especialidad1 = usuarionuevo.getEspecialidad();



    }

    public Usuario crearUsuario(View vista) {
        Intent intent = getIntent();
        Usuario usuario1 = (Usuario) intent.getSerializableExtra("usuario");
        Especialidad especialidad1 = usuario1.getEspecialidad();

        EditText nombre = findViewById(R.id.nombre);
        String nuevoNombre = nombre.getText().toString();

        EditText apellido = findViewById(R.id.apellido);
        String nuevoApellido = apellido.getText().toString();

        EditText dni = findViewById(R.id.dni);
        int nuevoDni = Integer.parseInt(dni.getText().toString());

        EditText contrasenia = findViewById(R.id.contrasenia);
        String nuevoContrasenia = contrasenia.getText().toString();

        RadioGroup especialidad = findViewById(R.id.radioGroup);
        int selectedId = especialidad.getCheckedRadioButtonId();


        String especialidadEscogida = ((selectedId == 0) ? "Telecomunicaciones" : "Electronica");

        if (especialidad.getCheckedRadioButtonId() == -1) {
            TextView textView2 = findViewById(R.id.textView2);
            textView2.setText("Debe seleccionar una opción de especialidad");
            textView2.setVisibility(View.VISIBLE);
        }
        if (nuevoNombre.isEmpty()) {
            nombre.setError("Debe ingresar el nombre");
        }
        if (nuevoApellido.isEmpty()) {
            apellido.setError("Debe ingresar el apellido");
        }
        if (String.valueOf(nuevoDni).isEmpty() | String.valueOf(nuevoDni).length() < 9) {
            dni.setError("Debe el DNI correctamente");
        }
        if (nuevoContrasenia.isEmpty()) {
            contrasenia.setError("Debe el DNI correctamente");
        }
        if (nuevoContrasenia.isEmpty()) {
            contrasenia.setError("Debe el DNI correctamente");
        }
        especialidad1.setNombre(especialidadEscogida);
        usuario1.setNombre(nuevoNombre);
        usuario1.setApellidos(nuevoApellido);
        usuario1.setClaseSecreta(nuevoContrasenia);
        usuario1.setDni(String.valueOf(nuevoDni));
        usuario1.setEspecialidad(especialidad1);
        return usuario1;
    }
}