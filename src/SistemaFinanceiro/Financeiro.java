package SistemaFinanceiro;

import java.util.Scanner;

public abstract class Financeiro implements InterfaceCadastro {
    private int id, numero;
    private String emissao, vencimento, pagamento;
    private double valor, juros, multa, desconto, total;

    Financeiro() {
        this.id = 0;
        this.numero = 0;
        this.emissao = "";
        this.vencimento = "";
        this.pagamento = "";
        this.valor = 0.0;
        this.juros = 0.0;
        this.multa = 0.0;
        this.desconto = 0.0;
        this.total = 0.0; // Inicializa como 0.0
    }

    @Override
    public void entrar(Scanner input) {
        System.out.println("Digite o ID: ");
        this.id = input.nextInt();

        System.out.println("Digite o número: ");
        this.numero = input.nextInt();

        System.out.println("Digite a data de emissão: ");
        this.emissao = input.next();

        System.out.println("Digite a data de vencimento: ");
        this.vencimento = input.next();

        System.out.println("Digite a data de pagamento: ");
        this.pagamento = input.next();

        System.out.println("Digite o valor: ");
        this.valor = input.nextDouble();

        System.out.println("Digite o juros: ");
        this.juros = input.nextDouble();

        System.out.println("Digite a multa: ");
        this.multa = input.nextDouble();

        System.out.println("Digite o desconto: ");
        this.desconto = input.nextDouble();

        setTotal();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Número: " + this.numero);
        System.out.println("Data de emissão: " + this.emissao);
        System.out.println("Data de vencimento: " + this.vencimento);
        System.out.println("Data de pagamento: " + this.pagamento);
        System.out.println("Valor: " + this.valor);
        System.out.println("Juros: " + this.juros);
        System.out.println("Multa: " + this.multa);
        System.out.println("Desconto: " + this.desconto);
        System.out.println("Total: " + this.total); 
    }

    // Getters

    public int getId() {
        return this.id;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getEmissao() {
        return this.emissao;
    }

    public String getVencimento() {
        return this.vencimento;
    }

    public String getPagamento() {
        return this.pagamento;
    }

    public double getValor() {
        return this.valor;
    }

    public double getJuros() {
        return this.juros;
    }

    public double getMulta() {
        return this.multa;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public double getTotal() {
        return this.total;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public void setValor(double valor) {
        this.valor = valor;
        setTotal(); 
    }

    public void setJuros(double juros) {
        this.juros = juros;
        setTotal(); 
    }

    public void setMulta(double multa) {
        this.multa = multa;
        setTotal(); 
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
        setTotal(); 
    }

    private void setTotal() {
        this.total = this.valor + this.juros + this.multa - this.desconto;
    }
}