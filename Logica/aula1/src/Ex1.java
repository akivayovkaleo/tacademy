import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o ano que nasceu: ");
        int anoNasc = sc.nextInt();

        System.out.printf("Informe o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNasc;

        System.out.println("A sua idade é: "+ idade);

    }
}