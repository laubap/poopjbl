package untitled.src;

public class GoldFinger extends Terrorista implements Camuflagem {

    private Heroi heroi;

    public GoldFinger(boolean vivo, float posicaoX, float posicaoY, float posicaoZ) {
        super(vivo, posicaoX, posicaoY, posicaoZ);
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Goldfinger saltando...");
    }

    public void atirar() {
        System.out.println("Goldfinger atirando...");
    }

    public void personificar(Heroi h) {
        this.heroi = h;
        System.out.println("Personificando...");
    }

    @Override
    public void camuflar(int cor) {
        this.cor = cor;
        System.out.println("Goldfinger camuflando...");
    }
}

