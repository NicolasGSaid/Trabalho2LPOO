package SistemaFinanceiro;

import java.util.Scanner;

public class Pagar extends Financeiro {
    private Fornecedor fornecedor;
    private String boleto;

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }
    public String getBoleto() { return boleto; }
    public void setBoleto(String boleto) { this.boleto = boleto; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do fornecedor: ");
        String fornecedorId = scanner.nextLine();
        // Aqui você deve buscar o fornecedor pelo ID e atribuí-lo ao atributo fornecedor
        // Exemplo: this.fornecedor = buscarFornecedorPorId(fornecedorId);

        System.out.print("Digite o boleto: ");
        this.boleto = scanner.nextLine();

        // Implementar entrada de dados para os atributos da classe Financeiro
        super.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("Fornecedor: " + (this.fornecedor != null ? this.fornecedor.getId() : "N/A"));
        System.out.println("Boleto: " + this.boleto);

        // Implementar impressão dos dados da classe Financeiro
        super.imprimir();
    }
}