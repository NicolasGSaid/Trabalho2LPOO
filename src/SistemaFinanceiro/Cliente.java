package SistemaFinanceiro;

import java.util.Scanner;

public class Cliente extends PessoaJuridica {
    String limiteDeCredito;

    Cliente(){
        super();
        this.limiteDeCredito = "";
    }

    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o limite de crédito:");
        this.limiteDeCredito = input.nextLine();
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Limite de crédito: " + this.limiteDeCredito);
    }
    
    //Getters
    public String getLimiteDeCredito(){
        return this.limiteDeCredito;
    }

    //Setters
    public void setLimiteDeCredito(String limiteDeCredito){
        this.limiteDeCredito = limiteDeCredito;
    }
}
