package SistemaFinanceiro;

import java.util.Scanner;

public class Endereco {
    Scanner scanner = new Scanner(System.in);


    // Atributos
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    // Construtor
    public Endereco() {
    }

    // Metodo para entrada 
    public void entrar(String logradouro, int numero, String complemento, String bairro, String cidade, String estado, String cep) {

        System.out.print("Digite o Logradouro: ");
        this.logradouro = scanner.nextLine();

        System.out.print("Digite o Número: ");
        this.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o Complemento: ");
        this.complemento = scanner.nextLine();

        System.out.print("Digite o Bairro: ");
        this.bairro = scanner.nextLine();

        System.out.print("Digite a Cidade: ");
        this.cidade = scanner.nextLine();

        System.out.print("Digite o Estado: ");
        this.estado = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        this.cep = scanner.nextLine();
        
    }

    // Metodo para exibir dados
    public void imprimir() {
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Numero: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
        System.out.println("CEP: " + cep);
    }

    // Getters

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    // Setters

    public void setEndereco(){
        setLogradouro(logradouro);
        setNumero(numero);
        setComplemento(complemento);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
    }

    public void setLogradouro(String logradouro) {
        System.out.print("Digite o novo Logradouro: ");
        this.logradouro = scanner.nextLine();
    }

    public void setNumero(int numero) {
        System.out.print("Digite o novo Número: ");
        this.numero = scanner.nextInt();
        scanner.nextLine();
    }

    public void setComplemento(String complemento) {
        System.out.print("Digite o novo Complemento: ");
        this.complemento = scanner.nextLine();
    }

    public void setBairro(String bairro) {
        System.out.print("Digite o novo Bairro");
        this.bairro = scanner.nextLine();
    }

    public void setCidade(String cidade) {
        System.out.print("Digite a nova Cidade: ");
        this.cidade = scanner.nextLine();
    }

    public void setEstado(String estado) {
        System.out.print("Digite o novo Estado: ");
        this.estado = scanner.nextLine();
    }

    public void setCep(String cep) {
        System.out.print("Digite o novo CEP: ");
        this.cep = scanner.nextLine();
    }
}

