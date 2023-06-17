import java.io.Serializable;

abstract class Pessoa implements Exibivel, Serializable {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public abstract String getNumeroTelefone();
    public abstract void exibirDetalhes();
}
