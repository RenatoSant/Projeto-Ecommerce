package Itens;

public class Mercado extends Produto {

    public Mercado(){

    }

    public Mercado(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }

    public void cadastroProdutos(String nome, String categoria, String marca, Double preco){
        listarProdutos.add(new Produto(nome, categoria, marca, preco));
    }
    public void listarProdutos(){
        for (int i = 0; i < listarProdutos.size(); i++){
           System.out.println(listarProdutos.get(i));
        }
    }
    
}
