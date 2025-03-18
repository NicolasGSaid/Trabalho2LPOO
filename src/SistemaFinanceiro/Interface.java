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

                    if (menuSecundario == 1) {
                        System.out.println(titulo);
                        System.out.println(subtituloCentralizado2);
                        Pessoa pessoa = new Pessoa();
                        pessoa.entrar(input);
                        pessoas.add(pessoa);
                        System.out.println("Pessoa cadastrada com sucesso!");
                    } else if (menuSecundario == 2) {
                        System.out.println("Alterar Pessoa");
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
                        System.out.println("Excluir Pessoa");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                }
            }
        }
    }
}