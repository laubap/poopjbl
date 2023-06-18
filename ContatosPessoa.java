import java.io.PrintStream;

class ContatosPessoa extends Pessoa {
    //ContatosPessoa herda os atributos de Pessoa
    public String numeroTelefone;
    public String email;
    //atributos da classe ContatosPessoa

    public ContatosPessoa(String nome, String sobrenome, String numeroTelefone, String email) {
        super(nome, sobrenome);
        //recebe o nome e sobrenome da superclasse
        this.numeroTelefone = numeroTelefone;
        this.email = email;
        //indica que o telefone e email são os atributos criados em ContatosPessoa
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
        //método abstrato (criado em Pessoa) que está retornando a string do número de telefone
    }

    public String getEmail() {
        return this.email;
        //método que está retornando a string do email
    }

    public void exibirDetalhes() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Nome: " + var10001 + " " + this.getSobrenome());
        System.out.println("Telefone: " + this.numeroTelefone);
        System.out.println("Email: " + this.getEmail());
        //método que realiza a exibição dos detalhes
    }

}

class ContatoTrabalho extends ContatosPessoa {
    //ContatoTrabalho herda os atributos de ContatosPessoa (e consequentemente de Pessoa)
    public String cargo;
    public String salario;
    //criação dos atributos cargo e salário

    public ContatoTrabalho(String nome, String sobrenome, String numeroTelefone, String email, String cargo, String salario) {
        super(nome, sobrenome, email, numeroTelefone);
        //indica que o nome, sobrenome, email e numero de telefone vem da superclasse
        this.cargo = cargo;
        this.salario = salario;
        //indica que o cargo e o salário são os atributos criados em ContatoTrabalho
    }

    public String getCargo() {
        return this.cargo;
        //método que retorna a string do cargo
    }
    public String getSalario() {
        return this.salario;
        //método que retorna a string do salário
    }

    public void exibirDetalhes() {
        PrintStream var10000 = System.out;
        String var10001 = this.getNome();
        var10000.println("Nome: " + var10001 + " " + this.getSobrenome());
        System.out.println("Telefone: " + this.numeroTelefone);
        System.out.println("Email: " + this.getEmail());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Salario: " + this.getSalario());
        //método que realiza a exibição de detalhes
    }
}

class ContatoAdicionais extends ContatoTrabalho {
    //ContatoAdicionais herda os atributos de ContatoTrabalho (e consequentemente de Pessoa e ContatosPessoa)
    public String endereco;
    public String dataNascimento;
    //criação dos atributos endereço e data de nascimento

    public ContatoAdicionais(String nome, String sobrenome, String numeroTelefone, String email, String cargo, String salario, String endereco, String dataNascimento) {
        super(nome, sobrenome, email, numeroTelefone, cargo, salario);
        //indica o recebimento dos atributos da superclasse (ContatoTrabalho)
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        //indica de endereço e data de nascimento são os atributos que foram criados em ContatoAdicionais
    }

    public String getEndereco() {
        return this.endereco;
        //método que retorna a string do endereço
    }

    public String getDataNascimento() {
        return this.dataNascimento;
        //método que retorna a string da data de nascimento
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
        //método que realiza a exibição de detalhes (dependendo da classe ele possui uma estrutura diferente)
    }
}
