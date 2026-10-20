package com.javier.testherencia;

public class Alumno extends Persona{

    public Alumno() {
        System.out.println("Se crea alumno...");
    }

    @Override
    public String toString() {
        return "Un alumno llamado: " + this.nombre;
    }
}