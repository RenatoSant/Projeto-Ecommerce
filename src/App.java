import java.util.Collections;

import Itens.*;
import Listas.*;
import Ordenador.*;
import Validador.Login;
public class App {
    public static void main(String[] args) throws Exception {
        //Login admin1 = new Login();
        //admin1.cadastroPerfil();
        //admin1.loginDeAcesso();
        Lista lista1 = new Lista();
        lista1.setProdutos(new Produto("Arroz", "Mercado", "Pai joao", 6.79));
        lista1.setProdutos(new Produto("Feijao", "Mercado", "Estrela", 4.25));
        lista1.setProdutos(new Livro("Overlord","Livro", "Maruyama", "JBC", "Dark fantasy", 89.59));
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        } 
        System.out.println("Lista crescente ordenada por nome --------------------- ");
        Collections.sort(lista1.getProdutos(), new OrdenadorNomeCrescente());
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        }
        System.out.println("Lista decrescente ordenada por nome ----------------");
        Collections.sort(lista1.getProdutos(), new OrdenadorNomeDecrescente());
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        }
        System.out.println("Lista crescente ordenada por preço -----------------");
        Collections.sort(lista1.getProdutos(), new OrdenadorPrecoCrescente());
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        }
        System.out.println("Lista decrescente ordenada por preço ----------------");
        Collections.sort(lista1.getProdutos(), new OrdenadorPrecoDescrescente());
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        }
        lista1.editorDeListas();
        for (Produto listas : lista1.getProdutos()) {
            System.out.println(listas.toString());
        }
        lista1.filtroDeListas();
        lista1.printFiltro();
    }
}        

