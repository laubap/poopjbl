package untitled.src;

public class Coringa extends Vilao {
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("James Bond correndo...");
    }

    @Override
    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Coringa saltando...");
    }

    public void correr() {
        System.out.println("Coringa Bond correndo...");
    }
    public void atirar() {
        System.out.println("Coringa Bond atirando...");
    }
}
