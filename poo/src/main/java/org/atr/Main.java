package org.atr;

import org.atr.model.*;



public class Main {
    public static void main(String[] args) {

        Rectangulo figura1 = new Rectangulo(10,5,"Juan","verde");
        Rectangulo figura2 = new Rectangulo(12,10,"Jake","azul");

        Circulo figura3 = new Circulo("Pato", "marron", 6);


        //Figura f = new Rectangulo();//BIEN

        //System.out.println(figura1.nombre + " " + figura2.nombre);//MAL
        //System.out.println(" BIEN=> "+ figura1.getNombre() + " " + figura2.getNombre());//BIEN

        System.out.println(figura1.getArea() );
        System.out.println(figura3.getArea() );


        //System.out.println(figura1);

    }

}