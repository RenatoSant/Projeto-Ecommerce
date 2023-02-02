package Usuarios;

public class Cliente extends Usuario {
    public Cliente(String nome, String senha) {
        super(nome, senha, "comum");
    }
    // métodos específicos para usuários comuns aqui
}