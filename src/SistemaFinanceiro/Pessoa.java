package SistemaFinanceiro;

import java.util.Scanner;

public abstract class Pessoa implements InterfaceCadastro {
    private String id;
    private String nome;
    private Endereco endereco;
    private Telefone telefone;
    private String email;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }
    public Telefone getTelefone() { return telefone; }
    public void setTelefone(Telefone telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public void entrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID: ");
        this.id = scanner.nextLine();

        System.out.print("Digite o nome: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite o endereço:");
        this.endereco = new Endereco();
        this.endereco.entrar();

        System.out.println("Digite o telefone:");
        this.telefone = new Telefone();
        this.telefone.entrar();

        System.out.print("Digite o email: ");
        this.email = scanner.nextLine();
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço:");
        this.endereco.imprimir();
        System.out.println("Telefone:");
        this.telefone.imprimir();
        System.out.println("Email: " + this.email);
    }
}