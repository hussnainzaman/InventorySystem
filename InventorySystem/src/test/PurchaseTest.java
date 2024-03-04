package test;

import main.java.others.Purchase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PurchaseTest {

    @Test
    void testPurchaseCreation() {
        Purchase purchase = new Purchase(1, 101, 201, "2024-03-05", 2, 100.0, 50.0);
        assertEquals(1, purchase.getPurID());
        assertEquals(101, purchase.getCusID());
        assertEquals(201, purchase.getItemID());
        assertEquals("2024-03-05", purchase.getDate());
        assertEquals(2, purchase.getQty());
        assertEquals(100.0, purchase.getPaid());
        assertEquals(50.0, purchase.getDue());
    }

    @Test
    void testSettersAndGetters() {
        Purchase purchase = new Purchase(1, 101, 201, "2024-03-05", 2, 100.0, 50.0);
        purchase.setPurID(2);
        purchase.setCusID(102);
        purchase.setItemID(202);
        purchase.setDate("2024-03-06");
        purchase.setQty(3);
        purchase.setPaid(150.0);
        purchase.setDue(75.0);
        assertEquals(2, purchase.getPurID());
        assertEquals(102, purchase.getCusID());
        assertEquals(202, purchase.getItemID());
        assertEquals("2024-03-06", purchase.getDate());
        assertEquals(3, purchase.getQty());
        assertEquals(150.0, purchase.getPaid());
        assertEquals(75.0, purchase.getDue());
    }
}
