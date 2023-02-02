package Itens;

public class Livro extends Produto {
    private String editora;
    private String autor;

    public Livro(){

    }

    public Livro(String nome, String categoria, String marca, Double preco) {
        super(nome, categoria, marca, preco);
    }
    
    
}
