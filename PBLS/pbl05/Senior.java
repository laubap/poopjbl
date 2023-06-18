package pbl05;
import pbl05.Game;
import pbl05.Jogador;
public class Senior extends Jogador {
    private double premio;

    public Senior(String nome, int idade, int score) {
        super(nome, idade, score);
        premio = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Premio: " + premio);
    }

    public void ganhar(int p) {
        super.ganhar(p);
        premio += 2 * p;
    }

    public void perder(int p) {
        super.perder(p);
        premio /= 2;
    }
}