package AAaaAA;

public class CalculadoraTester {

    public static void main(String[] args){

        Calculadora calculate = new Calculadora();

        Figura triangulo = new Circulo(4,"circulin");

         System.out.println(calculate.calculateArea(triangulo));
    }
}
