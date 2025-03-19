package SistemaFinanceiro;

import java.util.Scanner;

public class Fornecedor extends PessoaJuridica{ 
    private String LimiteCredito;
    
    Fornecedor(){
        super();
        this.LimiteCredito = "";
    }

    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o Limite de Crédito:");
        this.LimiteCredito = input.nextLine();
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Limite de Crédito: " + this.LimiteCredito);
    }

    //Getters
    public String getLimiteCredito(){
        return this.LimiteCredito;
    }

    //SetterS
    public void setLimiteCredito(String LimiteCredito){
        this.LimiteCredito = LimiteCredito;
    }
}
