package com.company;

import java.util.Scanner;

public class CT {
    String nome;
    int dormitorios;
    CT(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira um nome\n");
        this.nome = entrada.nextLine();
        System.out.print("insira o nº de dormitorios\n");
        this.dormitorios = entrada.nextInt();
    }
}
