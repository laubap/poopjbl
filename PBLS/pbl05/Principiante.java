package pbl05;
import pbl05.Jogador;
import pbl05.Game;
public class Principiante extends Jogador {
    private double bonus;

    public Principiante(String nome, int idade, int score) {
        super(nome, idade, score);
        bonus = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Bonus: " + bonus);
    }

    public void ganhar(int p) {
        score += p;
        bonus += 0.1 * p;
    }

    public void perder(int p) {
        score -= p;
        bonus -= 0.1 * p;
    }
}