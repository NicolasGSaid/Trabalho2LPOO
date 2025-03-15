package SistemaFinanceiro;

import java.util.Scanner;

public class Pessoa {
    Scanner scanner = new Scanner(System.in);

    //Atributos
    private int id;
    private String nome, email;
    private Endereco endereco;
    private Telefone telefone;
    
    //Contrutor
    public Pessoa(){
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }

    //Metodo de entrada
    public void entrar(int id, String nome, Endereco endereco, Telefone telefone, String email){
        System.out.println();
        System.out.println("--- Cadastro de Pessoa ---");
        System.out.print("Digite o ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.print("Digite o Email: ");
        this.email = scanner.nextLine();

        System.out.println("\n--- Cadastro de Endereço ---");
        String logradouro = ""; 
        int numero = 0;
        String complemento = "";
        String bairro = "";
        String cidade = "";
        String estado = "";
        String cep = "";

        this.endereco.entrar(logradouro, numero, complemento, bairro, cidade, estado, cep);
        System.out.println();

        System.out.println("\n--- Cadastro de Telefone ---");
        int ddd = 0;
        int numerotel = 0;

        this.telefone.entrar(ddd, numerotel);
        System.out.println(); 
    }

    //Metodo de Impressao
    public void imprimir(){
        System.out.println("--- Pessoa ---");
        System.out.println("ID: "+ id);
        System.out.println("Nome: "+ nome);
        System.out.println("Email: "+email);
        this.endereco.imprimir();
        this.telefone.imprimir();
        System.out.println();
    }
}
