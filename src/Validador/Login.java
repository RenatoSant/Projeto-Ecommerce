package Validador;

import java.util.Scanner;



public class Login extends Cadastro {

    private Scanner scan = new Scanner(System.in);
    private String loginNome;
    private String loginSenha;


    public Login(){

    }

    public void loginDeAcesso(){
        System.out.println("Bem vindo ao login!");
        System.out.println("Digite seu nome: ");
        loginNome = scan.nextLine();
        System.out.println("Digite sua senha: ");
        loginSenha = scan.nextLine();
            for(int i = 0; i < cadastroUsuario.size(); i++){

                if(cadastroUsuario.get(i).getNome().equals(loginNome) && cadastroUsuario.get(i).getSenha().equals(loginSenha)){
                     System.out.println("Seja bem vindo " + cadastroUsuario.get(i).getNome());
                     System.out.println("Login autorizado"); 
                }              
               
            }
        
            
    }
}
