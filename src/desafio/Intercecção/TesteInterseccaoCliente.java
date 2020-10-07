package desafio.Intercecção;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteInterseccaoCliente {

    public static void main(String[] args) {
        List<String> inactiveCostumers = new ArrayList<>(Arrays.asList("JORGE", "GUSTAVO", "MARCIO", "FABRICIO"));
        List<String> premiumCostumers = new ArrayList<>(Arrays.asList("GUSTAVO", "MARCIO", "JOAO", "FELIPE"));

        if(new InterseccaoCliente(premiumCostumers, inactiveCostumers).get().equals(Arrays.asList("GUSTAVO", "MARCIO"))){
            System.out.println("TEST EXIT SUCCESSFUL");
        } else {
            throw new Error("TEST FAILED");
        }
    }
}

