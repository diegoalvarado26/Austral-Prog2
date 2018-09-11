package Guia_4.Ejercicio_1;

public class C extends B {

    public int m1(){
        return super.m3();
    }
    public int m2(){
        return this.m5();
    }
    public int m5() {
        return super.m5();
    }
    public int m6(){
        return 3;
    }
}
