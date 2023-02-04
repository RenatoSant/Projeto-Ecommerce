package Itens;

public class Mercado extends Produto {

    public Mercado(){

    }

    public Mercado(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }

    public void cadastroProdutos(String nome, String categoria, String marca, Double preco){
        listaProdutos.add(new Produto(nome, categoria, marca, preco));
    }
    public void listarProdutos(){
        for (int i = 0; i < listaProdutos.size(); i++){
           System.out.println(listaProdutos.get(i));
        }
    }
    
}
