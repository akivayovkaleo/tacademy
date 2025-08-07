import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do produto: ");
        String nome = sc.next();
        System.out.println("Informe o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Informe o valor do desconto em %: ");
        double desc = sc.nextDouble();

        double valorDesc = (preco/100) * desc;
        double valorComDesc = preco - valorDesc;

        System.out.println("O valor com desconto é: " + valorComDesc);
    }
}
