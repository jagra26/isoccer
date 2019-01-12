package com.company;

import java.util.Scanner;

public class Socio extends Pessoa {
    String pagamento;
    double contribuicao;
    boolean adimplente;
    @Override
    public String toString() {
        return  this.nome + "\n" + this.tipo + "\n" + "\ncpf: " + this.cpf
                + "\nemail: " + this.email + "\ntelefone: " + this.telefone + "\nsalario: " + this.salario +
                "\n-----------\n";
    }
    public Socio(Presidente presidente) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome:\n");
        String nome = entrada.nextLine();
        System.out.print("Insira o email:\n");
        String email = entrada.nextLine();
        System.out.print("Insira o cpf:\n");
        int cpf = entrada.nextInt();
        System.out.print("Insira o tipo:\n" +
                "Junior -- 1" + "Senior -- 2" + "Elite -- 3\n");
        int tipo =entrada.nextInt();
        System.out.print("Insira o telefone:\n");
        int telefone = entrada.nextInt();
        System.out.print("Adimplente?\nSim -- 1 Não -- 2\n");
        int adimplente = entrada.nextInt();
        this.adimplente = adimplencia(adimplente);

        super.nome = nome;
        super.email = email;
        super.cpf = cpf;
        super.telefone = telefone;

        super.tipo = grau(tipo);
        this.contribuicao = pagamento(tipo, presidente);

    }
    private String grau(int tipo){
        if (tipo == 1){
            return "Sócio Junior";
        }else if (tipo == 2){
            return "Sócio Senior";
        }else{
            return "Sócio Elite";
        }
    }
    private double pagamento(int tipo, Presidente presidente){
        if(tipo == 1){
            return presidente.taxaJunior;
        }else if(tipo == 2){
            return presidente.taxaSenior;
        }else{
            return presidente.taxaElite;
        }
    }
    private boolean adimplencia(int resp){
        if(resp == 1){return true;}
        return false;
    }
    private String pagador(boolean resp){
        if (resp){
            return "Adimplente";
        }else{
            return "Inadimplente";
        }
    }
}
