package bank.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    void testUpdatePhoneNumber_Valid() {
        Customer c = new Customer();
        c.updatePhoneNumber("+421 944 000 555");
        assertEquals("+421 944 000 555", c.getPhoneNumber());
    }

    @Test
    void testUpdatePhoneNumber_Invalid() {
        Customer c = new Customer();
        c.updatePhoneNumber("123");
        assertNull(c.getPhoneNumber());
    }
}