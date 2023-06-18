package pbl05;

public class Jogador {
    private String nome;
    private int idade;
    private int score;

    public Jogador(String nome, int idade, int score) {
        this.nome = nome;
        this.idade = idade;
        this.score = score;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Score: " + score);
    }
}