package Guia_2.Ejercicio_1;

public class BankAccount { //Ejercicio 1

    /*
    CONSIGNA:
    Implemente la clase BankAccount,
    que cuenta con un código de cuenta, y la posibilidad de depositar y extraer,
    tal como consultar el balance de esta.


Indique: ¿Qué tipo de agregación tiene la clase Banco con sus componentes?
     */

    private int cbu;
    private double saldo;

    public BankAccount(){}
    public BankAccount(int cbu, double saldo){
        this.cbu = cbu;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getCBU(){
        return cbu;
    }

    public double depositar(double deposito){ //Devuelve saldo actual
        if (deposito <= 0){
            throw new IllegalArgumentException("No puede depositar cantidades menores o iguales a 0.");
        }
        return (double) (saldo+=deposito);
    }

    public double extraer(double deposito){
        if (deposito <= 0)
            throw new IllegalArgumentException("No puede extraer cantidades menores o iguales a 0.");
        return (double) (saldo-=deposito);
    }


}
