package SistemaFinanceiro;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public abstract class PessoaJuridica extends Pessoa {
    // Atributos privados
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;
    
    // Construtor padrão
    public PessoaJuridica() {
        super(); // Chama o construtor da classe pai (Pessoa)
    }
    
    // Método para entrada de dados específicos de PessoaJuridica
    public void entrar(String cnpj, String inscricaoEstadual, String contato) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
        System.out.println();
    }
}
    
   