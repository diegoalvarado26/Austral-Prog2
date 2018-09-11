package Guia_4.Ejercicio_1;

public class A {

    public int m1(){
        return this.m7();
    }
    public int m2(){
        return this.m3();
    }
    public int m3(){
        return 3;
    }
    public int m4(){
        return this.m4();
    }

    public int m7(){
        throw new RuntimeException();
    }
}
