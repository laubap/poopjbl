package untitled.src;

public class Terrorista extends Vilao {
    public Terrorista(boolean vivo, float posicaoX, float posicaoY, float posicaoZ) {
        super();
    }

    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Terrorista correndo...");
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Terrorista saltando...");
    }

    public void atirar() {
        System.out.println("Terrorista atirando...");
    }

    public void correr() {
        System.out.println("Terrorista correndo...");
    }
}

