package Validador;

import java.util.ArrayList;
import java.util.Scanner;

import Usuarios.Administrador;
import Usuarios.Cliente;
import Usuarios.Usuario;

public class Cadastro {
    protected Scanner scan = new Scanner(System.in);
    protected final String Compara = "S";
    protected String escolha;
    protected String cadastroAdminNome;
    protected String cadastroAdminSenha;
    protected String cadastroClienteNome;
    protected String cadastroClienteSenha;
    protected ArrayList<Usuario> cadastroUsuario = new ArrayList<Usuario>();
    
    

    public Cadastro(){

    }

    public void cadastroPerfil(){
        System.out.println("Bem vindo ao cadastro de perfil!");
        System.out.println("Deseja fazer um cadastro? S/N: ");
        escolha = scan.nextLine();
        while(Compara.equals(escolha)){
            System.out.println("Por favor digite 1 para administrador e 2 para cliente");
            int cadastroPerfil = Integer.parseInt(scan.nextLine());
            if(cadastroPerfil == 1){
                System.out.println("Digite o seu nome completo: ");
                cadastroAdminNome = scan.nextLine();
                System.out.println("Digite uma senha: ");
                cadastroAdminSenha = scan.nextLine();
                cadastroUsuario.add(new Administrador(cadastroAdminNome, cadastroAdminSenha));
                
            }
            else if(cadastroPerfil == 2){
                System.out.println("Digite o seu nome completo: ");
                cadastroClienteNome = scan.nextLine();
                System.out.println("Digite uma senha: ");
                cadastroClienteSenha = scan.nextLine();
                cadastroUsuario.add(new Cliente(cadastroClienteNome, cadastroClienteSenha));
            }
            else{
                System.out.println("Por favor escolha uma opção válida");
            }
        System.out.println("Deseja fazer outro cadastro? S/N: ");
        escolha = scan.nextLine();
        }
        
    }
    public String getCadastroAdminNome() {
        return cadastroAdminNome;
    }   

    public String getCadastroAdminSenha() {
        return cadastroAdminSenha;
    }
}
