package SistemaFinanceiro;

import java.util.Scanner;

public class Fornecedor extends PessoaJuridica {
    private String limiteCompra;
    private String dataCadastro;
    private String site;

    public String getLimiteCompra() { return limiteCompra; }
    public void setLimiteCompra(String limiteCompra) { this.limiteCompra = limiteCompra; }
    public String getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(String dataCadastro) { this.dataCadastro = dataCadastro; }
    public String getSite() { return site; }
    public void setSite(String site) { this.site = site; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite de compra: ");
        this.limiteCompra = scanner.nextLine();

        System.out.print("Digite a data de cadastro: ");
        this.dataCadastro = scanner.nextLine();

        System.out.print("Digite o site: ");
        this.site = scanner.nextLine();

        // Implementar entrada de dados para os atributos da classe PessoaJuridica
        super.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("Limite de Compra: " + this.limiteCompra);
        System.out.println("Data de Cadastro: " + this.dataCadastro);
        System.out.println("Site: " + this.site);

        // Implementar impressão dos dados da classe PessoaJuridica
        super.imprimir();
    }
}