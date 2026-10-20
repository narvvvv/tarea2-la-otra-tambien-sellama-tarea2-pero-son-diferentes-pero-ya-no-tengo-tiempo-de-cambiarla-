package com.javier.figura;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TrianguloRect extends FiguraRecta {
        double area, perimetro;
        
    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;  
    }
    @Override
    public double calcularArea(){
        return (alto * ancho) / 2.0;
    }
    public double calcularHip(){
        return (sqrt(pow(alto, 2) + (pow(ancho, 2))));
    }
    @Override
    public double calcularPerimetro(){
        return alto + ancho + calcularHip();
    } 
    @Override
    protected String imprimeFigura() {
        return super.imprimeFigura() + "\nSe imprime un Triangulo con alto: "
                + alto + ", ancho: " + ancho + ", area: " + String.format("%.2f", calcularArea()) 
                + ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}