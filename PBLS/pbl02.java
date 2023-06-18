    import java.util.Scanner;

public class pbl02 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o valor de a: ");
    double a = scanner.nextDouble();

    System.out.print("Digite o valor de b: ");
    double b = scanner.nextDouble();

    if (a > b) {
        System.out.println("Erro: valor de a deve ser menor ou igual ao valorde b");
        return;
    }

    System.out.print("Digite o valor de n: ");

    int n = scanner.nextInt();

    if (n <= 0) {
        System.out.println("Erro: o valor de n deve ser maior que zero");
        return;
    }

    double area_total = 0.0;
    double x = a;
    double h = (b - a) / n;
    double y1 = f(x);
    for (int i = 0; i < n; i++) {
    x += h;
    double y2 = f(x);
    double area_trapezio = ((y1 + y2) / 2.0) * h;
    area_total += area_trapezio;
    y1 = y2;
    }
    System.out.println("A área aproximada sob a curva é: " + area_total);
    }
    public static double f(double x) {
    // Insira a função que você deseja calcular a área aqui
        return x * x;
    }
}

