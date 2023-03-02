package org.atr.model;

public class FiguraManager {

    private Circulo[] circulos = new Circulo[3];
    private Rectangulo[] rectangulos = new Rectangulo[3];

    public FiguraManager() {
    }

    public void mostrarContenido(){
        for (Circulo element: circulos) {
            System.out.println(element);
        }
        for (Rectangulo element: rectangulos) {
            System.out.println(element);
        }
    }

    public void mostrarContenido(Circulo[] lista){
        for (Circulo element: lista) {
            System.out.println(element);
        }
    }

    public void mostrarContenido(Rectangulo... lista){
        for (Rectangulo element: lista) {
            System.out.println(element);
        }
    }

    public Circulo[] getCirculos() {
        return circulos;
    }

    public void setCirculos(Circulo... circulos) {
        this.circulos = circulos;
    }

    public Rectangulo[] getRectangulos() {
        return rectangulos;
    }

    public void setRectangulos(Rectangulo... rectangulos) {
        this.rectangulos = rectangulos;
    }
}
