import java.io.*;
import java.util.ArrayList;
import java.util.List;
package src;
class Liga implements Serializable {
    private List<Time> times;

    public Liga() {
        times = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        times.add(time);
    }

    public void exibirTimes() {
        for (Time time : times) {
            time.exibir();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação da liga
        Liga liga = new Liga();

        // Criação dos times
        Treinador treinador1 = new Treinador("João");
        Time time1 = new Time("Time A", "Jogador 1", "Jogador 2", treinador1);

        Treinador treinador2 = new Treinador("Maria");
        Time time2 = new Time("Time B", "Jogador 3", "Jogador 4", treinador2);

        Treinador treinador3 = new Treinador("Pedro");
        Time time3 = new Time("Time C", "Jogador 5", "Jogador 6", treinador3);

        // Adição dos times à liga
        liga.adicionarTime(time1);
        liga.adicionarTime(time2);
        liga.adicionarTime(time3);

        // Exibição dos times da liga
        System.out.println("Times da liga:");
        liga.exibirTimes();

        // Persistência da liga
        try {
            FileOutputStream fileOut = new FileOutputStream("liga.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(liga);
            out.close();
            fileOut.close();
            System.out.println("Objeto liga foi persistido com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
