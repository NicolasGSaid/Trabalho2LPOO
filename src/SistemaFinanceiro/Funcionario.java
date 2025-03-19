package SistemaFinanceiro;

import java.util.Scanner;

public class Funcionario extends PessoaFisica {
    private String dataAdmissao, dataDemissao, ctps;
    private double salario;

    Funcionario(){
        super();
        this.dataAdmissao = "";
        this.dataDemissao = "";
        this.ctps = "";
        this.salario = 0;
    }
    @Override
    public void entrar(Scanner input){
        super.entrar(input);
        System.out.print("Digite a data de admissão:");
        this.dataAdmissao = input.nextLine();
        System.out.print("Digite a data de demissão:");
        this.dataDemissao = input.nextLine();
        System.out.print("Digite a CTPS:");
        this.ctps = input.nextLine();
        System.out.print("Digite o salário:");
        this.salario = input.nextDouble();
        input.nextLine();
    }
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Data de admissão: " + this.dataAdmissao);
        System.out.println("Data de demissão: " + this.dataDemissao);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salário: " + this.salario);
    }

    //Getters

    public String getDataAdmissao(){
        return this.dataAdmissao;
    }

    public String getDataDemissao(){
        return this.dataDemissao;
    }

    public String getCtps(){
        return this.ctps;
    }

    public double getSalario(){
        return this.salario;
    }

    //Setters
    
    public void setDataAdmissao(String dataAdmissao){
        this.dataAdmissao = dataAdmissao;
    }

    public void setDataDemissao(String dataDemissao){
        this.dataDemissao = dataDemissao;
    }

    public void setCtps(String ctps){
        this.ctps = ctps;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
