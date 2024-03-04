package test;

import main.java.others.Rent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentTest {

    @Test
    void testRentCreation() {
        Rent rent = new Rent(1, 101, 201, "2024-03-05", "2024-03-10", 50.0, 25.0);
        assertEquals(1, rent.getRentID());
        assertEquals(101, rent.getItemID());
        assertEquals(201, rent.getCusID());
        assertEquals("2024-03-05", rent.getRentDate());
        assertEquals("2024-03-10", rent.getReturnDate());
        assertEquals(50.0, rent.getPayAmount());
        assertEquals(25.0, rent.getAmountDue());
    }

    @Test
    void testSettersAndGetters() {
        Rent rent = new Rent(1, 101, 201, "2024-03-05", "2024-03-10", 50.0, 25.0);
        rent.setRentID(2);
        rent.setItemID(102);
        rent.setCusID(202);
        rent.setRentDate("2024-03-06");
        rent.setReturnDate("2024-03-11");
        rent.setPayAmount(75.0);
        rent.setAmountDue(35.0);
        assertEquals(2, rent.getRentID());
        assertEquals(102, rent.getItemID());
        assertEquals(202, rent.getCusID());
        assertEquals("2024-03-06", rent.getRentDate());
        assertEquals("2024-03-11", rent.getReturnDate());
        assertEquals(75.0, rent.getPayAmount());
        assertEquals(35.0, rent.getAmountDue());
    }
}
