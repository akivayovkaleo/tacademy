import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a base do retangulo: ");
        double b = sc.nextDouble();

        System.out.println("Informe a altura do retangulo: ");
        double h = sc.nextDouble();

        double a = b*h;

        System.out.println("A altura do retangulo é de " + b+ " \nE a laragura é de: " + h +" \nA área é de " + a);

    }
}