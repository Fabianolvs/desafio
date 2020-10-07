package desafio;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static desafio.Fatorial.fatorial;
import static desafio.Fatorial.lastNumberBeforeZero;
import static org.junit.jupiter.api.Assertions.*;

class FatorialTest extends TestCase {
    @Test
    void fatorialTest(){
        assertEquals(5040, fatorial(7));
    }

    @Test
    void lastNumberBefoZeroTest(){
        String fatorialString = String.valueOf(fatorial(7));
        assertEquals("O ultimo numero anterioro a 0 é 4", lastNumberBeforeZero(fatorialString));
    }

    @Test
    void doesNotExistNumberBeforeZero(){
        String fatorialString = String.valueOf(fatorial(4));
        assertEquals("Não existe ultimo numero anterior a zero", lastNumberBeforeZero(fatorialString));
    }
}