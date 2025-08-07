import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 65){
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você não pode se aposentar!");
        }


    }
}
