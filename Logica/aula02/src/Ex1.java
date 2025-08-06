import java.util.Scanner;
public class Ex1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numero = sc.nextInt();
//        System.out.println(numero > 0 ? "O numero é positivo " : "o Numero é negativo");
        if (numero > 0) {
            System.out.println("O numero é positivo ");
        } else {
            System.out.println("O numero é negativo ");
        }
    }
}
