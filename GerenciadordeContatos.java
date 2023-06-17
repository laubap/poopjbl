import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class GerenciadorContatos implements Serializable {
    private List<ContatoAdicionais> contatos = new ArrayList();
    //lista de todos os contatos criados

    public GerenciadorContatos() {
    }

    public void adicionarContato(ContatoAdicionais contato) {
        this.contatos.add(contato);
    }

    public void exibirContatos() {
        if (this.contatos.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            Iterator var1 = this.contatos.iterator();

            while(var1.hasNext()) {
                ContatoAdicionais contato = (ContatoAdicionais)var1.next();
                contato.exibirDetalhes();
                System.out.println();
            }
        }

    }

    public void salvarContatos(String arquivo) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(arquivo));

            try {
                outputStream.writeObject(this.contatos);
                System.out.println("Funcionários salvos com sucesso.");
            } catch (Throwable var6) {
                try {
                    outputStream.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            outputStream.close();
        } catch (IOException var7) {
            System.out.println("Erro ao salvar os funcionários: " + var7.getMessage());
        }

    }

    public List<ContatoAdicionais> pesquisarContatos(String termoPesquisa) {
        List<ContatoAdicionais> contatosEncontrados = new ArrayList();
        Iterator var3 = this.contatos.iterator();

        while(var3.hasNext()) {
            ContatoAdicionais contato = (ContatoAdicionais)var3.next();
            String var10000 = contato.getNome();
            String nomeCompleto = var10000 + " " + contato.getSobrenome();
            if (nomeCompleto.toLowerCase().contains(termoPesquisa.toLowerCase())) {
                contatosEncontrados.add(contato);
            }
            //ajustes para a pesquisa dar certo
        }

        return contatosEncontrados;
    }
}