import java.util.Scanner;

public class Ex6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double a, b,c;
        double delta;
        double x1,x2;

        System.out.println("A: ");
        a = sc.nextDouble();

        System.out.println("B: ");
        b = sc.nextDouble();

        System.out.println("C: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2*a);
        x2 = (-b - Math.sqrt(delta)) / (2*a);

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);
    }
}
