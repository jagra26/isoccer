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
    public boolean Rodar(boolean sair){
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
    public void addPessoa () {
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

                break;
            case 4:

                break;
            case 5:

                break;
        }
    }
    public void addPresidente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine();
        System.out.print("\n Insira o email: ");
        String email = entrada.nextLine();
        System.out.print("\n Insira o cpf: ");
        int cpf = entrada.nextInt();
        System.out.print("\n Insira o telefone: ");
        int telefone = entrada.nextInt();
        System.out.print("\nInsira o salário: ");
        double salario = entrada.nextDouble();
        System.out.print("\nInsira a taxa de socio elite: ");
        double taxaElite = entrada.nextDouble();
        System.out.print("\nInsira a taxa de socio senior: ");
        double taxaSenior = entrada.nextDouble();
        System.out.print("\nInsira a taxa de socio junior: ");
        double taxaJunior = entrada.nextDouble();
        System.out.print("\n");
        this.presidente = new Presidente(nome, email, cpf, telefone, salario, taxaElite, taxaSenior, taxaJunior);
    }
    public void addTecnico(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o nome: ");
        String nome = entrada.nextLine();
        System.out.print("\n Insira o email: ");
        String email = entrada.nextLine();
        System.out.print("\n Insira o cpf: ");
        int cpf = entrada.nextInt();
        System.out.print("\n Insira o telefone: ");
        int telefone = entrada.nextInt();
        System.out.print("\nInsira o salário: ");
        double salario = entrada.nextDouble();
        System.out.print("\n");
        this.tecnico = new Tecnico(nome, email, cpf, telefone, salario);
    }
}
