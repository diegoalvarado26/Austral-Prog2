package AAaaAA;

public class Circulo extends Figura {

    private float radio;
    public String nombre = "circulo";

    public Circulo(float radio, String nombre){
        this.radio = radio;
        this.nombre = nombre;

    }
    public float getArea(){
        return (float) Math.PI * radio * radio;
    }

    public float getPerimetro(){
        return (float) (2*Math.PI*radio);
    }

    public String getNombre(){
        return nombre;
    }
}
