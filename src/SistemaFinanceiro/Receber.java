package SistemaFinanceiro;

import java.util.Scanner;

public class Receber extends Financeiro {
    private Cliente cliente;
    private String NotaFiscal;

    Receber() {
        this.cliente = null;
        this.NotaFiscal = "";
    }
    @Override
    public void entrar(Scanner input) {
            System.out.print("Digite o boleto:");
            this.NotaFiscal = input.nextLine();
    }
    
    @Override
    public void imprimir() {
        System.out.println("Nota Fiscal: " + this.NotaFiscal);
    }

    // Getters
    public Cliente getCliente() {
        return this.cliente;
    }

    public String getNotaFiscal() {
        return this.NotaFiscal;
    }

    // Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNotaFiscal(String NotaFiscal) {
        this.NotaFiscal = NotaFiscal;
    }
}
