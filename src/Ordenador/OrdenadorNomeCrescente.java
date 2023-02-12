package Ordenador;
import java.util.Comparator;

import Itens.Produto;

public class OrdenadorNomeCrescente implements Comparator<Produto> {
    
    public OrdenadorNomeCrescente() {

    }


    @Override
    public int compare(Produto produto1, Produto produto2) {
        if(produto1.getNome().compareTo(produto2.getNome()) > 0){
            return 1;
        }
        return -1;
    }
}
