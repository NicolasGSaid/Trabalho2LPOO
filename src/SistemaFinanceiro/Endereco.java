package SistemaFinanceiro;

import java.util.Scanner;

public class Endereco implements InterfaceCadastro {

    private String logradouro, complemento, bairro, cidade;
    private int numero, cep;

    Endereco(){
        this.logradouro = "";
        this.complemento = "";
        this.bairro = "";
        this.cidade = "";
        this.numero = 0;
        this.cep = 0;
    }

    public void entrar(Scanner input){
            System.out.print("Digite o logradouro: ");
            this.logradouro = input.nextLine();
            System.out.print("Digite o complemento: ");
            this.complemento = input.nextLine();
            System.out.print("Digite o bairro: ");
            this.bairro = input.nextLine();
            System.out.print("Digite a cidade: ");
            this.cidade = input.nextLine();
            System.out.print("Digite o número: ");
            this.numero = input.nextInt();
            input.nextLine();
            System.out.print("Digite o CEP: ");
            this.cep = input.nextInt();
            input.nextLine();
        }
    

    public void imprimir(){
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Número: " + this.numero);
        System.out.println("CEP: " + this.cep);
    }

    //Getters
    public String getLogradouro(){
        return this.logradouro;
    }

    public String getComplemento(){
        return this.complemento;
    }

    public String getBairro(){
        return this.bairro;
    }

    public String getCidade(){
        return this.cidade;
    }

    public int getNumero(){
        return this.numero;
    }

    public int getCEP(){
        return this.cep;
    }

    //Setters
    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCEP(int cep){
        this.cep = cep;
    }
}