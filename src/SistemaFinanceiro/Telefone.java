package SistemaFinanceiro;

import java.util.Scanner;

public class Telefone {
    Scanner scanner = new Scanner(System.in);

    // Atributos
    private int ddd;
    private int numerotel;

    // Construtor
    public Telefone() {
    }

    // Método de entrada
    public void entrar(int ddd, int numerotel) {
        System.out.print("Digite o DDD: ");
        this.ddd = scanner.nextInt();
        System.out.print("Digite o Número: ");
        this.numerotel = scanner.nextInt();
    }

    // Método para impressao
    public void imprimir() {
        System.out.println("Telefone: (" + ddd + ")" + numerotel);
    }

    // Getters
    public int getDdd() {
        return ddd;
    }

    public int getNumero() {
        return numerotel;
    }

    // Setters
    public void setDdd(int ddd) {
        System.out.println("Digite o novo DDD: ");
        this.ddd = scanner.nextInt();
    }

    public void setNumero(int numero) {
        System.out.println("Digite o numero: ");
        this.numerotel = scanner.nextInt();
    }

    public void setTelefone(int ddd, int numero) {
        System.out.println("Digite o novo DDD: ");
        this.ddd = scanner.nextInt();
        System.out.println("Digite o numero: ");
        this.numerotel = scanner.nextInt();
    }

}