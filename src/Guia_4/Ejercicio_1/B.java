package Guia_4.Ejercicio_1;

public class B extends A {

    public int m1(){
        return 8;
    }
    public int m2(){
        return super.m2();
    }
    public int m4(){
        return this.m1()*2;
    }
    public int m5(){
        return this.m5();
    }
    public int m7(){
        return super.m4();
    }
}
