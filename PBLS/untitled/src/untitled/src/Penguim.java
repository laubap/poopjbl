package untitled.src;

public class Penguim extends Vilao {
    public void atirar() {
        System.out.println("Penguim atirando ...");
    }

    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("Penguim correndo ...");
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("Penguim saltando ...");
    }
    @Override
    public void correr() {
        System.out.println("Penguim correr0 ...");
    }
}

