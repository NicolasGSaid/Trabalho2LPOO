package SistemaFinanceiro;

import java.util.Scanner;

public class Telefone {
    private String ddd;
    private String numero;

    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o DDD: ");
        this.ddd = scanner.nextLine();

        System.out.print("Digite o número: ");
        this.numero = scanner.nextLine();
    }

    public void imprimir() {
        System.out.println("Telefone: (" + this.ddd + ") " + this.numero);
    }

    // Getters e Setters
    public String getDdd() { return ddd; }
    public void setDdd(String ddd) { this.ddd = ddd; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
}