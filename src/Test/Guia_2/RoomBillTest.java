package Guia_2;

import Guia_2.Ejercicio_4.RoomBill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomBillTest {

    RoomBill hab = new RoomBill(43, 10);

    @Test
    void generateInsumoTotal() {
        assertEquals(hab.generateInsumoTotal(), 10);

    }

    @Test
    void realizarConsumo() {
        assertEquals(hab.realizarConsumo(5), 15);
    }
}