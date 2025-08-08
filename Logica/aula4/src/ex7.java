import java.util.ArrayList;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int maior = 0;
        while (contador < 5) {
            System.out.println("Digite um numero:  ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }

        System.out.println("O maior numero que voce escreveu foi: " + maior);
    }
}
