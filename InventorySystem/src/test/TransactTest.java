package test;

import main.java.others.Transact;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactTest {

    @Test
    void testTransactCreation() {
        Transact transact = new Transact(1, "2024-03-05", 101, 201, "John Doe");
        assertEquals(1, transact.getTrID());
        assertEquals("2024-03-05", transact.getDate());
        assertEquals(101, transact.getAccID());
        assertEquals(201, transact.getPurchaseOrRentID());
        assertEquals("John Doe", transact.getIssuedBy());
    }

    @Test
    void testSettersAndGetters() {
        Transact transact = new Transact(1, "2024-03-05", 101, 201, "John Doe");
        transact.setTrID(2);
        transact.setDate("2024-03-06");
        transact.setAccID(102);
        transact.setPurchaseOrRentID(202);
        transact.setIssuedBy("Jane Smith");
        assertEquals(2, transact.getTrID());
        assertEquals("2024-03-06", transact.getDate());
        assertEquals(102, transact.getAccID());
        assertEquals(202, transact.getPurchaseOrRentID());
        assertEquals("Jane Smith", transact.getIssuedBy());
    }
}

