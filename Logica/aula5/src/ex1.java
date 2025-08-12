import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos animais voce gostaria de cadastrar?: ");
        int n = sc.nextInt();

        String[] animais = new String[n];

        for (int i = 0; i < animais.length; i++) {
            System.out.println("Digite o nome do animal: ");
            animais[i] = sc.next();
        }

        System.out.println("Os animais são:");
        for (int i = 0; i < animais.length; i++) {
            System.out.println(animais[i]);
        }

    }
}