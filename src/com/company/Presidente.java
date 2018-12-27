package com.company;

public class Presidente extends Pessoa{
    double taxaElite;
    double taxaSenior;
    double taxaJunior;

    public Presidente(String nome, String email, int cpf, int telefone, double salario,double taxaElite,
                      double taxaSenior, double taxaJunior){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
        this.taxaElite = taxaElite;
        this.taxaSenior = taxaSenior;
        this.taxaJunior = taxaJunior;
    }
}
