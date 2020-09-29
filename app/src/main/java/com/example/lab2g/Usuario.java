package com.example.lab2g;

public class Usuario extends Especialidad{
    private String nombre;
    private String apellidos;
    private Especialidad especialidad;
    private String dni;
    private String claseSecreta;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getClaseSecreta() {
        return claseSecreta;
    }

    public void setClaseSecreta(String claseSecreta) {
        this.claseSecreta = claseSecreta;
    }
}