package com.codewars.kata_6kyu;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditCardIssuerTest {

	@Test
	void testGetIssuer() {
        assertEquals("VISA",       CreditCardIssuer.getIssuer("4111111111111111"));
        assertEquals("AMEX",       CreditCardIssuer.getIssuer("378282246310005"));
        assertEquals("Unknown",    CreditCardIssuer.getIssuer("9111111111111111"));
        assertEquals("Mastercard", CreditCardIssuer.getIssuer("5105105105105100"));
        assertEquals("Discover",   CreditCardIssuer.getIssuer("6011111111111117"));
        assertEquals("VISA",       CreditCardIssuer.getIssuer("4111111111111"));
        assertEquals("Unknown",    CreditCardIssuer.getIssuer("411111111111111"));
	}

}
