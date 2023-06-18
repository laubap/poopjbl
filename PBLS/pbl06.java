import java.util.ArrayList;
public class pbl06 {
public static void main(String args[])
{
Empresa petrobras = new Empresa("Petrobras");
petrobras.incluir(new Concursado("Joao Silva",
"Engenheiro Químico", 1998, 8000.00));
petrobras.incluir(new Comissionado("Carmem Luz",
"Engenheiro Civil", 2007, 20000.00,
6000.00, "Diretor Geral"));
petrobras.incluir(new Horista("Manoel de Barros",
"Auxiliar de Limpeza", 12, 500,
40.00));
petrobras.incluir(new Mensalista("Tereza Alves",
"Secretaria", 24, 2500.00));
petrobras.gerar_folha();
}
}
public class Empresa {
private String nome;
private ArrayList<Funcionario> funcionarios;
public Empresa(String nome) {
this.nome = nome;
this.funcionarios = new ArrayList<Funcionario>();
}
public void incluir(Funcionario f) {
funcionarios.add(f);
}
public void gerar_folha() {
System.out.println("Folha de pagamento da empresa " + nome + ":\n");
for (Funcionario f : funcionarios) {
System.out.println(f.gerar_contra_cheque());
}
}
}
public abstract class Funcionario {
protected String nome;
protected String cargo;
protected int anoAdmissao;
public Funcionario(String nome, String cargo, int anoAdmissao) {
this.nome = nome;
this.cargo = cargo;
this.anoAdmissao = anoAdmissao;
}
public String getNome() {
return nome;
}
public String getCargo() {
return cargo;
}
public int getAnoAdmissao() {
return anoAdmissao;
}
public abstract double calcularSalario();
public String gerar_contra_cheque() {
return "Funcionário: " + nome + " | Cargo: " + cargo +
" | Ano de admissão: " + anoAdmissao + " | Salário: " +
calcularSalario();
}
}
public class Concursado extends Funcionario {
private double salario;
public Concursado(String nome, String cargo, int anoAdmissao,
double salario) {
super(nome, cargo, anoAdmissao);
this.salario = salario;
}
public double calcularSalario() {
return salario;
}
public String gerar_contra_cheque() {
//return String.valueOf(salario);
return "Contra cheque de ".concat(nome) + "\nFunção:
".concat(cargo) + "\nIngresso: ".concat(String.valueOf(anoAdmissao)) + "\nSalário:
".concat(String.valueOf(salario)) + "\nValor a Receber:
".concat(String.valueOf(salario)) + "\
n==================================================";
}
}
public class Comissionado extends Concursado {
private double comissao;
private String cargoComissao;
public Comissionado(String nome, String cargo, int anoAdmissao,
double salario, double comissao, String cargoComissao) {
super(nome, cargo, anoAdmissao, salario);
this.comissao = comissao;
this.cargoComissao = cargoComissao;
}
public double calcularSalario() {
return super.calcularSalario() + comissao;
}
public String gerar_contra_cheque() {
//return String.valueOf(salario + comissao);
return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(funcao) + "\
nIngresso: ".concat(String.valueOf(anoAdmissao)) + "\nCargo: ".concat(cargo) + "\
nSalário Mensal: ".concat(String.valueOf(salario)) + "\nComissão:
".concat(String.valueOf(comissao)) + "\nValor a Receber:
".concat(String.valueOf(salario + comissao)) + "\
n==================================================";
}
}
public abstract class Temporario extends Funcionario {
protected int mesesContrato;
public Temporario(String nome, String cargo, int anoAdmissao,
int mesesContrato) {
super(nome, cargo, anoAdmissao);
this.mesesContrato = mesesContrato;
}
}
public class Horista extends Funcionario {
private int horas_trabalhadas;
private double valor_horas;
public Horista (String nome, String cargo, int anoAdmissao, int
horas_trabalhadas, double valor_horas) {
super(nome, cargo, anoAdmissao);
this.horas_trabalhadas = horas_trabalhadas;
this.valor_horas = valor_horas;
}
public double calcularSalario() {
return horas_trabalhadas * valor_horas;
}
public String gerar_contra_cheque() {
return "Nome: " + getNome() + " | Cargo: " + getCargo() + " | Horas
Trabalhadas: " + horas_trabalhadas + " | Salario: R$ " + calcularSalario();
}
}
public class Horista extends Temporario {
private double valor_horas;
//private int horasTrabalhadas;
public Horista(String nome, String cargo, int anoAdmissao,
int mesesContrato, double valor_horas) {
super(nome, cargo, anoAdmissao, mesesContrato);
this.valor_horas = valor_horas;
//this.horasTrabalhadas = 0;
}
public void setHorasTrabalhadas() {
return valor_horas
}
public double calcularSalario() {
return valor_horas * 160; // considerando que um mês tem 160 horas
trabalhadas
}
public String gerar_contra_cheque () {
double salario = calcularSalario();
return super.gerar_contra_cheque() + " | Salario horista: " +
calcularSalario();
}
}
class mensalista extends temporario{
private double salario;
public mensalista(String nome, String cargo, int mesesContrato, double salario)
{
super(nome, cargo, mesesContrato);
this.salario = salario;
}
@Override
public String gerar_contra_cheque(){
//return String.valueOf(salario);
return "Contra cheque de ".concat(nome) + "\nFunção: ".concat(cargo) + "\
nTempo em Meses: ".concat(String.valueOf(tempo_meses)) + "\nSalário Mensal:
".concat(String.valueOf(salario)) + "\nValor a Receber:
".concat(String.valueOf(salario)) + "\
n==================================================";
}
public double getSalario_mensal() {
return salario_mensal;
}
}
public class Mensalista extends Funcionario {
private double salario;
public Mensalista(String nome, String cargo, int anoAdmissao, double
salario) {
super(nome, cargo, anoAdmissao);
this.salario = salario;
}
public double calcularSalario() {
return salario;
}
public String gerar_contra_cheque() {
return super.gerar_contra_cheque() + " | salario mensalista: " +
calcularSalario();
}
}
public class Comissionado extends Funcionario {
private double salario;
private double comissao;
public Comissionado(String nome, String cargo, int anoAdmissao, double
salario, double comissao) {
super(nome, cargo, anoAdmissao);
this.salario = salario;
this.comissao = comissao;
}
public double calcularSalario() {
return salario + comissao;
}
public String gerar_contra_cheque() {
return super.gerar_contra_cheque() + " | Salário comissão: " +
comissao;
}
}
public class Comissionado extends Concursado {
private double comissao;
private String cargoComissao;
public Comissionado(String nome, String cargo, int anoAdmissao,
double salario, double comissao, String cargoComissao) {
super(nome, cargo, anoAdmissao, salario);
this.comissao = comissao;
this.cargoComissao = cargoComissao;
}
public double calcularSalario() {
return super.calcularSalario() + comissao;
}
public String gerar_contra_cheque() {
return super.gerar_contra_cheque() + " | Cargo comissionado: " +
cargoComissao + " | Comissão: " + comissao;
}
}