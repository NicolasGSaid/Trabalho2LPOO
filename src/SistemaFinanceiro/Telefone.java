package SistemaFinanceiro;

import java.util.Scanner;

public class Telefone{
   
    private int ddd, numero;

    Telefone(){
        this.ddd = 0;
        this.numero = 0;
    }
    
    public void entrar(Scanner input){
        System.out.print("Digite o DDD: ");
        this.ddd = input.nextInt();
        input.nextLine(); 
        System.out.print("Digite o número: ");
        this.numero = input.nextInt();
        input.nextLine();
    }

    public void imprimir(){
        System.out.println("DDD: " + this.ddd);
        System.out.println("Número: " + this.numero);
    }

    //Getters
    public int getDdd(){
        return this.ddd;
    }

    public int getNumero(){
        return this.numero;
    }

    //Setters
    public void setDdd(int ddd){
        this.ddd = ddd;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
}

