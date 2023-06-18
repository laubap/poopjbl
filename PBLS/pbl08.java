//Beatriz Petry, Gulherme Vilela, Julia Engels, Mariana Camily e Laura Baptistini
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
class ExcecaoSenhaInvalida extends Exception {
public ExcecaoSenhaInvalida(String message) {
super(message);
}
// criação da excecao senha invalida
class ExcecaoSaldoInsuficiente extends Exception {
public ExcecaoSaldoInsuficiente(String message) {
super(message);
}
}
// criação da excecao saldo insuficiente
class ExcecaoContaInvalida extends Exception {
public ExcecaoContaInvalida(String message) {
super(message);
}
}
// criação da excecao conta inválida
class ExcecaoHorarioInvalido extends Exception {
public ExcecaoHorarioInvalido(String message) {
super(message);
}
}
// criação da excecao horario invalido
class ContaCorrente {
private int numeroConta;
private String senha;
private double saldo;
// criação da classe conta corrente, que recebe o número da conta, a senha e osaldo
public ContaCorrente(int numeroConta, String senha, double saldo) {
this.numeroConta = numeroConta;
this.senha = senha;
this.saldo = saldo;
}
public int getNumeroConta() {
return numeroConta;
}
public String getSenha() {
return senha;
}
public void retirar(String senha, double valor) throws ExcecaoSenhaInvalida,
ExcecaoSaldoInsuficiente {
if (!this.senha.equals(senha)) {
throw new ExcecaoSenhaInvalida("Senha Inválida/Incorreta");
}
if (valor > saldo) {
throw new ExcecaoSaldoInsuficiente("Saldo Insuficiente");
}
saldo -= valor;
// A partir desses dados analisa se a senha é válida e se o saldo é suficiente ou não (com as excecoes criadas anteriormente)
}
}
class Banco {
private List<ContaCorrente> contas;
public Banco() {
contas = new ArrayList<>();
}
public void criarConta(int numeroConta, String senha, double saldo) {
ContaCorrente conta = new ContaCorrente(numeroConta, senha, saldo);
contas.add(conta);
}
// Criação de uma nova conta corrente (add ela a array contas)
public void sacar(int numeroConta, String senha, double valor)
throws ExcecaoContaInvalida, ExcecaoSenhaInvalida,
ExcecaoHorarioInvalido, ExcecaoSaldoInsuficiente {
ContaCorrente conta = null;
for (ContaCorrente c : contas) {
if (c.getNumeroConta() == numeroConta) {
conta = c;
break;
// acha a conta que o saque quer ser feito
}
}
if (conta == null) {
throw new ExcecaoContaInvalida("Conta Inválida/Inexistente");
}
// se a conta for nula ela é inválida (é chamada a excecao)
if (!conta.getSenha().equals(senha)) {
throw new ExcecaoSenhaInvalida("Senha Inválida/Incorreta");
}
// caso a senha não bata (é chamada a excecao)
LocalTime now = LocalTime.now();
if (now.isBefore(LocalTime.of(8, 0)) || now.isAfter(LocalTime.of(22, 0))) {
throw new ExcecaoHorarioInvalido("Horário para saque Inválido");
}
// analisa caso o horário do saque seja inadequado (é chamada a excecao)
conta.retirar(senha, valor);
}
}
public class pbl08 {
    public static void main(String[] args) {
    Banco banco = new Banco();
        for (int i = 0; i < 5; i++) {
        banco.criarConta(i + 1, "senha" + (i + 1), 100.0);
        //criando uma conta no novo banco
        }
        for (int i = 0; i < 10; i++) {
            try {
            int numeroConta = i % 5 + 1;
            String senha = "senha" + (i % 5 + 1);
            double valor = 20.0 * (i + 1);
            banco.sacar(numeroConta, senha, valor);
            System.out.println("Saque realizado com sucesso!");
            } catch (ExcecaoContaInvalida e) {
            System.out.println("Erro: Conta inválida - " + e.getMessage());
            } catch (ExcecaoSenhaInvalida e) {
            System.out.println("Erro: Senha inválida - " + e.getMessage());
            } catch (ExcecaoHorarioInvalido e) {
            System.out.println("Erro: Horário de saque inválido (Hórarioperdimitido: 8h - 22h) - " + e.getMessage());
            } catch (ExcecaoSaldoInsuficiente e) {
            System.out.println("Erro: Saldo insuficiente - " + e.getMessage());
            }
        //verificação e validações com as excecoes criadas (try e catch)
        }
    }
}
