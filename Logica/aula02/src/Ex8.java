import java.util.*;

public class Ex8 {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero");
        Integer numero1 = sc.nextInt();
        System.out.println("Informe um numero");
        Integer numero2 = sc.nextInt();
        System.out.println("Informe um numero");
        Integer numero3 = sc.nextInt();

        numeros.add(numero1);
        numeros.add(numero2);
        numeros.add(numero3);

        Collections.sort(numeros);

    System.out.println("Os numeros em ordem são: " + numeros);
    }
}
