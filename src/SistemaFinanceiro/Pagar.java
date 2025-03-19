package SistemaFinanceiro;

import java.util.Scanner;

public class Pagar extends Financeiro{
    private Fornecedor fornecedor;
    private String boleto;

    Pagar(){
        super();
        this.fornecedor = null;
        this.boleto = "";
    }
    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o boleto:");
        this.boleto = input.nextLine();
        }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Boleto: " + this.boleto);

    }

    //Getters
    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }

    public String getBoleto(){
        return this.boleto;
    }

    //Setters

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }

    public void setBoleto(String boleto){
        this.boleto = boleto;
    }
}
