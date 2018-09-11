package Guia_2;

import java.util.ArrayList;
import java.util.Arrays;

public class RoomBill { //Ejercicio 4

    /*
    CONSIGNA:
    Implemente la clase RoomBill, que permite registrar movimientos de consumos asignados a una habitación de hotel,
    que el huésped pagará al retirarse del mismo.
    A medida que se realizan consumos, estos se van registrando y permiten luego imprimir por pantalla los movimientos,
    permite además consultar el saldo de la habitación.
    Además, existe la posibilidad de ajustar el precio por día de la habitación en cualquier momento.
     */

    public int roomNumber;
    public float precioHabitacion;

    ArrayList<Float> insumos = new ArrayList<>(Arrays.asList());

    public RoomBill(int roomNumber, float precioHabitacion){
        this.roomNumber = roomNumber;
        this.precioHabitacion = precioHabitacion;

        insumos.add(0, precioHabitacion);

    }

    public float generateInsumoTotal(){
        float sumaTotal = 0;
        for (int i = 0; i < insumos.size(); i++){
            sumaTotal+=insumos.get(i);
        }
        return sumaTotal;
    }

    public float realizarConsumo(float montoConsumo){
        insumos.add(montoConsumo);
        return generateInsumoTotal();
    }

    public void setPrecioHabitacion(float nuevoPrecio){
        nuevoPrecio = precioHabitacion;
    }
}
