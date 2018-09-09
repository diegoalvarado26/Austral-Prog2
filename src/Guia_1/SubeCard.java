package Guia_1;

import org.junit.*;

public class SubeCard {

    private double saldo;

    public SubeCard(){}

    public SubeCard(float saldo){
        this.saldo = saldo;
    }

    public double deposit(float deposito_dinero){
        if (deposito_dinero <= 0){
            throw new IllegalArgumentException("No puede ingresar una cantidad negativa o nula.");
        }
        saldo+=deposito_dinero;
        return saldo;
    }



    public double charge(float cargo_viaje){
        if (cargo_viaje <= 0){
            throw new IllegalArgumentException("No puede cobrar un viaje de valor negativo o nulo.");
        }
        saldo-=cargo_viaje;
        return saldo;
    }

    public double balance_check(){

        return saldo;
    }



}
