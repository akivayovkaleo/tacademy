import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        int ano = sc.nextInt();
//        System.out.println(numero > 0 ? "O numero é positivo " : "o Numero é negativo");
        if (ano %4 == 0) {
            System.out.println("O ano é bissexto ");
        } else {
            System.out.println("O ano é normal ");
        }
    }
}
