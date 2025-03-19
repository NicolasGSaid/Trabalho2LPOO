package SistemaFinanceiro;

import java.util.Scanner;

public abstract class PessoaJuridica extends Pessoa{

    private String cnpj, inscricaoEstadual, contato; 

    PessoaJuridica(){
        super();
        this.cnpj = "";
        this.inscricaoEstadual = "";
        this.contato = "";
    }

    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o CNPJ:");
        this.cnpj = input.nextLine();
        System.out.print("Digite a Inscrição Estadual:");
        this.inscricaoEstadual = input.nextLine();
        System.out.print("Digite o Contato:");
        this.contato = input.nextLine();
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
        System.out.println("Contato: " + this.contato);
    }

    //Getters
    public String getCnpj(){
        return this.cnpj;
    }

    public String getInscricaoEstadual(){
        return this.inscricaoEstadual;
    }

    public String getContato(){
        return this.contato;
    }

    //Setters
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public void setInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setContato(String contato){
        this.contato = contato;
    }
}
