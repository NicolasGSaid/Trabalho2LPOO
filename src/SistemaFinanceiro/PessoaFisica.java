package SistemaFinanceiro;

import java.util.Scanner;

public abstract class PessoaFisica extends Pessoa {
    Scanner scanner = new Scanner(System.in);

    // Atributos privados
    private String cpf;
    private String rg;
    private String emissor;

    // Construtor padrão
    public PessoaFisica() {
        super(); // Chama o construtor da classe pai (Pessoa)
    }

    // Método para entrada de dados específicos de PessoaJuridica
    public void entrar(String cpf, String rg, String emissor) {
        this.cpf = cpf;
        this.rg = rg;
        this.emissor = emissor;
        System.out.println();
    }

    // Metodo para a impresao dos dados de pessoa juridica

    public void imprimmir() {
        super.imprimir();
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Emissor: " + emissor);
    }

    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEmissor() {
        return emissor;
    }

    // Setters
    public void setCpf() {
        System.out.println("Digite o novo CPF: ");
        this.cpf = scanner.nextLine();
    }

    public void setRg() {
        System.out.println("Digite o novo RG: ");
        this.rg = scanner.nextLine();
    }

    public void setEmissor() {
        System.out.println("Digite o novo Emissor: ");
        this.emissor = scanner.nextLine();
    }

    public void setPessoaFisica() {
        System.out.println("Digite o novo CPF: ");
        this.cpf = scanner.nextLine();
        System.out.println("Digite o novo RG: ");
        this.rg = scanner.nextLine();
        System.out.println("Digite o novo Emissor: ");
        this.emissor = scanner.nextLine();
    }
}
