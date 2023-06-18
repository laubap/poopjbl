import java.io.FileWriter;
import java.io.IOException;


public class lerArquivotxt {
    //tentativa de criação do arquivo txt
    public static void main(String[] args) throws IOException {
        String caminho = "C:\\Users\\beatr\\Documents\\GitHub\\poopjbl\\funcionarios.txt";
        //alterar o caminho para o do seu PC
        String cadastros = "teste";

        FileWriter escrever = new FileWriter(caminho);
        escrever.write(cadastros);
    }
}