package com.javier.figura;

import static java.lang.Math.pow;

public class Circulo extends FiguraCircular {
    int area, perimetro;
    double pi = 3.14159;
    
    public Circulo(int radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return (pi * pow(radio, 2));
    }
    @Override
    public double calcularPerimetro(){
        return (2 * pi * radio);
    }
    protected String imprimeFigura(){
        return super.imprimeFigura() + "\nSe imprime un Circulo con radio: " + radio 
                + ", area: " + String.format("%.2f", calcularArea()) + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}