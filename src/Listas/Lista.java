package Listas;
import java.util.ArrayList;
import java.util.Scanner;

import Itens.Produto;

public class Lista implements FiltrarListas, EditarListas{
    
   private ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
   private ArrayList<Produto> filtroDeProdutos = new ArrayList<Produto>(); 
   private Scanner scan = new Scanner(System.in); 
    
    
    
    public Lista(){

    }

    

    public void setProdutos(Produto objeto){
        listaDeProdutos.add(objeto);

    }

    public ArrayList<Produto> getProdutos(){
        return listaDeProdutos;
    }

    @Override
    public String toString() {
        return "Listas [listaDeProdutos=" + listaDeProdutos + "]";
    }

    @Override
    public void filtroDeListas() {
        System.out.println("Bem vindos ao filtro de produtos!");
        System.out.println("Se quiser filtrar os produtos por Mercado digite 1, se for Livro ");
        System.out.println("digite 2 e se for Informatica digite 3.");
        int editor = Integer.parseInt(scan.nextLine());
       if(editor == 1){
            String atributo = "Mercado";
           for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getCategoria().equals(atributo)){
                    filtroDeProdutos.add(listaDeProdutos.get(i));
                }
           }            
        }
        if(editor == 2){
            String atributo = "Livro";
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getCategoria().equals(atributo)){
                    filtroDeProdutos.add(listaDeProdutos.get(i));
                }
            }
        }
        if(editor == 3){
            String atributo = "Informatica";
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getCategoria().equals(atributo)){
                    filtroDeProdutos.add(listaDeProdutos.get(i));
                }
            }
        }
    }

    public void printFiltro(){
        for (Produto produto : filtroDeProdutos) {
            System.out.println(produto);
        }
    }

    @Override
    public void editorDeListas() {
        System.out.println("Bem vindo ao editor de produtos!");
        System.out.println("Para alterar Nome digite 1,  Categoria digite 2, Marca digite 3, ");
        System.out.println("para Preço digite 4 se quiser deletar o Produto digite 5 ");
        System.out.println("O que você deseja alterar?");
        int editor = Integer.parseInt(scan.nextLine());
        
        if(editor == 1){
            System.out.println("Digite o nome do produto que será alterado: "); 
            String nome = scan.nextLine();
            System.out.println("Digite o novo nome:");
            String novoNome = scan.nextLine();
            for (int i = 0; i < listaDeProdutos.size(); i++) {
                if (listaDeProdutos.get(i).getNome().equals(nome)) {
                    listaDeProdutos.get(i).setNome(novoNome);
           
        }
    }
}
        if(editor == 2){
            System.out.println("Digite o nome do produto que será alterado: ");
            String nome = scan.nextLine();
            System.out.println("Digite a nova categoria: ");
            String categoria = scan.nextLine();
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getNome().equals(nome)) {
                    listaDeProdutos.get(i).setCategoria(categoria);
                }
            }
        }
        if(editor == 3){
            System.out.println("Digite o nome do produto que será alterado: ");
            String nome = scan.nextLine();
            System.out.println("Digite a nova marca: ");
            String marca = scan.nextLine();
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getNome().equals(nome)) {
                    listaDeProdutos.get(i).setMarca(marca);
                }
            }
        }
        if(editor == 4){
            System.out.println("Digite o nome do produto que será alterado: ");
            String nome = scan.nextLine();
            System.out.println("Digite o novo valor: ");
            double preco = scan.nextDouble();
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getNome().equals(nome)){
                    listaDeProdutos.get(i).setPreco(preco);
                }
            }
        }
        if (editor == 5){
            System.out.println("Digite o nome do produto que será deletado: ");
            String nome = scan.nextLine();
            System.out.println("Digite a marca do produto a ser deletado: ");
            String marca = scan.nextLine();
            for(int i = 0; i < listaDeProdutos.size(); i++){
                if(listaDeProdutos.get(i).getNome().equals(nome) && listaDeProdutos.get(i).getMarca().equals(marca)){
                   listaDeProdutos.remove(i);
                    
                }
            }
        }
    }   
    
}
