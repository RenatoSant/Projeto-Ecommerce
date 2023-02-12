package Itens;

public class Livro extends Produto {
    private String editora;
    private String autor;
    private String genero;

    public Livro(){
}
    public Livro(String nome,String categoria, String autor, String editora, String genero, Double preco){
        setNome(nome);
        setCategoria(categoria);
        setAutor(autor);
        setEditora(editora);
        setGenero(genero);
        setPreco(preco);
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
