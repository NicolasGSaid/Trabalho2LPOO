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
        this.total = 0.0;
    }

    @Override
    public void entrar(Scanner input) {
        
        
    }
    
}
