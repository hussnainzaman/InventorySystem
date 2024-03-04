package test;

import main.java.others.Customer;
import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerCreation() {
        Date date = Date.valueOf("2000-01-01");
        Customer customer = new Customer(123, "John", "Doe", "123 Main St", "123-456-7890", "john@example.com", "photo.jpg", "Male", date);
        assertEquals(123, customer.getId());
        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals("123 Main St", customer.getAddress());
        assertEquals("123-456-7890", customer.getPhone());
        assertEquals("john@example.com", customer.getEmail());
        assertEquals("photo.jpg", customer.getPhoto());
        assertEquals("Male", customer.getGender());
        assertEquals(date, customer.getDate());
    }

    @Test
    public void testSettersAndGetters() {
        Customer customer = new Customer(123, "John", "Doe", "123 Main St", "123-456-7890", "john@example.com", "photo.jpg", "Male", Date.valueOf("2000-01-01"));
        customer.setId(456);
        customer.setFirstName("Jane");
        customer.setLastName("Smith");
        customer.setAddress("456 Elm St");
        customer.setPhone("987-654-3210");
        customer.setEmail("jane@example.com");
        customer.setPhoto("avatar.jpg");
        customer.setGender("Female");
        customer.setDate(Date.valueOf("1990-12-31"));
        assertEquals(456, customer.getId());
        assertEquals("Jane", customer.getFirstName());
        assertEquals("Smith", customer.getLastName());
        assertEquals("456 Elm St", customer.getAddress());
        assertEquals("987-654-3210", customer.getPhone());
        assertEquals("jane@example.com", customer.getEmail());
        assertEquals("avatar.jpg", customer.getPhoto());
        assertEquals("Female", customer.getGender());
        assertEquals(Date.valueOf("1990-12-31"), customer.getDate());
    }
}
