package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Advogado extends Pessoa {

    public Advogado() {
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
            super.tipo = "Advogado";
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
}
