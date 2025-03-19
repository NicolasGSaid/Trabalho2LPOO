package SistemaFinanceiro;

import java.util.Scanner;

public class Pagar extends Financeiro{
    private Fornecedor fornecedor;
    private String boleto;

    Pagar(){
        this.fornecedor = null;
        this.boleto = "";
    }
    @Override
    public void entrar(Scanner input){

        if(fornecedor == null){
            System.out.println("Fornecedor não encontrado!");
            return;
        }else{
            System.out.print("Digite o boleto:");
            this.boleto = input.nextLine();
        }
    }
    @Override
    public void imprimir(){
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
