import java.util.Scanner;

import static java.lang.System.in;

public class Ex10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(in);
        System.out.println("Iforme os lados do triangulo");
        int lado1 = sc.nextInt();
        System.out.println("Iforme os lados do triangulo");
        int lado2 = sc.nextInt();
        System.out.println("Iforme os lados do triangulo");
        int lado3 = sc.nextInt();

        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("é um triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("é um triangulo isóceles");
        } else {
            System.out.println("é um triangulo escaleno");
        }
    }
}
