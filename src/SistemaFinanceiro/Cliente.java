package SistemaFinanceiro;

import java.util.Scanner;

public class Cliente extends PessoaJuridica {
    private String limiteCredito;
    private Endereco enderecoCobranca;

    public String getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(String limiteCredito) { this.limiteCredito = limiteCredito; }
    public Endereco getEnderecoCobranca() { return enderecoCobranca; }
    public void setEnderecoCobranca(Endereco enderecoCobranca) { this.enderecoCobranca = enderecoCobranca; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite de crédito: ");
        this.limiteCredito = scanner.nextLine();

        System.out.println("Digite o endereço de cobrança:");
        this.enderecoCobranca = new Endereco();
        this.enderecoCobranca.entrar();

        // Implementar entrada de dados para os atributos da classe PessoaJuridica
        super.entrar();
    }

    @Override
    public void imprimir() {
        System.out.println("Limite de Crédito: " + this.limiteCredito);
        System.out.println("Endereço de Cobrança:");
        this.enderecoCobranca.imprimir();

        // Implementar impressão dos dados da classe PessoaJuridica
        super.imprimir();
    }
}