package desafio.Intercecção;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class InterseccaoClienteTest {
    @Test
    void intersectionTest(){
        List<String> premiumCostumers = new ArrayList<>(Arrays.asList("GUSTAVO", "MARCIO", "JOAO", "FELIPE"));
        List<String> inactiveCostumers = new ArrayList<>(Arrays.asList("JORGE", "GUSTAVO", "MARCIO", "FABRICIO"));

        assertEquals(Arrays.asList("GUSTAVO", "MARCIO"), new InterseccaoCliente(premiumCostumers, inactiveCostumers).get());
    }
}