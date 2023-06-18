import java.util.Scanner;
public class pbl01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro termo da PA: ");
        double primeiroTermo = sc.nextDouble();
        System.out.print("Digite a razão da PA: ");
        double razao = sc.nextDouble();
        System.out.print("Digite o número de termos da PA: ");
        int numeroTermos = sc.nextInt();
        double enesimoTermo = primeiroTermo + (numeroTermos - 1) * razao; //
        //cálculo do enésimo termo
        double soma = (primeiroTermo + enesimoTermo) * numeroTermos / 2; //
        //cálculo da soma
        System.out.println("O " + numeroTermos + "º termo da PA é: " +
        enesimoTermo);
        System.out.println("A soma dos " + numeroTermos + " termos da PA é: " +
        soma);
        sc.close();
}
}