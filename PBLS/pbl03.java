public class pbl03 {
public static void main(String[] args) {
    System.out.println("realizado pro guilherme vilela, beatriz petry, juliaengels, mariana camily e laura bapstin");
    client client01 = new client("Jandira Silve", 2500);
    client client02 = new client("Sandra Rodrigues", 1800);
    client client03 = new client("Luciana Teixeira", 5000);
    client01.output();
    client02.output();
    client03.output();
    client01.withdraw(1000);
    client01.output();
    client02.withdraw(2000);
    client02.deposit(500);
    client02.output();
    client02.withdraw(2000);
    client02.output();
    client03.deposit(1000);
    client03.output();
}
public static class client {
private String name;
private double balance;
public client(String name, double balance) {
this.name = name;
this.balance = balance;
}
public void deposit(double value) {
balance += value;
}
public void withdraw (double value) {
if (balance >= value) {
balance -= value;
} else {
System.out.println("insuficiente");
}
}
public void output() {
System.out.println("name: " + name + "Balance: " + balance);
}
}
}