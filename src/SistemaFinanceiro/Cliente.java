package SistemaFinanceiro;

import java.util.Scanner;

public class Cliente extends PessoaJuridica {
    String limiteDeCredito;
    Endereco enderecoDeCobranca;

    Cliente(){
        super();
        this.limiteDeCredito = "";
        this.enderecoDeCobranca = new Endereco();
    }

    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o limite de crédito:");
        this.limiteDeCredito = input.nextLine();
        this.enderecoDeCobranca.entrar(input);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Limite de crédito: " + this.limiteDeCredito);
        this.enderecoDeCobranca.imprimir();
    }
    
    //Getters
    public String getLimiteDeCredito(){
        return this.limiteDeCredito;
    }

    public Endereco getEnderecoDeCobranca(){
        return this.enderecoDeCobranca;
    }

    //Setters

    public void setLimiteDeCredito(String limiteDeCredito){
        this.limiteDeCredito = limiteDeCredito;
    }

    public void setEnderecoDeCobranca(Endereco enderecoDeCobranca){
        this.enderecoDeCobranca = enderecoDeCobranca;
    }
}
