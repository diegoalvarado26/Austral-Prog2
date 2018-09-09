package AAaaAA;

public class Triangulo extends Figura {

    private float lado1, lado2, angulo;
    private float lado3 = (float)(Math.sqrt(Math.pow(lado1,2)+Math.pow(lado2,2) - 2*lado1*lado2*Math.cos(angulo)));
    public String nombre = "triangulo";

    public Triangulo(float lado1, float lado2, float angulo, String nombre){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.nombre = nombre;
    }
    public float getArea(){
        return (float)(lado1*lado2*0.5);
    }

    public float getPerimetro(){
        return (float) (lado1 + lado2 + lado3 );
    }

    public String getNombre(){
        return nombre;
    }
}
