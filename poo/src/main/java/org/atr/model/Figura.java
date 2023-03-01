package org.atr.model;

public abstract class Figura {

    private String nombre, color;

    private double area, perimetro;

    public Figura() {
        super();
    }

    public Figura(String nombre, String color) {
        super();
        this.nombre = nombre;
        this.color = color;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        System.out.println(this.getClass().getSimpleName());
        this.area = area;
    }

    public abstract void calcularArea();

    void calcularPerimetro(){

    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
