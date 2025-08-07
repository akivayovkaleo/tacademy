import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        double numero = sc.nextDouble();
//        System.out.println(numero > 0 ? "O numero é positivo " : "o Numero é negativo");
        if (numero %2 ==  0) {
            System.out.println("O numero é par ");
        } else {
            System.out.println("O numero é ímpar ");
        }
    }
}
