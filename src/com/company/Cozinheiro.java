package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Cozinheiro extends Pessoa {
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\n" + "\ncpf: " + this.cpf + "\nemail: " + this.email +
                "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
    public Cozinheiro() {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Insira o nome:\n");
            String nome = entrada.nextLine();
            System.out.print("Insira o email:\n");
            String email = entrada.nextLine();
            System.out.print("Insira o cpf:\n");
            long cpf = entrada.nextLong();
            System.out.print("Insira o telefone:\n");
            int telefone = entrada.nextInt();
            System.out.print("Insira o salário:\n");
            double salario = entrada.nextDouble();
            super.nome = nome;
            super.email = email;
            super.cpf = cpf;
            super.telefone = telefone;
            super.salario = salario;
            super.tipo = "Cozinheiro";
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }

}
