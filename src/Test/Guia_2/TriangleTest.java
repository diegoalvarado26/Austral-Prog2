package Guia_2;

import Guia_1.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    //Recta 1
    Point2D punto1Recta1 = new Point2D(2,2);
    Point2D punto2Recta1 = new Point2D(0,0);
    Recta recta1 = new Recta(punto1Recta1, punto2Recta1);

    //Recta 2
    Point2D punto1Recta2 = new Point2D(2, 2);
    Point2D punto2Recta2 = new Point2D(4, 0);
    Recta recta2 = new Recta(punto1Recta2, punto2Recta2);

    //Recta 3
    Point2D punto1Recta3 = new Point2D(4, 0);
    Point2D punto2Recta3 = new Point2D(0,0);
    Recta recta3 = new Recta(punto1Recta3, punto2Recta3);

    Triangle triangulo = new Triangle(recta1, recta2, recta3);

    @Test
    void area() {
        assertEquals(triangulo.area(), (float) 4);
    }

    @Test
    void perimeter() {
        //TODO Chequear esto.
    }

    @Test
    void isIsosceles() {
    }

    @Test
    void isScalene() {
    }

    @Test
    void isEquilateral() {
    }
}