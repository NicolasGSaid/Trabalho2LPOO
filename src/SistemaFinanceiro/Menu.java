package SistemaFinanceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;
    private List<Funcionario> funcionarios;
    private List<Receber> contasReceber;
    private List<Pagar> contasPagar;

    public Menu() {
        clientes = new ArrayList<>();
        fornecedores = new ArrayList<>();
        funcionarios = new ArrayList<>();
        contasReceber = new ArrayList<>();
        contasPagar = new ArrayList<>();
    }

    public void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) Cadastro de funcionários");
            System.out.println("2) Cadastro de clientes");
            System.out.println("3) Cadastro de fornecedores");
            System.out.println("4) Contas a receber");
            System.out.println("5) Contas a pagar");
            System.out.println("6) Fluxo de caixa");
            System.out.println("7) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: subMenu("Funcionário"); break;
                case 2: subMenu("Cliente"); break;
                case 3: subMenu("Fornecedor"); break;
                case 4: subMenu("Receber"); break;
                case 5: subMenu("Pagar"); break;
                case 6: exibirFluxoCaixa(); break;
                case 7: System.exit(0); break;
                default: System.out.println("Opção inválida!"); break;
            }
        }
    }

    public void subMenu(String tipo) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) Incluir " + tipo);
            System.out.println("2) Alterar " + tipo);
            System.out.println("3) Exibir " + tipo);
            System.out.println("4) Excluir " + tipo);
            System.out.println("5) Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1: incluir(tipo); break;
                case 2: alterar(tipo); break;
                case 3: exibir(tipo); break;
                case 4: excluir(tipo); break;
                case 5: return;
                default: System.out.println("Opção inválida!"); break;
            }
        }
    }

    public void incluir(String tipo) {
        switch (tipo) {
            case "Funcionário":
                Funcionario funcionario = new Funcionario();
                funcionario.entrar();
                funcionarios.add(funcionario);
                break;
            case "Cliente":
                Cliente cliente = new Cliente();
                cliente.entrar();
                clientes.add(cliente);
                break;
            case "Fornecedor":
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.entrar();
                fornecedores.add(fornecedor);
                break;
            case "Receber":
                Receber receber = new Receber();
                receber.entrar();
                contasReceber.add(receber);
                break;
            case "Pagar":
                Pagar pagar = new Pagar();
                pagar.entrar();
                contasPagar.add(pagar);
                break;
        }
    }

    public void alterar(String tipo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID para alterar: ");
        String id = scanner.nextLine();
        switch (tipo) {
            case "Funcionário":
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getId().equals(id)) {
                        funcionario.entrar();
                        return;
                    }
                }
                break;
            case "Cliente":
                for (Cliente cliente : clientes) {
                    if (cliente.getId().equals(id)) {
                        cliente.entrar();
                        return;
                    }
                }
                break;
            case "Fornecedor":
                for (Fornecedor fornecedor : fornecedores) {
                    if (fornecedor.getId().equals(id)) {
                        fornecedor.entrar();
                        return;
                    }
                }
                break;
            case "Receber":
                for (Receber receber : contasReceber) {
                    if (receber.getId().equals(id)) {
                        receber.entrar();
                        return;
                    }
                }
                break;
            case "Pagar":
                for (Pagar pagar : contasPagar) {
                    if (pagar.getId().equals(id)) {
                        pagar.entrar();
                        return;
                    }
                }
                break;
        }
        System.out.println(tipo + " não encontrado!");
    }

    public void exibir(String tipo) {
        switch (tipo) {
            case "Funcionário":
                for (Funcionario funcionario : funcionarios) {
                    funcionario.imprimir();
                }
                break;
            case "Cliente":
                for (Cliente cliente : clientes) {
                    cliente.imprimir();
                }
                break;
            case "Fornecedor":
                for (Fornecedor fornecedor : fornecedores) {
                    fornecedor.imprimir();
                }
                break;
            case "Receber":
                for (Receber receber : contasReceber) {
                    receber.imprimir();
                }
                break;
            case "Pagar":
                for (Pagar pagar : contasPagar) {
                    pagar.imprimir();
                }
                break;
        }
    }

    public void excluir(String tipo) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ID para excluir: ");
        String id = scanner.nextLine();
        switch (tipo) {
            case "Funcionário":
                funcionarios.removeIf(funcionario -> funcionario.getId().equals(id));
                break;
            case "Cliente":
                clientes.removeIf(cliente -> cliente.getId().equals(id));
                break;
            case "Fornecedor":
                fornecedores.removeIf(fornecedor -> fornecedor.getId().equals(id));
                break;
            case "Receber":
                contasReceber.removeIf(receber -> receber.getId().equals(id));
                break;
            case "Pagar":
                contasPagar.removeIf(pagar -> pagar.getId().equals(id));
                break;
        }
    }

    public void exibirFluxoCaixa() {
        double totalReceber = contasReceber.stream().mapToDouble(Receber::getTotal).sum();
        double totalPagar = contasPagar.stream().mapToDouble(Pagar::getTotal).sum();
        double saldo = totalReceber - totalPagar;

        System.out.println("Total a Receber: " + totalReceber);
        System.out.println("Total a Pagar: " + totalPagar);
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
}