package com.company;

import java.util.Scanner;

public class Motorista extends Pessoa {
    int cnh;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\ncnh" + this.cnh + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
    public Motorista() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome:\n");
        String nome = entrada.nextLine();
        System.out.print("Insira o email:\n");
        String email = entrada.nextLine();
        System.out.print("Insira a cnh: \n");
        int cnh = entrada.nextInt();
        System.out.print("Insira o cpf:\n");
        int cpf = entrada.nextInt();
        System.out.print("Insira o telefone:\n");
        int telefone = entrada.nextInt();
        System.out.print("Insira o salário:\n");
        double salario = entrada.nextDouble();
        this.cnh = cnh;
        super.nome = nome;
        super.email = email;
        super.cpf = cpf;
        super.telefone = telefone;
        super.salario = salario;
        super.tipo = "Motorista";
    }
}
