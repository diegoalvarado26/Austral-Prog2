package AAaaAA;

public class Cuadrado extends Figura {

    private float lado;
    public String nombre = "cuadrado";

    public Cuadrado(float lado, String nombre){
        this.lado = lado;
        this.nombre = nombre;
    }
    public float getArea(){
        return (float)(lado*lado);
    }

    public float getPerimetro(){
        return (float) (4*lado);
    }

    public String getNombre(){
        return nombre;
    }
}
