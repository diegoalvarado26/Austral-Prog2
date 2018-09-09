package Guia_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class SubeCardTest {



    @Test
    public void deposit() {
        SubeCard sube = new SubeCard(69);
        assertEquals(70,sube.deposit(1), 0);
    }

    @Test
    public void charge() {
    }

    @Test
    public void balance_check() {
    }
}