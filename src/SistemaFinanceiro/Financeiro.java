package SistemaFinanceiro;

import java.util.Scanner;

public abstract class Financeiro implements InterfaceCadastro {
    private String id;
    private String numero;
    private String emissao;
    private String vencimento;
    private String pagamento;
    private double valor;
    private double juros;
    private double multa;
    private double desconto;
    private double total;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getEmissao() { return emissao; }
    public void setEmissao(String emissao) { this.emissao = emissao; }
    public String getVencimento() { return vencimento; }
    public void setVencimento(String vencimento) { this.vencimento = vencimento; }
    public String getPagamento() { return pagamento; }
    public void setPagamento(String pagamento) { this.pagamento = pagamento; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public double getJuros() { return juros; }
    public void setJuros(double juros) { this.juros = juros; }
    public double getMulta() { return multa; }
    public void setMulta(double multa) { this.multa = multa; }
    public double getDesconto() { return desconto; }
    public void setDesconto(double desconto) { this.desconto = desconto; }
    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public double calcularTotal() {
        return valor + juros - desconto;
    }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextLine();

        System.out.print("Digite o número: ");
        this.numero = scanner.nextLine();

        System.out.print("Digite a data de emissão: ");
        this.emissao = scanner.nextLine();

        System.out.print("Digite a data de vencimento: ");
        this.vencimento = scanner.nextLine();

        System.out.print("Digite a data de pagamento: ");
        this.pagamento = scanner.nextLine();

        System.out.print("Digite o valor: ");
        this.valor = scanner.nextDouble();

        System.out.print("Digite os juros: ");
        this.juros = scanner.nextDouble();

        System.out.print("Digite a multa: ");
        this.multa = scanner.nextDouble();

        System.out.print("Digite o desconto: ");
        this.desconto = scanner.nextDouble();

        this.total = calcularTotal();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Número: " + this.numero);
        System.out.println("Data de Emissão: " + this.emissao);
        System.out.println("Data de Vencimento: " + this.vencimento);
        System.out.println("Data de Pagamento: " + this.pagamento);
        System.out.println("Valor: " + this.valor);
        System.out.println("Juros: " + this.juros);
        System.out.println("Multa: " + this.multa);
        System.out.println("Desconto: " + this.desconto);
        System.out.println("Total: " + this.total);
    }
}