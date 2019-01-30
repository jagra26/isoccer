package com.company;

import java.math.BigInteger;

public class Pessoa {
    public String nome;
    public String email;
    public double cpf;
    public int telefone;
    public double salario;
    public String tipo;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\n" + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
   /* public Pessoa(String nome, String email, int cpf, int telefone, double salario){
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.salario = salario;
    }*/
}