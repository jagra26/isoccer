package com.company;

import java.util.Scanner;

public class Estadio {
    String nome;
    int capacidade;
    int banheiros;
    int lanchonetes;
    Estadio(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira um nome\n");
        this.nome = entrada.nextLine();
        System.out.print("insira a capacidade\n");
        this.capacidade = entrada.nextInt();
        System.out.print("insira o nº de banheiros\n");
        this.banheiros = entrada.nextInt();
        System.out.print("insira o nº de lanchonetes");
        this.lanchonetes = entrada.nextInt();
    }
    public Estadio modificar(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira a capacidade\n");
        this.capacidade = entrada.nextInt();
        System.out.print("insira o nº de banheiros\n");
        this.banheiros = entrada.nextInt();
        System.out.print("insira o nº de lanchonetes");
        this.lanchonetes = entrada.nextInt();
        return this;
    }
}
