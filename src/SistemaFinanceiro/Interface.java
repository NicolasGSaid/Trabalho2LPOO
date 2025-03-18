package SistemaFinanceiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuPrincipal = 0;
        int menuSecundario = 0;
        String titulo = "=========================================";
        String subtitulo1 = "Sistema Financeiro";
        String subtitulo2 = "Cadastro de Funcionários";
        String subtitulo3 = "Menu De Funcionários";

        int espacos = (titulo.length() - subtitulo1.length()) / 2;
        String subtituloCentralizado = " ".repeat(espacos) + subtitulo1;
        String subtituloCentralizado2 = " ".repeat(espacos) + subtitulo2;
        String subtituloCentralizado3 = " ".repeat(espacos) + subtitulo3;

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        while (menuPrincipal != 5) {
            menuSecundario = 0;
            System.out.println(titulo);
            System.out.println(subtituloCentralizado);
            System.out.println("Menu de Funcionários...[1]");
            System.out.print("Opção: ");

            menuPrincipal = input.nextInt();

            if (menuPrincipal == 1) {

                while (menuSecundario != 5) {
                    System.out.println(titulo);
                    System.out.println(subtituloCentralizado3);
                    System.out.println("\n");
                    System.out.println("Incluir Funcionário....[1]");
                    System.out.println("Alterar Funcionário....[2]");
                    System.out.println("Consultar Funcionários.[3]");
                    System.out.println("Excluir Funcionário....[4]");
                    System.out.println("Voltar............[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    // Menu de Funcionários
                    if (menuSecundario == 1) { // Incluir Funcionário
                        System.out.println(titulo);
                        System.out.println(subtituloCentralizado2);
                        Funcionario funcionario = new Funcionario();
                        funcionario.entrar(input);
                        funcionarios.add(funcionario);
                        System.out.println("Funcionário cadastrado com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar Funcionario
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Digite o ID do Funcionário que deseja alterar: ");
                            int idAlterar = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Funcionário pelo ID
                            Funcionario funcionarioEncontrado = null;
                            for (Funcionario funcionario : funcionarios) {
                                if (funcionario.getId() == idAlterar) {
                                    funcionarioEncontrado = funcionario;
                                    break;
                                }
                            }
                            if (funcionarioEncontrado != null) {
                                System.out.println("Funcionário encontrado! Insira os novos dados:");
                                funcionarioEncontrado.entrar(input); // Alterar os dados
                                System.out.println("Funcionário alterado com sucesso!");
                            } else {
                                System.out.println("Funcionário não encontrado!");
                            }
                        }

                    } else if (menuSecundario == 3) {
                        if (funcionarios.isEmpty()) {
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Funcionarios cadastradss: ");
                            for (Funcionario funcionario : funcionarios) {
                                funcionario.imprimir();
                            }
                        }
                    } else if (menuSecundario == 4) {
                        if (funcionarios.isEmpty()){
                            System.out.println("Nenhum funcionário cadastrado!");
                        } else {
                            System.out.println("Digite o ID da funcionário que deseja excluir: ");
                            int idExcluir = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar o Funcionário pelo ID
                            Funcionario funcionarioEncontrado = null;
                            for (Funcionario funcionario : funcionarios) {
                                if (funcionario.getId() == idExcluir) {
                                    funcionarioEncontrado = funcionario;
                                    break;
                                }
                            }
                            if (funcionarioEncontrado != null) {
                                funcionarios.remove(funcionarioEncontrado);
                                System.out.println("Pessoa excluída com sucesso!");
                            } else {
                                System.out.println("Pessoa não encontrada!");
                            }
                        }
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }
        } 
    }
}