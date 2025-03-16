package SistemaFinanceiro;

import java.util.Scanner;

public class Funcionario extends PessoaFisica {
    private String dataAdmissao;
    private String dataDemissao;
    private String ctps;
    private String salario;

    public String getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(String dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public String getDataDemissao() { return dataDemissao; }
    public void setDataDemissao(String dataDemissao) { this.dataDemissao = dataDemissao; }
    public String getCtps() { return ctps; }
    public void setCtps(String ctps) { this.ctps = ctps; }
    public String getSalario() { return salario; }
    public void setSalario(String salario) { this.salario = salario; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data de admissão: ");
        this.dataAdmissao = scanner.nextLine();

        System.out.print("Digite a data de demissão: ");
        this.dataDemissao = scanner.nextLine();

        System.out.print("Digite o CTPS: ");
        this.ctps = scanner.nextLine();

        System.out.print("Digite o salário: ");
        this.salario = scanner.nextLine();

        // Implementar entrada de dados para os atributos da classe PessoaFisica
        super.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("Data de Admissão: " + this.dataAdmissao);
        System.out.println("Data de Demissão: " + this.dataDemissao);
        System.out.println("CTPS: " + this.ctps);
        System.out.println("Salário: " + this.salario);

        // Implementar impressão dos dados da classe PessoaFisica
        super.imprimir();
    }
}