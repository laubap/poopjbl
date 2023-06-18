import java.io.Serializable;

abstract class Pessoa implements Exibivel, Serializable {
    //criação da classe abstrata pessoa
    private String nome;
    private String sobrenome;
    //criação dos atributos nome e sobrenome

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        //indica que a pessoa recebe o nome e sobrenome criados
    }

    public String getNome() {
        return this.nome;
        //método de retorno do nome
    }

    public String getSobrenome() {
        return this.sobrenome;
        //método de retorno do sobrenome
    }

    public abstract String getNumeroTelefone();
    public abstract void exibirDetalhes();
    //criação dos métodos abstratos que serão chamados posteriormente
}
