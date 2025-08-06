import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o raio do circulo: ");
        double raio = sc.nextDouble();

        double area = (raio*raio) * Math.PI;

        System.out.println("A area do Circulo é de: " + area);
    }
}
