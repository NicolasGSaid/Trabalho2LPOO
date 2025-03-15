package SistemaFinanceiro;

import java.util.Scanner;

public abstract class PessoaJuridica extends Pessoa {
    Scanner scanner = new Scanner(System.in);

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

    // Metodo para a impresao dos dados de pessoa juridica

    public void imprimmir() {
        super.imprimir();
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição estadual: " + inscricaoEstadual);
        System.out.println("Contato: " + contato);
    }

    // Getters
    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    // Setters
    public void setCnpj() {
        System.out.println("Digite o novo CNPJ: ");
        this.cnpj = scanner.nextLine();
    }

    public void setInscricaoEstadual() {
        System.out.println("Digite a nova Inscrição estadual: ");
        this.inscricaoEstadual = scanner.nextLine();
    }

    public void setContato() {
        System.out.println("Digite o novo Contato: ");
        this.contato = scanner.nextLine();

    }

    public void setPessoaJuridica() {
        System.out.println("Digite o novo CNPJ: ");
        this.cnpj = scanner.nextLine();
        System.out.println("Digite a nova Inscrição estadual: ");
        this.inscricaoEstadual = scanner.nextLine();
        System.out.println("Digite o novo Contato: ");
        this.contato = scanner.nextLine();
    }
}
