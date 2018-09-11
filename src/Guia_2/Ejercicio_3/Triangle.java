package Guia_2.Ejercicio_3;

public class Triangle { //Ejercicio 3.
    /*
    CONSIGNA:

    Implemente la clase Triangle, que debe estar compuesta por Rectas, que a su vez
    están compuesta por dos puntos. Debe contar con los siguientes métodos:
		area()
		perimeter()
		isIsoceles()
		isScalane()
		isEquilateral()

Indique: ¿Que tipo de agregación tiene la clase Triángulo con sus componentes?
RPTA: Composición.

     */

    public Recta recta_1, recta_2, recta_3;

    public Triangle(Recta recta_1, Recta recta_2, Recta recta_3){
        this.recta_1 = recta_1;
        this.recta_2 = recta_2;
        this.recta_3 = recta_3;
    }

    public double area(){

        return (double) (Math.round(recta_1.modulus() * recta_2.modulus() * 0.5 * 1000d) / 1000d);
    }

    public double perimeter(){
        return recta_1.modulus() + recta_2.modulus() + recta_3.modulus();
    }

    public boolean isIsosceles(){
        return (recta_1.modulus() == recta_2.modulus() || recta_1.modulus() == recta_3.modulus());
    }

    public boolean isScalene(){
        return (recta_1.modulus() != recta_2.modulus() && recta_2.modulus() != recta_3.modulus());
    }

    public boolean isEquilateral(){
        return (!isScalene());
    }
}
