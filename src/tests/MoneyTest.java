package tests;

import com.tddmoney.www.Money;
import org.junit.Test;

import static org.junit.Assert.*;


public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5,"USD");
        assertEquals(Money.dollar(10,"USD"),five.times(2));
        assertEquals(Money.dollar(15,"USD"),five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5,"CHF");
        assertEquals(Money.franc(10,"CHF"),five.times(2));
        assertEquals(Money.franc(15,"CHF"),five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5,"USD").equals(Money.dollar(5,"USD")));
        assertFalse(Money.dollar(5,"USD").equals(Money.dollar(6,"USD")));

        assertTrue(Money.franc(5,"CHF").equals(Money.franc(5,"CHF")));
        assertFalse(Money.franc(5,"CHF").equals(Money.franc(6,"CHF")));

        assertFalse(Money.franc(5,"CHF").equals(Money.dollar(5,"USD")));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1,"USD").currency());

    }
}