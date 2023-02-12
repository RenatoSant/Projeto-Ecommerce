package Ordenador;

import java.util.Comparator;
import Itens.Produto;

public class OrdenadorPrecoDescrescente implements Comparator<Produto> {
   
    public OrdenadorPrecoDescrescente(){

    }

    @Override
    public int compare(Produto produto1, Produto produto2) {
        if(produto1.getPreco().compareTo(produto2.getPreco()) > 0){
            return -1;
        }
        return 1;
    }
    
    
}
