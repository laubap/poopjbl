import java.io.*;
package src;
class Treinador implements Serializable {
    private String nome;

    public Treinador(String nome) {
        this.nome = nome;
    }

    public void exibir() {
        System.out.println("Nome do treinador: " + nome);
    }
}

class Time implements Serializable {
    private final String nome;
    private final String jogador1;
    private final String jogador2;
    private final Treinador treinador;

    public Time(String nome, String jogador1, String jogador2, Treinador treinador) {
        this.nome = nome;
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        this.treinador = treinador;
    }

    public void exibir() {
        System.out.println("Nome do time: " + nome);
        System.out.println("Jogador 1: " + jogador1);
        System.out.println("Jogador 2: " + jogador2);
        treinador.exibir();
        System.out.println();
    }
}

public class Main02 {
    public static void main(String[] args) throws IOException {
        // Recuperação do objeto liga persistido
        Liga ligaPersistida;
        try {
            FileInputStream fileIn = new FileInputStream("liga.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ligaPersistida = (Liga) in.readObject();
            in.close();
            fileIn.close();
            // Exibição das informações da liga persistida
            System.out.println("Informações da liga persistida:");
            ligaPersistida.exibirTimes();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
