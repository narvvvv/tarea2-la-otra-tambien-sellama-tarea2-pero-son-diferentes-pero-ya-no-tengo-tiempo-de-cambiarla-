package com.javier.testherencia;

public class Profesor extends Persona {
    private int numEmpleado;

    public Profesor(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + this.edad + ", con clave " + this.numEmpleado ;
    }
}