import java.util.Scanner;

import static java.lang.System.in;

public class Ex16 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(in);
        System.out.println("Iforme o valor de a ");
        double a = sc.nextDouble();
        if (a == 0){
            return;
        }
        System.out.println("Iforme o valor de b ");
        double b = sc.nextDouble();
        if (b < 0){
            System.out.println("A equação não possui raiz real: ");
            return;
        }
        System.out.println("Iforme o valor de c ");
        double c = sc.nextDouble();


    }
}
