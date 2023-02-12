package Ordenador;
import Itens.Produto;
import java.util.Comparator;

public class OrdenadorPrecoCrescente implements Comparator<Produto> {
    
    public OrdenadorPrecoCrescente(){

    }

    @Override
    public int compare(Produto produto1, Produto produto2) {
            if(produto1.getPreco().compareTo(produto2.getPreco()) > 0){
                return 1;
            }
            return -1;        
        
    }
}
