package SistemaFinanceiro;

import java.util.Scanner;

public abstract class PessoaFisica extends Pessoa{
    private String cpf, rg, emissor;

    PessoaFisica(){
        super();
        this.cpf = "";
        this.rg = "";
        this.emissor = "";
    }

    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o CPF:");
        this.cpf = input.nextLine();
        System.out.print("Digite o RG:");
        this.rg = input.nextLine();
        System.out.print("Digite o emissor:");
        this.emissor = input.nextLine();
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Emissor: " + this.emissor);
    }

    //Getters
    public String getCpf(){
        return this.cpf;
    }

    public String getRg(){
        return this.rg;
    }

    public String getEmissor(){
        return this.emissor;
    }

    //Setters

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public void setEmissor(String emissor){
        this.emissor = emissor;
    }
}