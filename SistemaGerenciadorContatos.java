import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//código para rodar no terminal
public class SistemaGerenciadorContatos {
    public static void main(String[] args) {
        GerenciadorContatos gerenciador = new GerenciadorContatos();
        //nova tela
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Adicionar funcionário");
                System.out.println("2 - Pesquisar funcionários");
                System.out.println("0 - Sair");
                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 0:
                        System.out.println("Encerrando o programa..");
                        return;
                    case 1:
                        System.out.println("Adicionar Funcionario");
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Sobrenome: ");
                        String sobrenome = scanner.nextLine();
                        System.out.print("Número de Telefone: ");
                        String numeroTelefone;
                        do {
                            numeroTelefone = scanner.nextLine();
                            if (!numeroTelefone.matches("[0-9]+")) {
                                System.out.println("Número de telefone inválido. Digite apenas dígitos numéricos.");
                            }
                        } while (!numeroTelefone.matches("[0-9]+"));
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Cargo: ");
                        String cargo = scanner.nextLine();
                        System.out.print("Salario: ");
                        String salario = scanner.nextLine();
                        System.out.print("Endereço: ");
                        String endereco = scanner.nextLine();
                        System.out.print("Data de nascimento: ");
                        String dataNascimento = scanner.nextLine();

                        ContatoAdicionais contato = null;

                        gerenciador.adicionarContato(contato);
                        System.out.println("Funcionário adicionado com sucesso!");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Pesquisar funcionário");
                        System.out.print("Termo de Pesquisa: ");
                        String termoPesquisa = scanner.nextLine();
                        List<ContatoAdicionais> contatosEncontrados = gerenciador.pesquisarContatos(termoPesquisa);
                        if (contatosEncontrados.isEmpty()) {
                            System.out.println("Nenhum funcionário encontrado.");
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Funcionarios encontrados:");
                            Iterator<ContatoAdicionais> iterator = contatosEncontrados.iterator();

                            while (iterator.hasNext()) {
                                ContatoAdicionais contatoEncontrado = iterator.next();
                                contatoEncontrado.exibirDetalhes();
                                System.out.println();
                            }
                            break;
                        }
                    default:
                        System.out.println("Opção inválida.");
                        System.out.println();
                        break;
                }
            }
        } catch (Exception var14) {
            System.out.println("Ocorreu um erro: " + var14.getMessage());
        } finally {
            scanner.close();
        }
        //usa a Exception para caso aconteça algum erro dentro do while
    }
}
