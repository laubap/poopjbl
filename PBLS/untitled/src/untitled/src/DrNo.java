package untitled.src;

public class DrNo extends Terrorista {

    public DrNo(boolean vivo, float posicao_x, float posicao_y, float posicao_z) {
        super(vivo, posicao_x, posicao_y, posicao_z);
    }

    public void saltar0() {
        System.out.println("DrNo saltando");
    }

    public void atirar0() {
        System.out.println("DrNo atirando");
    }

    public void correr0() {
        System.out.println("DrNo correndo");
    }

    public void saltar() {
        saltar0();
    }

    public void atirar() {
        atirar0();
    }

    public void correr() {
        correr0();
    }

    public void saltar(float z) {
        this.posicao_z = z;
        saltar0();
    }

    public void morrer() {
        setVivo(false);
        System.out.println("Morto");
    }

    private void setVivo(boolean b) {
    }

}

