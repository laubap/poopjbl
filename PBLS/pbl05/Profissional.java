package pbl05;
public class Profissional extends Jogador {
    private double capital;

    public Profissional(String nome, int idade, int score) {
        super(nome, idade, score);
        capital = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Capital: " + capital);
    }

    public void ganhar(int p) {
        score += p;
        capital += 4 * p;
    }

    public void perder(int p) {
        score -= p;
        capital -= 4 * p;
    }
}
