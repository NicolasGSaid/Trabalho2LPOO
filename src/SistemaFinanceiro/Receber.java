package SistemaFinanceiro;

import java.util.Scanner;

public class Receber extends Financeiro {
    private Cliente cliente;
    private String notaFiscal;

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public String getNotaFiscal() { return notaFiscal; }
    public void setNotaFiscal(String notaFiscal) { this.notaFiscal = notaFiscal; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do cliente: ");
        String clienteId = scanner.nextLine();
        // Aqui você deve buscar o cliente pelo ID e atribuí-lo ao atributo cliente
        // Exemplo: this.cliente = buscarClientePorId(clienteId);

        System.out.print("Digite a nota fiscal: ");
        this.notaFiscal = scanner.nextLine();

        // Implementar entrada de dados para os atributos da classe Financeiro
        super.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("Cliente: " + (this.cliente != null ? this.cliente.getId() : "N/A"));
        System.out.println("Nota Fiscal: " + this.notaFiscal);

        // Implementar impressão dos dados da classe Financeiro
        super.imprimir();
    }
}