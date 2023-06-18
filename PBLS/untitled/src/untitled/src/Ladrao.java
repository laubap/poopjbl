package untitled.src;

public class Ladrao extends Vilao {
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Ladrao correndo...");
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Ladrao saltando...");
    }

    public void atirar() {
        System.out.println("Ladrao atirando...");
    }

    public void correr() {
        System.out.println("Ladrao correndo...");
    }
}