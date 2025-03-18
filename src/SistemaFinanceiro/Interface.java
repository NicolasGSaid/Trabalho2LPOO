package SistemaFinanceiro;

//import SistemaFinanceiro.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuPrincipal = 0;
        int menuSecundario = 0;
        String titulo = "=========================================";
        String subtitulo1 = "Sistema Financeiro";
        String subtitulo2 = "Cadastro de Pessoas";
        String subtitulo3 = "Menu Pessoas";

        int espacos = (titulo.length() - subtitulo1.length()) / 2;
        String subtituloCentralizado = " ".repeat(espacos) + subtitulo1;
        String subtituloCentralizado2 = " ".repeat(espacos) + subtitulo2;
        String subtituloCentralizado3 = " ".repeat(espacos) + subtitulo3;

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (menuPrincipal != 5) {
            menuSecundario = 0;
            System.out.println(titulo);
            System.out.println(subtituloCentralizado);
            System.out.println("Menu de Pessoas...[1]");
            System.out.print("Opção: ");

            menuPrincipal = input.nextInt();

            if (menuPrincipal == 1) {

                while (menuSecundario != 5) {
                    System.out.println(titulo);
                    System.out.println(subtituloCentralizado3);
                    System.out.println("\n");
                    System.out.println("Incluir Pessoa....[1]");
                    System.out.println("Alterar Pessoa....[2]");
                    System.out.println("Consultar Pessoas.[3]");
                    System.out.println("Excluir Pessoa....[4]");
                    System.out.println("Voltar............[5]");
                    System.out.print("Opção: ");
                    menuSecundario = input.nextInt();
                    input.nextLine(); // Limpar o buffer

                    // Menu de Pessoas
                    if (menuSecundario == 1) { // Incluir Pessoa
                        System.out.println(titulo);
                        System.out.println(subtituloCentralizado2);
                        Pessoa pessoa = new Pessoa();
                        pessoa.entrar(input);
                        pessoas.add(pessoa);
                        System.out.println("Pessoa cadastrada com sucesso!");

                    } else if (menuSecundario == 2) { // Alterar Pessoa
                        if (pessoas.isEmpty()) {
                            System.out.println("Nenhuma pessoa cadastrada!");
                        } else {
                            System.out.println("Digite o ID da pessoa que deseja alterar: ");
                            int idAlterar = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar a pessoa pelo ID
                            Pessoa pessoaEncontrada = null;
                            for (Pessoa pessoa : pessoas) {
                                if (pessoa.getId() == idAlterar) {
                                    pessoaEncontrada = pessoa;
                                    break;
                                }
                            }
                            if (pessoaEncontrada != null) {
                                System.out.println("Pessoa encontrada! Insira os novos dados:");
                                pessoaEncontrada.entrar(input); // Alterar os dados
                                System.out.println("Pessoa alterada com sucesso!");
                            } else {
                                System.out.println("Pessoa não encontrada!");
                            }
                        }

                    } else if (menuSecundario == 3) {
                        if (pessoas.isEmpty()) {
                            System.out.println("Nenhuma pessoa cadastrada!");
                        } else {
                            System.out.println("Pessoas cadastradas: ");
                            for (Pessoa pessoa : pessoas) {
                                pessoa.imprimir();
                            }
                        }
                    } else if (menuSecundario == 4) {
                        if (pessoas.isEmpty()){
                            System.out.println("Nenhuma pessoa cadastrada!");
                        } else {
                            System.out.println("Digite o ID da pessoa que deseja excluir: ");
                            int idExcluir = input.nextInt();
                            input.nextLine(); // Limpar o buffer

                            // Procurar a pessoa pelo ID
                            Pessoa pessoaEncontrada = null;
                            for (Pessoa pessoa : pessoas) {
                                if (pessoa.getId() == idExcluir) {
                                    pessoaEncontrada = pessoa;
                                    break;
                                }
                            }
                            if (pessoaEncontrada != null) {
                                pessoas.remove(pessoaEncontrada);
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