package Guia_2;

import Guia_1.Point2D;

public class Triangle { //Ejercicio 3.

    public Recta recta_1, recta_2, recta_3;

    public Triangle(Recta recta_1, Recta recta_2, Recta recta_3){
        this.recta_1 = recta_1;
        this.recta_2 = recta_2;
        this.recta_3 = recta_3;
    }

    public double area(){
        return recta_1.modulus() * recta_2.modulus() * 0.5;
    }

    public double perimeter(){
        return recta_1.modulus() + recta_2.modulus() + recta_3.modulus();
    }

    public boolean isIsosceles{
        return
    }
}
