package Guia_2;

import Guia_1.Point2D;

public class Recta {

    private Point2D point_1, point_2;

    public Recta(Point2D point_1, Point2D point_2){
        this.point_1 = point_1;
        this.point_2 = point_2;
    }

    public double modulus(){
        return point_1.getDistance(point_2);
    }

}
