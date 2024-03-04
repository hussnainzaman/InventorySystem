package test;

import main.java.others.DBConnection;
import org.junit.jupiter.api.Test;
import java.sql.Connection;
import static org.junit.jupiter.api.Assertions.*;

public class DBConnectionTest {

    @Test
    public void testGetConnection() {
        Connection connection = DBConnection.getConnection();
        assertNotNull(connection);
        try {
            assertFalse(connection.isClosed());
            connection.close();
            assertTrue(connection.isClosed());
        } catch (Exception e) {
            fail("Exception thrown: " + e.getMessage());
        }
    }
}
