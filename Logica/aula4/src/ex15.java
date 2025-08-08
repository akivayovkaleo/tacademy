import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Até que numero voce deseja que a sequencia de Fibonacci gere? ");
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int proximoNumero = 0;

        while (true) {
            proximoNumero = n1 + n2;
            if (proximoNumero > n) {
                break;
            }
            System.out.print(proximoNumero + " ");
            n1 = n2;
            n2 = proximoNumero;
        }

    }
}