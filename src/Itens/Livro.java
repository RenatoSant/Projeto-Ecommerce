package Itens;

public class Livro extends Produto {
    private String editora;
    private String autor;
    private String genero;

    public Livro(){
}
    public Livro(String nome, String autor, String editora, String genero, Double preco){
        setNome(nome);
        setAutor(autor);
        setEditora(editora);
        setGenero(genero);
        setPreco(preco);
    }
    


    public void cadastrarLivro(String nome, String autor, String editora, String genero, Double preco){
        listarProdutos.add(new Livro(nome, autor, editora, genero, preco));
    }

    public void listarProdutos(){
        for (int i = 0; i < listarProdutos.size(); i++){
           System.out.println(listarProdutos.get(i));}
        }


    public String getEditora() {
        return editora;
    }




    public void setEditora(String editora) {
        this.editora = editora;
    }




    public String getAutor() {
        return autor;
    }




    public void setAutor(String autor) {
        this.autor = autor;
    }




    public String getGenero() {
        return genero;
    }




    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
