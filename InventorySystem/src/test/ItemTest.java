package test;

import main.java.others.Item;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTest {

    @Test
    void testItemCreation() {
        Item item = new Item(1, "Laptop", 10, true, true, 999.99, 50.00, "laptop.jpg", "Electronics");
        assertEquals(1, item.getId());
        assertEquals("Laptop", item.getName());
        assertEquals(10, item.getStock());
        assertEquals(true, item.isRent());
        assertEquals(true, item.isSale());
        assertEquals(999.99, item.getSalePrice());
        assertEquals(50.00, item.getRentRate());
        assertEquals("laptop.jpg", item.getPhoto());
        assertEquals("Electronics", item.getItemType());
    }

    @Test
    void testSettersAndGetters() {
        Item item = new Item(1, "Laptop", 10, true, true, 999.99, 50.00, "laptop.jpg", "Electronics");
        item.setId(2);
        item.setName("Desktop");
        item.setStock(5);
        item.setRent(false);
        item.setSale(false);
        item.setSalePrice(899.99);
        item.setRentRate(40.00);
        item.setPhoto("desktop.jpg");
        item.setItemType("Computers");
        assertEquals(2, item.getId());
        assertEquals("Desktop", item.getName());
        assertEquals(5, item.getStock());
        assertEquals(false, item.isRent());
        assertEquals(false, item.isSale());
        assertEquals(899.99, item.getSalePrice());
        assertEquals(40.00, item.getRentRate());
        assertEquals("desktop.jpg", item.getPhoto());
        assertEquals("Computers", item.getItemType());
    }
}
