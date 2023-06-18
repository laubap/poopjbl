package untitled.src;


public class JamesBond extends Heroi {
    
    public void correr(float x, float y) {
        this.posicao_x = x;
        this.posicao_y = y;
        System.out.println("James Bond correndo...");
    }

    public void saltar(float z) {
        this.posicao_z = z;
        System.out.println("James Bond saltando...");
    }

    public void atirar() {
        System.out.println("James Bond atirando...");
    }

    public void correr() {
        System.out.println("James Bond correndo...");
    }

    public void saltar() {
        System.out.println("James Bond saltando...");
    }
}