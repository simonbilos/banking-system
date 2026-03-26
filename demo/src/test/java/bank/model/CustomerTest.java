package bank.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class CustomerTest {
    Customer c;

    @BeforeEach 
    void setup() {
        c = new Customer("ACC001","Simon", "Novak", "01.01.2003");
    }

    @Test
    void testUpdatePhoneNumber_ValidInternationalWithSpaces() {
        c.updatePhoneNumber("+421 944 000 555");
        assertEquals("+421 944 000 555", c.getPhoneNumber());
    }

    @Test
    void testUpdatePhoneNumber_ValidLocalWithSpaces() {
        c.updatePhoneNumber("0944 000 555");
        assertEquals("0944 000 555", c.getPhoneNumber());
    }

    @Test
    void testUpdatePhoneNumber_ValidInternationalWithoutSpaces() {
        c.updatePhoneNumber("+421944000555");
        assertEquals("+421944000555", c.getPhoneNumber());
    }

    @Test
    void testUpdatePhoneNumber_ValidLocalWithoutSpaces() {    
        c.updatePhoneNumber("0944000555");
        assertEquals("0944000555", c.getPhoneNumber());
    }

    @Test
    void testUpdatePhoneNumber_InvalidTooShort() {
        assertThrowsExactly(IllegalArgumentException.class, () -> c.updatePhoneNumber("123"));
    }
    @Test
    void testUpdatePhoneNumber_InvalidWrongCountryCode() {
        assertThrowsExactly(IllegalArgumentException.class, () -> c.updatePhoneNumber("+422 111 222 333"));
    }
    @Test
    void testUpdatePhoneNumber_InvalidWrongLength() {
        assertThrowsExactly(IllegalArgumentException.class, () -> c.updatePhoneNumber("+421 000 000"));
    }
}