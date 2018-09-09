package Guia_1;

public class circulo {

    private Point2D centro;
    private double radio;

    public circulo(Point2D centro, double radio){
        this.radio = radio;
        this.centro = centro;
    }

    public Point2D center(){
        return centro;
    }

    public double area(){
        return(double) (radio*radio*Math.PI);
    }

    public boolean contains(Point2D point){
         return (centro.getDistance(point) <= radio);

    }

    public double perimeter(){
        return (double) (2*Math.PI*radio);
    }
}
