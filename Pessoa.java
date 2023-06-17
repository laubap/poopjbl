import java.io.Serializable;

abstract class Pessoa implements Exibivel, Serializable {
    private String nome;
    private String sobrenome;
    private String email;
    //criação do contato em si

    public Pessoa(String nome, String sobrenome, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getEmail() {
        return this.email;
    }

    public abstract String getNumeroTelefone();
    public abstract void exibirDetalhes();
}
