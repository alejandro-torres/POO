package org.atr.model;

public class Rectangulo extends Figura{
    

    private double altura,anchura;

    public Rectangulo(double altura, double anchura, String nombre, String color) {
        super(nombre, color);
        this.altura = altura;
        this.anchura = anchura;
        calcularArea();
    }

    public Rectangulo() {
        this(0.0,0.0,"anonimo","incoloro");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    @Override
    public void calcularArea() {
        super.setArea(altura * anchura);
    }

    @Override
    protected void calcularPerimetro() {

    }
}
