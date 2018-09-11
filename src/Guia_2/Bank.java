package Guia_2;

import java.util.ArrayList;

public class Bank { //Cont. Ejercicio 1

    /*
    Implemente la clase Bank, el cual posee una colección de cuentas bancarias.
    Dicho banco debe permitir transferir dinero entre cuentas
    */

    ArrayList<BankAccount> cuentas = new ArrayList<BankAccount>();
    private double dinero_total;

    public Bank (ArrayList<BankAccount> cuentas){
        this.cuentas = cuentas;
    }

    public BankAccount findCBU (int cbu){
        int posCuenta = 0;
        for (int i = 0; i < cuentas.size(); i++){
            if (cbu == cuentas.get(i).getCBU()){
                i = posCuenta;
            }
        }
        return cuentas.get(posCuenta);

    }

    public boolean transfer(double dinero_transferencia, int cbu_receptor, int cbu_emisor) {
        try {
            BankAccount receptor = findCBU(cbu_receptor);
            BankAccount emisor = findCBU(cbu_emisor);
            emisor.extraer(dinero_transferencia);
            receptor.depositar(dinero_transferencia);
            return true;

        } catch (IllegalArgumentException e) {
            return false;
        }
    }
}
