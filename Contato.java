import java.io.Serializable;

abstract class Contato implements Exibivel, Serializable {
    private String nome;
    private String sobrenome;
    private String email;
    private String cargo;
    private String salario;
    private String endereco;
    private String dataNascimento;
    //criação do contato em si

    public Contato(String nome, String sobrenome, String email, String cargo, String salario, String endereco, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
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

    public String getCargo() {
        return this.cargo;
    }

    public String getSalario() {
        return this.salario;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    // Adicionar o método abstrato getNumeroTelefone()
    public abstract String getNumeroTelefone();

    public abstract void exibirDetalhes();
}
