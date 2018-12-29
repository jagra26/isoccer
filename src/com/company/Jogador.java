package com.company;

public class Jogador extends Pessoa {
    String tipo;
    boolean apto;
    public Jogador(String nome, String email, int cpf, int telefone, double salario, int tipo, int apto){
        super.nome = nome;
        super.email = email;
        super.cpf = cpf;
        super.telefone = telefone;
        super.salario = salario;
        this.tipo = posicao(tipo);
        this.apto = dm(apto);
    }
    private String posicao(int camisa){
        switch (camisa){
            case 1:
                return "goleiro";
            case 2:
                return "lateral direito";
            case 3:
                return "zagueiro";
            case 5:
                return "volante";
            case 6:
                return "lateral esquerdo";
            case 9:
                return "atacante";
            case 10:
                return "meia";
        }
        return "error";
    }
    private boolean dm(int apto){
        if (apto == 1){return true;}
        return false;
    }
}
