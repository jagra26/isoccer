package com.company;

import java.util.*;

public class Sistema {
    int login;
    String senha;
    Presidente presidente;
    Tecnico tecnico;
    List<Jogador> time;
    List<Pessoa> funcionarios;
    List<Socio> socios;
    public Sistema(){
        this.login = 123;
        this.senha = "bolinh0";
        this.time = new List<Jogador>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Jogador> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Jogador jogador) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Jogador> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Jogador> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Jogador get(int index) {
                return null;
            }

            @Override
            public Jogador set(int index, Jogador element) {
                return null;
            }

            @Override
            public void add(int index, Jogador element) {

            }

            @Override
            public Jogador remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Jogador> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Jogador> listIterator(int index) {
                return null;
            }

            @Override
            public List<Jogador> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.funcionarios = new List<Pessoa>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Pessoa> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Pessoa pessoa) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Pessoa> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Pessoa get(int index) {
                return null;
            }

            @Override
            public Pessoa set(int index, Pessoa element) {
                return null;
            }

            @Override
            public void add(int index, Pessoa element) {

            }

            @Override
            public Pessoa remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Pessoa> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Pessoa> listIterator(int index) {
                return null;
            }

            @Override
            public List<Pessoa> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        this.socios = new List<Socio>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Socio> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Socio socio) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Socio> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Socio> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Socio get(int index) {
                return null;
            }

            @Override
            public Socio set(int index, Socio element) {
                return null;
            }

            @Override
            public void add(int index, Socio element) {

            }

            @Override
            public Socio remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Socio> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Socio> listIterator(int index) {
                return null;
            }

            @Override
            public List<Socio> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
    }
    public void Rodar(boolean sair){
        while (!sair){
                System.out.print("Escolha uma operação:\n" +
                        "Adicionar pessoa -- 1\n" +
                        "Listar pessoas -- 2\n" +
                        "Adicionar recursos físicos -- 3\n" +
                        "Listar recursos físicos -- 4\n" +
                        "Sair -- 5\n" +
                        "------------------------\n");
                Scanner entrada = new Scanner(System.in);
                int operacao = entrada.nextInt();
                switch (operacao){
                    case 1:
                        addPessoa();
                        break;
                    case 2:
                        listPessoa();
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:
                        sair = true;
                        break;
                }
            }
    }
    private void addPessoa () /*terminar*/{
        System.out.print("Escolha uma operação:\n" +
                "Adicionar presidente --1\n" +
                "Adicionar tecnico -- 2\n" +
                "Adicionar jogador --3\n" +
                "Adicionar funcionario -- 4\n" +
                "Adicionar sócio -- 5\n" +
                "------------------------\n");
        Scanner entrada = new Scanner(System.in);
        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                addPresidente();
                break;
            case 2:
                addTecnico();
                break;
            case 3:
                addJogador();
                break;
            case 4:
                addFuncionario();
                break;
            case 5:

                break;
        }
    }
    private void addPresidente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome:\n");
        String nome = entrada.nextLine();
        System.out.print("Insira o email:\n");
        String email = entrada.nextLine();
        System.out.print("Insira o cpf:\n");
        int cpf = entrada.nextInt();
        System.out.print("Insira o telefone:\n");
        int telefone = entrada.nextInt();
        System.out.print("Insira o salário:\n");
        double salario = entrada.nextDouble();
        System.out.print("Insira a taxa de socio elite:\n");
        double taxaElite = entrada.nextDouble();
        System.out.print("Insira a taxa de socio senior:\n");
        double taxaSenior = entrada.nextDouble();
        System.out.print("Insira a taxa de socio junior:\n");
        double taxaJunior = entrada.nextDouble();
        System.out.print("\n");
        this.presidente = new Presidente(nome, email, cpf, telefone, salario, taxaElite, taxaSenior, taxaJunior);
    }
    private void addTecnico(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome:\n");
        String nome = entrada.nextLine();
        System.out.print("Insira o email:\n");
        String email = entrada.nextLine();
        System.out.print("Insira o cpf:\n");
        int cpf = entrada.nextInt();
        System.out.print("Insira o telefone:\n");
        int telefone = entrada.nextInt();
        System.out.print("Insira o salário:\n");
        double salario = entrada.nextDouble();
        System.out.print("\n");
        this.tecnico = new Tecnico(nome, email, cpf, telefone, salario);
    }
    private void addJogador(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome:\n");
        String nome = entrada.nextLine();
        System.out.print("Insira o email:\n");
        String email = entrada.nextLine();
        System.out.print("Insira o cpf:\n");
        int cpf = entrada.nextInt();
        System.out.print("Insira o telefone:\n");
        int telefone = entrada.nextInt();
        System.out.print("Insira o salário:\n");
        double salario = entrada.nextDouble();
        posicoes();
        int posicao = entrada.nextInt();
        inapto();
        int apto = entrada.nextInt();
        System.out.print("\n");
        Jogador contratacao = new Jogador(nome, email, cpf, telefone, salario, posicao, apto);
        this.time.add(contratacao);
    }
    private void posicoes(){
        System.out.print("insira a posição do jogador\n" +
                "goleiro -- 1\n" +
                "lateral direito -- 2\n" +
                "zagueiro -- 3\n" +
                "volante -- 5\n" +
                "lateral esquerdo -- 6\n" +
                "atacante -- 9\n" +
                "meia --10\n");
    }
    private void inapto(){
        System.out.print("o jogador está apto pra jogar?\n" +
                "sim -- 1\n não -- 2\n");
    }
    private void addFuncionario()/*terminar*/{
        System.out.print("Escolha o tipo de funcionario\n" +
                "Advogado -- 1\n" +
                "Cozinheiro -- 2\n" +
                "Médico -- 3\n" +
                "Motorista -- 4\n" +
                "Preparador -- 5\n");

    }
    private void listPessoa(){
        System.out.print("Escolha uma operação:\n" +
                "listar presidente --1\n" +
                "listar tecnico -- 2\n" +
                "listar jogadores -- 3\n" +
                "listar funcionarios -- 4\n" +
                "listar sócios -- 5\n" +
                "listar todos -- 6\n" +
                "------------------------\n");
        Scanner entrada = new Scanner(System.in);
        int operacao = entrada.nextInt();
        switch (operacao) {
            case 1:
                listPresidente();
                break;
            case 2:
                listTecnico();
                break;
            case 3:
                listTime();
                break;
        }
    }
    private void listPresidente(){
        System.out.print("presidente " + this.presidente.nome +"\n" +
                "email" + this.presidente.email + "\n");
        System.out.printf("cpf %d\n telefone %d\n salario %2f\n", this.presidente.cpf,
                this.presidente.telefone, this.presidente.salario);
    }
    private void listTecnico(){
        System.out.print("tecnico " + this.tecnico.nome +"\n" +
                "email" + this.tecnico.email + "\n");
        System.out.printf("cpf %d\n telefone %d\n salario %2f\n", this.tecnico.cpf,
                this.tecnico.telefone, this.tecnico.salario);
    }
    private void listTime(){
        if (this.time != null) {
            for (List<Jogador>:
            this.time){
                if (this.time == null) {
                    break;
                }
                
            }
        }
    }
}
