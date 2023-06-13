import java.io.PrintStream;

class ContatoTelefone extends Contato {
    private String numeroTelefone;

    public ContatoTelefone(String nome, String sobrenome, String numeroTelefone, String email, String cargo, String salario, String endereco, String dataNascimento) {
        super(nome, sobrenome, email, cargo, salario, endereco, dataNascimento);
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return this.numeroTelefone;
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
