import java.io.PrintStream;

class ContatosPessoa extends Pessoa {
    public String numeroTelefone;
    public String email;

    public ContatosPessoa(String nome, String sobrenome, String numeroTelefone, String email) {
        super(nome, sobrenome);
        this.numeroTelefone = numeroTelefone;
        this.email = email;
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void exibirDetalhes() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Nome: " + var10001 + " " + this.getSobrenome());
        System.out.println("Telefone: " + this.numeroTelefone);
        System.out.println("Email: " + this.getEmail());
    }
    //adição do telefone

}

class ContatoTrabalho extends ContatosPessoa {
    public String cargo;
    public String salario;

    public ContatoTrabalho(String nome, String sobrenome, String numeroTelefone, String email, String cargo, String salario) {
        super(nome, sobrenome, email, numeroTelefone);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }
    public String getSalario() {
        return this.salario;
    }

    public void exibirDetalhes() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Nome: " + var10001 + " " + this.getSobrenome());
        System.out.println("Telefone: " + this.numeroTelefone);
        System.out.println("Email: " + this.getEmail());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario: " + this.getSalario());
    }
}

class ContatoAdicionais extends ContatoTrabalho {
    public String endereco;
    public String dataNascimento;

    public ContatoAdicionais(String nome, String sobrenome, String numeroTelefone, String email, String cargo, String salario, String endereco, String dataNascimento) {
        super(nome, sobrenome, email, numeroTelefone, cargo, salario);
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void exibirDetalhes() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Nome: " + var10001 + " " + this.getSobrenome());
        System.out.println("Telefone: " + this.numeroTelefone);
        System.out.println("Email: " + this.getEmail());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Data nascimento: " + this.getDataNascimento());
    }
}
