package pbl05;
import pbl05.Jogador;
import pbl05.Senior;
import pbl05.Profissional;
import java.util.ArrayList;
import java.util.Scanner;






public class Game {
    private ArrayList<Jogador> jogadores;

    public Game() {
        jogadores = new ArrayList<Jogador>();
        jogadores.add(new Principiante("João", 20, 5));
        jogadores.add(new Principiante("Maria", 15, 3));
        jogadores.add(new Principiante("Pedro", 25, 7));
        jogadores.add(new Profissional("Ana", 30, 1000));
        jogadores.add(new Profissional("Carlos", 25, 500));
        jogadores.add(new Profissional("Luciana", 35, 1500));
        jogadores.add(new Senior("Marcos", 40, 2000, 10));
        jogadores.add(new Senior("Renata", 50, 3000, 15));
        jogadores.add(new Senior("Fernando", 45, 2500, 12));

    }

    public void inserirPrincipiante(Jogador) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogador:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do jogador:");
        int idade = sc.nextInt();
        System.out.println("Digite o score do jogador:");
        int score = sc.nextInt();
        System.out.println("Digite o bonus do jogador:");
        int bonus = sc.nextInt();
        Jogador j = new Principiante(nome, idade, score, bonus);
        jogadores.add(j);
        System.out.println("Principiante adicionado com sucesso!");
    }

    public static void inserirProfissional() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogador:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do jogador:");
        int idade = sc.nextInt();
        System.out.println("Digite o score do jogador:");
        int score = sc.nextInt();
        System.out.println("Digite o capital do jogador:");
        double capital = sc.nextDouble();
        Jogador j = new Profissional(nome, idade, score, capital);
        jogadores.add(j);
        System.out.println("Profissional adicionado com sucesso!");
    }

    public void inserirSenior() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do jogador:");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do jogador:");
        int idade = sc.nextInt();
        System.out.println("Digite o score do jogador:");
        int score = sc.nextInt();
        System.out.println("Digite o bonus do jogador:");
        int bonus = sc.nextInt();
        System.out.println("Digite o prêmio do jogador:");
        double premio = sc.nextDouble();
        Jogador j = new Senior(nome, idade, score, bonus, premio);
        jogadores.add(j);
        System.out.println("Senior adicionado com sucesso!");
    }

    public void ganhar(String nome, int p) {
        for (Jogador j : jogadores) {
            if (j.jogador().equals(nome)) {
                j.ganhar(p);
                System.out.println("Ganho aplicado com sucesso para " + nome);
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void perder(String nome, int p) {
        for (Jogador j : jogadores) {
            if (j.jogador().equals(nome)) {
                j.perder(p);
                System.out.println("Perda aplicada com sucesso para " + nome);
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void imprimir(String nome) {
        for (Jogador j : jogadores) {
            if (j.getNome().equals(nome)) {
                j.imprimir();
                return;
            }
        }
        System.out.println("Jogador não encontrado.");
    }

    public void imprimirTodos() {
        for (Jogador j : jogadores) {
            j.imprimir();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 7) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar um objeto da classe Principante e inseri-lo na coleção jogadores.");
            System.out.println("2 - Criar um objeto da classe Profissional e inseri-lo na coleção jogadores.");
            System.out.println("3 - Criar um objeto da classe Senior e inseri-lo na coleção jogadores.");
            System.out.println("4 - Aplicar o método ganhar para um jogador específico, dado o seu nome.");
            System.out.println("5 - Aplicar o método perder para um jogador específico, dado o seu nome.");
            System.out.println("6 - Aplicar o método imprimir para um jogador específico, dado o seu nome.");
            System.out.println("7 - Aplicar o método imprimir para todos os objetos da coleção jogadores.");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    inserirPrincipiante();
                    break;
                case 2:
                    inserirProfissional();
                    break;
                case 3:
                inserirSenior();
                    break;
                case 4:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do jogador:");
                    String nome = sc.nextLine();
                    ganhar(nome);
                    break;
                case 5:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do jogador:");
                    String nome = sc.nextLine();
                    perder(nome);
                    break;
                case 6:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do jogador:");
                    String nome = sc.nextLine();
                    imprimir(nome);
                    break;
                case 7:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o nome do jogador:");
                    String nome = sc.nextLine();
                    imprimirTodos(nome);
                    break;
                case 0:
                    System.out.println("encerrando programa... ");
                    break;
                default:
                    System.out.println("opcao invalida");
            }
        }
    }
}

