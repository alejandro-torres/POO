package org.atr;

import org.atr.model.*;



public class Main {
    public static void main(String[] args) {

        FiguraManager manager = new FiguraManager();
        FiguraManagerPolimorfia managerPolimorfia = new FiguraManagerPolimorfia();

        Rectangulo figura1 = new Rectangulo(10,5,"Juan","verde");
        Rectangulo figura2 = new Rectangulo(12,10,"Jake","azul");
        Rectangulo figura4 = new Rectangulo(13,14,"Nieves","blanca");

        Circulo figura3 = new Circulo("Pato", "marron", 6);
        Circulo figura5 = new Circulo("asd", "gggggg", 7);
        Circulo figura6 = new Circulo("asdas", "mmmmm", 8);

        manager.setCirculos(figura3, figura5, figura6);
        manager.setRectangulos(figura1,figura2,figura4);

        //Sin polimorfia
        manager.mostrarContenido();
        manager.mostrarContenido(manager.getCirculos());
        manager.mostrarContenido(manager.getRectangulos());

        //Con polimorfia
        managerPolimorfia.mostrarContenido(figura1,figura2,figura3,figura4,figura5,figura6);


        //Figura f = new Rectangulo();//BIEN

        //System.out.println(figura1.nombre + " " + figura2.nombre);//MAL
        //System.out.println(" BIEN=> "+ figura1.getNombre() + " " + figura2.getNombre());//BIEN
    /*
        System.out.println(figura1.getArea() );
        System.out.println(figura3.getArea() );
*/

        //System.out.println(figura1);




    }



}