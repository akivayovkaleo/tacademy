import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        double numero = sc.nextDouble();
//        System.out.println(numero > 0 ? "O numero é positivo " : "o Numero é negativo");
        if (numero %3 == 0 && numero %5 == 0) {
            System.out.println("O numero é divisivel por 3 e por 5 ");
        } else {
            System.out.println("O numero não é dividido por 3 e nem por 5  ");
        }
    }
}
