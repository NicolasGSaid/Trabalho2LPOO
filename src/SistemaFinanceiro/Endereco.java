package SistemaFinanceiro;

import java.util.Scanner;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o logradouro: ");
        this.logradouro = scanner.nextLine();

        System.out.print("Digite o número: ");
        this.numero = scanner.nextLine();

        System.out.print("Digite o complemento: ");
        this.complemento = scanner.nextLine();

        System.out.print("Digite o bairro: ");
        this.bairro = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        this.cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        this.estado = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        this.cep = scanner.nextLine();
    }

    public void imprimir() {
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
        System.out.println("CEP: " + this.cep);
    }

    // Getters e Setters
    public String getLogradouro() { return logradouro; }
    public void setLogradouro(String logradouro) { this.logradouro = logradouro; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
}