package Guia_1.Ejercicio_3;

public class Point2D {

    private double x;
    private double y;

    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D point){

        double modulus = (double) Math.sqrt(Math.pow((point.getX() - x),2) + Math.pow((point.getY() - y),2));
        return modulus;
    }

    private double getX(){
        return x;
    }

    private double getY(){
        return y;
    }

    public Point2D add(Point2D novopoint) {
        novopoint.x = x + novopoint.getX();
        novopoint.y = y + novopoint.getY();
        return novopoint;
    }

}
