package desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static desafio.Number.verifyNumber;
import org.junit.jupiter.api.Test;

class NumberTest {
    @Test
    void primeNumber(){
        assertEquals("Prime number", verifyNumber(2));
    }

    @Test
    void notPrimeNumber(){
        assertEquals("Not a prime number", verifyNumber(8));
    }

    @Test
    void invalidArgument(){
        assertEquals("Invalid argument", verifyNumber(-5));
    }
}