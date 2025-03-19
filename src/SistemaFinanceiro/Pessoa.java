package SistemaFinanceiro;
import java.util.Scanner;
public abstract class Pessoa implements InterfaceCadastro {

    private int id;
    private String nome, email;
    private Endereco endereco;
    private Telefone telefone;

    Pessoa(){
        this.id = 0;
        this.nome = "";
        this.email = "";
        this.endereco = new Endereco();
        this.telefone = new Telefone();
    }

    public void entrar(Scanner input){
        System.out.print("Digite o ID:");
        this.id = input.nextInt();
        input.nextLine();
        System.out.print("Digite o nome:");
        this.nome = input.nextLine();
        System.out.print("Digite o email:");
        this.email = input.nextLine();
        this.endereco.entrar(input);
        this.telefone.entrar(input);  
    }

    public void imprimir(){
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        this.endereco.imprimir();
        this.telefone.imprimir();
    }

    //Getters

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEmail(){
        return this.email;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public Telefone getTelefone(){
        return this.telefone;
    }

    //Setters

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setTelefone(Telefone telefone){
        this.telefone = telefone;
    }
    public interface innerPessoa {

        void entrar(int id, String nome, String email, Endereco endereco, Telefone telefone);
        void imprimir(); 
    }
}
