package SistemaFinanceiro;

import java.util.Scanner;

public class Fornecedor extends PessoaJuridica{ 
    private String LimiteCredito;
    private Endereco enderecoDeCobranca;
    
    Fornecedor(){
        super();
        this.LimiteCredito = "";
        this.enderecoDeCobranca = new Endereco();
    }

    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite o Limite de Crédito:");
        this.LimiteCredito = input.nextLine();
        this.enderecoDeCobranca.entrar(input);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Limite de Crédito: " + this.LimiteCredito);
        this.enderecoDeCobranca.imprimir();
    }

    //Getters
    public String getLimiteCredito(){
        return this.LimiteCredito;
    }

    public Endereco getEndereco(){
        return this.enderecoDeCobranca;
    }

    //SetterS
    public void setLimiteCredito(String LimiteCredito){
        this.LimiteCredito = LimiteCredito;
    }

    public void setEndereco(Endereco endereco){
        this.enderecoDeCobranca = endereco;
    }
}
