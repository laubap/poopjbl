package untitled.src;

public class Batman extends Heroi implements Camuflagem {
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Batman correndo...");
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Batman saltando...");
    }

    public void atirar() {
        System.out.println("Batman atirando...");
    }

    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Batman camuflando...");
    }

    public void correr() {
        System.out.println("Batman correndo...");
    }

    public void saltar() {
        System.out.println("Batman saltando...");
    }
}
