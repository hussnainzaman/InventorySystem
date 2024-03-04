package test;

import main.java.others.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testEmployeeCreation() {
        Employee employee = new Employee("john_doe", "password123", "john@example.com", "admin");
        assertEquals("john_doe", employee.getUsername());
        assertEquals("password123", employee.getPass());
        assertEquals("john@example.com", employee.getEmail());
        assertEquals("admin", employee.getAccess());
    }

    @Test
    public void testSettersAndGetters() {
        Employee employee = new Employee("john_doe", "password123", "john@example.com", "admin");
        employee.setUsername("jane_smith");
        employee.setPass("newpassword");
        employee.setEmail("jane@example.com");
        employee.setAccess("user");
        assertEquals("jane_smith", employee.getUsername());
        assertEquals("newpassword", employee.getPass());
        assertEquals("jane@example.com", employee.getEmail());
        assertEquals("user", employee.getAccess());
    }
}
