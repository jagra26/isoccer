package com.company;

public class Presidente extends Pessoa{
    private double taxaElite;
    private double taxaSenior;
    private double taxaJunior;

    public Presidente(String nome, String email, int cpf, int telefone, double salario,double taxaElite,
                      double taxaSenior, double taxaJunior){
        super.nome = nome;
        super.email = email;
        super.cpf = cpf;
        super.telefone = telefone;
        super.salario = salario;
        this.taxaElite = taxaElite;
        this.taxaSenior = taxaSenior;
        this.taxaJunior = taxaJunior;
    }
}
