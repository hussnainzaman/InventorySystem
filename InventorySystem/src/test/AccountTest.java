package test;

import main.java.others.Account;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testAccountCreation() {
        Account account = new Account(123, "John Doe", "Savings Account", "Credit Card");
        assertEquals(123, account.getAccID());
        assertEquals("John Doe", account.getCusName());
        assertEquals("Savings Account", account.getAccName());
        assertEquals("Credit Card", account.getPaymethod());
    }

    @Test
    public void testSettersAndGetters() {
        Account account = new Account(123, "John Doe", "Savings Account", "Credit Card");
        account.setAccID(456);
        account.setCusName("Jane Smith");
        account.setAccName("Checking Account");
        account.setPaymethod("Debit Card");
        assertEquals(456, account.getAccID());
        assertEquals("Jane Smith", account.getCusName());
        assertEquals("Checking Account", account.getAccName());
        assertEquals("Debit Card", account.getPaymethod());
    }
}
