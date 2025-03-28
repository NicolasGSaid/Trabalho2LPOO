package SistemaFinanceiro;

import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuPrincipal = 0;
        int menuSecundario = 0;

        Funcionario funcionario = null;
        Cliente cliente = null;
        Fornecedor fornecedor = null;
        Receber receber = null;
        Pagar pagar = null;

        while (menuPrincipal != 7) {
            menuSecundario = 0;
            System.out.println("\n");
            System.out.println("Menu de Funcionários...[1]"); 
            System.out.println("Menu de Clientes.......[2]");
            System.out.println("Menu de Fornecedores...[3]");
            System.out.println("Contas a Receber.......[4]");
            System.out.println("Contas a Pagar.........[5]");
            System.out.println("Fluxo de Caixa.........[6]");
            System.out.println("Sair...................[7]");
            System.out.print("Opção: ");

            menuPrincipal = input.nextInt();
            input.nextLine(); // Limpar o buffer

            if (menuPrincipal == 1) { // Menu de Funcionários
                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Funcionário....[1]");
                    System.out.println("Alterar Funcionário....[2]");
                    System.out.println("Consultar Funcionário..[3]");
                    System.out.println("Excluir Funcionário....[4]");
                    System.out.println("Voltar.................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    if (menuSecundario == 1) { // Incluir Funcionário
                        funcionario = new Funcionario(); // Cria um novo objeto Funcionario
                        funcionario.entrar(input);
                        System.out.println("Funcionário cadastrado com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar Funcionário
                        if (funcionario == null) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Alterando dados do funcionário:");
                            funcionario.entrar(input); // Atualiza os dados do funcionário
                            System.out.println("Funcionário alterado com sucesso!");
                        }

                    } else if (menuSecundario == 3) { // Consultar Funcionário
                        if (funcionario == null) {
                            System.out.println("\n");
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("\n");
                            System.out.println("Dados do Funcionário:");
                            funcionario.imprimir();
                        }

                    } else if (menuSecundario == 4) { // Excluir Funcionário
                        if (funcionario == null) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            funcionario = null; // Remove o funcionário
                            System.out.println("Funcionário excluído com sucesso!");
                        }

                    } else if (menuSecundario != 5) {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (menuPrincipal == 2) { // Menu de Clientes
                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Cliente........[1]");
                    System.out.println("Alterar Cliente........[2]");
                    System.out.println("Consultar Cliente......[3]");
                    System.out.println("Excluir Cliente........[4]");
                    System.out.println("Voltar.................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    if (menuSecundario == 1) { // Incluir Cliente
                        cliente = new Cliente(); // Cria um novo objeto Cliente
                        cliente.entrar(input);
                        System.out.println("Cliente cadastrado com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar Cliente
                        if (cliente == null) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            System.out.println("Alterando dados do cliente:");
                            cliente.entrar(input); // Atualiza os dados do cliente
                            System.out.println("Cliente alterado com sucesso!");
                        }

                    } else if (menuSecundario == 3) { // Consultar Cliente
                        if (cliente == null) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            System.out.println("Dados do Cliente:");
                            cliente.imprimir();
                        }

                    } else if (menuSecundario == 4) { // Excluir Cliente
                        if (cliente == null) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            cliente = null; // Remove o cliente
                            System.out.println("Cliente excluído com sucesso!");
                        }

                    } else if (menuSecundario != 5) {
                        System.out.println("Opção inválida!");
                    }
                }

            } else if (menuPrincipal == 3) { // Menu de Fornecedores
                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Fornecedor......[1]");
                    System.out.println("Alterar Fornecedor......[2]");
                    System.out.println("Consultar Fornecedor....[3]");
                    System.out.println("Excluir Fornecedor......[4]");
                    System.out.println("Voltar..................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer
                    if (menuSecundario == 1) {
                        fornecedor = new Fornecedor();
                        fornecedor.entrar(input);
                        System.out.println("Fornecedor cadastrado com sucesso!");
                    } else if (menuSecundario == 2) {
                        if (fornecedor == null) {
                            System.out.println("Nenhum fornecedor cadastrado!");
                        } else {
                            System.out.println("Alterando dados do fornecedor:");
                            fornecedor.entrar(input);
                            System.out.println("Fornecedor alterado com sucesso!");
                        }
                    } else if (menuSecundario == 3) {
                        if (fornecedor == null) {
                            System.out.println("Nenhum fornecedor cadastrado!");
                        } else {
                            System.out.println("Dados do Fornecedor:");
                            fornecedor.imprimir();
                        }
                    } else if (menuSecundario == 4) {
                        if (fornecedor == null) {
                            System.out.println("Nenhum fornecedor cadastrado!");
                        } else {
                            fornecedor = null;
                            System.out.println("Fornecedor excluído com sucesso!");
                        }
                    }
                }
            } else if (menuPrincipal == 4) {
                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Conta a Receber....[1]");
                    System.out.println("Alterar Conta a Receber....[2]");
                    System.out.println("Consultar Conta a Receber..[3]");
                    System.out.println("Excluir Conta a Receber....[4]");
                    System.out.println("Voltar.....................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer
                    if (menuSecundario == 1) {
                        if (cliente == null) {
                            System.out.println("Nenhum cliente cadastrado!");
                        } else {
                            receber = new Receber();
                            receber.entrar(input);
                            System.out.println(
                                    "Conta a receber do cliente " + cliente.getNome() + " cadastrada com sucesso!");
                        }
                    } else if (menuSecundario == 2) {
                        if (receber == null) {
                            System.out.println("Nenhuma conta a receber cadastrada!");
                        } else {
                            receber.entrar(input);
                            System.out.println(
                                    "Conta a Receber do cliente" + cliente.getNome() + "alterada com sucesso!");
                        }
                    } else if (menuSecundario == 3) {
                        if (receber == null) {
                            System.out.println("Nenhuma conta a receber cadastrada!");
                        } else {
                            System.out.println("Dados da Conta a Receber:");
                            System.out.println("Cliente: " + cliente.getNome());
                            receber.imprimir();
                        }
                    } else if (menuSecundario == 4) {
                        if (receber == null) {
                            System.out.println("Nenhuma conta a receber cadastrada!");
                        } else {
                            receber = null;
                            System.out.println("Conta a Receber excluída com sucesso!");
                        }
                    }
                }
            } else if (menuPrincipal == 5) {
                while (menuSecundario != 5) {
                    System.out.println("\n");
                    System.out.println("Incluir Conta a Pagar....[1]");
                    System.out.println("Alterar Conta a Pagar....[2]");
                    System.out.println("Consultar Conta a Pagar..[3]");
                    System.out.println("Excluir Conta a Pagar....[4]");
                    System.out.println("Voltar...................[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer
                    if (menuSecundario == 1) {
                        if (fornecedor == null) {
                            System.out.println("Nenhum fornecedor cadastrado!");
                        } else {
                            pagar = new Pagar();
                            pagar.entrar(input);
                            System.out.println(
                                    "Conta a pagar do fornecedor " + fornecedor.getNome() + " cadastrada com sucesso!");
                        }
                    } else if (menuSecundario == 2) {
                        if (pagar == null) {
                            System.out.println("Nenhuma conta a pagar cadastrada!");
                        } else {
                            pagar.entrar(input);
                            System.out.println(
                                    "Conta a Pagar do fornecedor " + fornecedor.getNome() + " alterada com sucesso!");
                        }
                    } else if (menuSecundario == 3) {
                        if (pagar == null) {
                            System.out.println("Nenhuma conta a pagar cadastrada!");
                        } else {
                            System.out.println("Dados da Conta a Pagar:");
                            System.out.println("Fornecedor: " + fornecedor.getNome());
                            pagar.imprimir();
                        }
                    } else if (menuSecundario == 4) {
                        if (pagar == null) {
                            System.out.println("Nenhuma conta a pagar cadastrada!");
                        } else {
                            pagar = null;
                            System.out.println("Conta a Pagar excluída com sucesso!");
                        }
                    }
                }
            } else if (menuPrincipal == 6) {
                if (receber == null && pagar == null) {
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("             Não há dados no fluxo de caixa.   ");
                    System.out.println("-----------------------------------------------");
                } else {
                    System.out.println("-----------------------------------------------");
                    System.out.println("                   Fluxo de Caixa              ");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Vencimento       | Entrada   | Saída    | Saldo");
                    System.out.println("-----------------------------------------------");
            
                    if (receber == null) {
                        System.out.printf("%-17s | %-9s | %-8.2f | %-8.2f\n", "Vazio", "0.00", pagar.getTotal(), pagar.getTotal());
                        System.out.printf("%-17s | %-9s | %-8.2f | %-8.2f\n", pagar.getVencimento(), "0.00", pagar.getTotal(), pagar.getTotal());
                        System.out.printf("%-17s | %-9s | %-8.2f | %-8.2f\n", "Totais", "0.00", pagar.getTotal(), pagar.getTotal());
                    } else if (pagar == null) {
                        System.out.printf("%-17s | %-9.2f | %-8s | %-8.2f\n", receber.getVencimento(), receber.getTotal(), "0.00", receber.getTotal());
                        System.out.printf("%-17s | %-9s | %-8s | %-8s\n", "Vazio", "0.00", "0.00", "0.00");
                        System.out.printf("%-17s | %-9.2f | %-8s | %-8.2f\n", "Totais", receber.getTotal(), "0.00", receber.getTotal());
                    } else {
                        System.out.printf("%-17s | %-9.2f | %-8s | %-8.2f\n", receber.getVencimento(), receber.getTotal(), "0.00", receber.getTotal());
                        System.out.printf("%-17s | %-9s | %-8.2f | %-8.2f\n", pagar.getVencimento(), "0.00", pagar.getTotal(), pagar.getTotal());
                        System.out.printf("%-17s | %-9.2f | %-8.2f | %-8.2f\n", "Totais", receber.getTotal(), pagar.getTotal(), (receber.getTotal() - pagar.getTotal()));
                    }
            
                    System.out.println("-----------------------------------------------");
                }
            } else if (menuPrincipal != 7) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("Sistema Encerrado!");
        input.close();
    }
}
