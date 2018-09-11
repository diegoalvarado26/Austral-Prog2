package Guia_2.Ejercicio_5;

public class Square { //Ejercicio 5

    private double lado;

    public Square(double lado){
        this.lado = lado;
    }

    public double perimetro(){
        return lado * 4;
    }

    public double area(){
        return lado * lado;
    }

    public double diagonal(){
        return (double) Math.sqrt(2*Math.pow(lado,2));
    }
}
