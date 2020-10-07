package desafio.Intercecção;

import java.util.ArrayList;
import java.util.List;

public class InterseccaoCliente {
    private List<String> newList;

    public InterseccaoCliente(List<String> clientesPremium, List<String> clientesInativos) {
        newList = this.intersection(clientesPremium, clientesInativos);
    }

    private  <T> List<T> intersection(List<T> clientesPremium, List<T> clientesInativos){
        List<T> arrayIntercected = new ArrayList<T>();

        for (T t : clientesPremium){
            if(clientesInativos.contains(t)){
                arrayIntercected.add(t);
            }
        }

        return arrayIntercected;
    }

    public List<String> get(){
        return newList;
    }
}
