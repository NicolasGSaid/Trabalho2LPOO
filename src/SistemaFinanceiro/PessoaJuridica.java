package SistemaFinanceiro;

import java.util.Scanner;

public abstract class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private String contato;

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }
    public String getInscricaoEstadual() { return inscricaoEstadual; }
    public void setInscricaoEstadual(String inscricaoEstadual) { this.inscricaoEstadual = inscricaoEstadual; }
    public String getContato() { return contato; }
    public void setContato(String contato) { this.contato = contato; }

    @Override
    public void entrar() {
        super.entrar();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CNPJ: ");
        this.cnpj = scanner.nextLine();

        System.out.print("Digite a inscrição estadual: ");
        this.inscricaoEstadual = scanner.nextLine();

        System.out.print("Digite o contato: ");
        this.contato = scanner.nextLine();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
        System.out.println("Contato: " + this.contato);
    }
}