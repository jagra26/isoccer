package com.company;

import java.util.*;

public class Sistema {
    String login;
    String senha;
    Presidente presidente;
    Tecnico tecnico;
    ArrayList<Jogador> time;
    ArrayList<Pessoa> funcionarios;
    ArrayList<Socio> socios;
    int[] frota;
    Estadio campo;
    CT centro;
    public Sistema(){
        this.login = "123";
        this.senha = "bolinh0";
        this.time = new ArrayList<Jogador>();
        this.funcionarios = new ArrayList<Pessoa>();
        this.socios = new ArrayList<Socio>();
        this.frota = new int[100];
        for (int bool:
             frota) {
            bool = -1;
        }
        
    }
    public void Rodar(boolean sair){
        Scanner entrada = new Scanner(System.in);
        System.out.print("insira o login\n");
        String login = entrada.nextLine();
        while (!this.login.equals(login)){
            System.out.print("login incorreto, insira novamente\n");
            login = entrada.nextLine();
        }
        System.out.print("insira a senha:\n");
        String senha = entrada.nextLine();
        while (!this.senha.equals(senha)){
            System.out.print("senha incorreta\n");
            System.out.print("insira a senha:\n");
            senha = entrada.nextLine();
        }
        while (!sair) {
            try {
                System.out.print("Escolha uma operação:\n" +
                        "Adicionar pessoa -- 1\n" +
                        "Listar pessoas -- 2\n" +
                        "Adicionar recursos físicos -- 3\n" +
                        "Listar recursos físicos -- 4\n" +
                        "Sair -- 5\n" +
                        "------------------------\n");
                int operacao = entrada.nextInt();
                switch (operacao) {
                    case 1:
                        addPessoa();
                        break;
                    case 2:
                        listPessoa();
                        break;
                    case 3:
                        addRecursos();
                        break;
                    case 4:
                        listRecursos();
                        break;
                    case 5:
                        sair = true;
                        break;
                }
            }catch (InputMismatchException e){
                System.out.print("entrada incorreta\n");
                entrada.next();
            }
        }
    }
    private void addPessoa (){
        try {
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
                    addSocio();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void addPresidente(){
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
            System.out.print("Insira a taxa de socio elite:\n");
            double taxaElite = entrada.nextDouble();
            System.out.print("Insira a taxa de socio senior:\n");
            double taxaSenior = entrada.nextDouble();
            System.out.print("Insira a taxa de socio junior:\n");
            double taxaJunior = entrada.nextDouble();
            System.out.print("\n");
            this.presidente = new Presidente(nome, email, cpf, telefone, salario, taxaElite, taxaSenior, taxaJunior);
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void addTecnico(){
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
            System.out.print("\n");
            this.tecnico = new Tecnico(nome, email, cpf, telefone, salario);
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void addJogador(){
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
            posicoes();
            int posicao = entrada.nextInt();
            inapto();
            int apto = entrada.nextInt();
            System.out.print("\n");
            Jogador contratacao = new Jogador(nome, email, cpf, telefone, salario, posicao, apto);
            this.time.add(contratacao);
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
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
    private void addFuncionario(){
        try {
            System.out.print("Escolha o tipo de funcionario\n" +
                    "Advogado -- 1\n" +
                    "Cozinheiro -- 2\n" +
                    "Médico -- 3\n" +
                    "Motorista -- 4\n" +
                    "Preparador -- 5\n");
            Scanner entrada = new Scanner(System.in);
            Pessoa funcionario;
            int tipo = entrada.nextInt();
            switch (tipo) {
                case 1:
                    funcionario = new Advogado();
                    this.funcionarios.add(funcionario);
                    break;
                case 2:
                    funcionario = new Cozinheiro();
                    this.funcionarios.add(funcionario);
                    break;
                case 3:
                    funcionario = new Medico();
                    this.funcionarios.add(funcionario);
                    break;
                case 4:
                    funcionario = new Motorista();
                    this.funcionarios.add(funcionario);
                    break;
                case 5:
                    funcionario = new Preparador();
                    this.funcionarios.add(funcionario);
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void listPessoa(){
        try {
            System.out.print("Escolha uma operação:\n" +
                    "Listar presidente --1\n" +
                    "Listar tecnico -- 2\n" +
                    "Listar jogadores -- 3\n" +
                    "Listar funcionarios -- 4\n" +
                    "Listar sócios -- 5\n" +
                    "Listar todos -- 6\n" +
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
                case 4:
                    listFuncionario();
                    break;
                case 5:
                    listSocio();
                    break;
                case 6:
                    listPresidente();
                    listTecnico();
                    listTime();
                    listFuncionario();
                    listDados();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void listPresidente(){
        try {
            System.out.print("presidente " + this.presidente.nome + "\n" +
                    "email" + this.presidente.email + "\n");
            System.out.printf("cpf %d\n telefone %d\n salario %2f\n", this.presidente.cpf,
                    this.presidente.telefone, this.presidente.salario);
        }catch (NullPointerException e){
            System.out.print("adicione um presidente primeiro\n");
        }
    }
    private void listTecnico(){
        try {
            System.out.print("tecnico " + this.tecnico.nome + "\n" +
                    "email" + this.tecnico.email + "\n");
            System.out.printf("cpf %d\n telefone %d\n salario %2f\n", this.tecnico.cpf,
                    this.tecnico.telefone, this.tecnico.salario);
        }catch (NullPointerException e){
            System.out.print("adicione um tecnico primeiro\n");
        }
    }
    private void listTime(){
        try {
            System.out.print("time:\n");
            for (int i = 0; i < this.time.size(); i++) {
                System.out.print(this.time.get(i));
            }
        }catch (NullPointerException e){
            System.out.print("adicione ao menos um jogador primeiro\n");
        }
    }
    private void listFuncionario(){
        try {
            System.out.print("Funcionários\n");
            for (int i = 0; i < this.funcionarios.size(); i++) {
                System.out.print(this.funcionarios.get(i));
            }
        }catch (NullPointerException e){
            System.out.print("adicione ao menos um funcionario primeiro\n");
        }
    }
    private void addBus(){
        for (int bool:
             this.frota) {
            if (bool == -1){
                try{
                System.out.print("Disponível?\nSim -- 1  Não -- 2");
                Scanner entrada =  new Scanner(System.in);
                bool = entrada.nextInt();}catch (InputMismatchException e){
                    System.out.print("entrada incorreta\n");
                }
                break;
            }
        }
    }
    private void listBus(){
        for (int i = 0; i< 100; i++){
            if(this.frota[i] == -1){
                if(i == 0){
                    System.out.print("O clube não possui nenhum ônibus\n");
                }
                break;
            }
            System.out.printf("Onibus nº %d", i);
            if(this.frota[i] == 1){
                System.out.print("Disponível\n");
            }else{
                System.out.print("Indisponível\n");
            }
        }
    }
    private void addEstadio(){
        this.campo = new Estadio();
    }
    private void listEstadio(){
        if (this.campo == null){
            System.out.print("este recurso não está disponivel");
        }else{
            System.out.printf("nome: %s\ncapacidade: %d\nbanheiros: %d\nlanchonetes: %d\n",
            this.campo.nome, this.campo.capacidade, this.campo.banheiros, this.campo.lanchonetes);
        }
    }
    private void modEstadio(){
        if (this.campo != null) {
            this.campo = this.campo.modificar();
        }else {
            System.out.print("O clube não possui estádio\n");
        }
    }
    private void addCT(){
        this.centro = new CT();
    }
    private void listCT(){
        if (this.centro == null){
            System.out.print("o clube não possui CT\n");
        }else{
            System.out.printf("nome: %s\ndormitorios: %d\n", this.centro.nome, this.centro.dormitorios);
        }
    }
    private void listRecursos(){
        try {
            System.out.print("Selecione uma opção:\n" +
                    "listar onibus -- 1\n" +
                    "listar estádio -- 2\n" +
                    "listar CT -- 3\n" +
                    "listar tudo --4\n");
            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    listBus();
                    break;
                case 2:
                    listEstadio();
                    break;
                case 3:
                    listCT();
                    break;
                case 4:
                    listBus();
                    listEstadio();
                    listCT();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void addRecursos(){
        try {
            System.out.print("Selecione uma opção:\n" +
                    "adicionar onibus -- 1\n" +
                    "adicionar estádio -- 2\n" +
                    "adicionar CT -- 3\n" +
                    "adicionar tudo --4\n" +
                    "modificar estádio -- 5\n");
            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    addBus();
                    break;
                case 2:
                    addEstadio();
                    break;
                case 3:
                    addCT();
                    break;
                case 4:
                    addBus();
                    addEstadio();
                    addCT();
                case 5:
                    modEstadio();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private void addSocio(){
        if(this.presidente != null) {
            Socio novoSocio = new Socio(this.presidente);
            this.socios.add(novoSocio);
        }else{
            System.out.print("Registre um presidente primeiro \n");
        }

    }
    private void listSocio(){
        try {
            System.out.print("Escolha uma opção:\n" +
                    "Quantidade -- 1\n" +
                    "Quantidade de Adimplentes -- 2\n" +
                    "Quantidade de Inadimplentes -- 3\n" +
                    "Listar dados individuais -- 4\n");
            Scanner entrada = new Scanner(System.in);
            int opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print(this.socios.size() + "\n");
                    break;
                case 2:
                    System.out.print(adimplentes() + "\n");
                    break;
                case 3:
                    System.out.print(this.socios.size() - adimplentes() + "\n");
                    break;
                case 4:
                    listDados();
                    break;
            }
        }catch (InputMismatchException e){
            System.out.print("entrada incorreta\n");
        }
    }
    private int adimplentes(){
        int cont = 0;
        for (int i = 0; i < this.socios.size(); i++){
            if (this.socios.get(i).adimplente){
                cont ++;
            }
        }
        return cont;
    }
    private void listDados(){
        for (int i = 0; i < this.socios.size(); i++) {
            System.out.print(this.socios.get(i));
        }
    }
}
