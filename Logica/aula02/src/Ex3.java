import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 30 ){
            System.out.println("Você é jovem!");
        } else if (idade > 30 && idade < 65) {
            System.out.println("Você é um adulto! ");
        } else {
            System.out.println("Você é Idoso!");
        }


    }
}
