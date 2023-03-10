package org.atr.model;

public class Circulo extends Figura{


    double radio, diametro;

    public Circulo() {
        super();
    }

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
        this.diametro = radio*2;
        calcularArea();
    }



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public double calcularArea() {
        double x = Math.PI * Math.pow(radio,2);
        super.setArea(x);
       return x;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radio=" + radio +
                ", diametro=" + diametro +
                '}';
    }
}
