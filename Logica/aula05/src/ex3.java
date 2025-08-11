import java.util.ArrayList;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos você quer cadastrar?");
        int n = sc.nextInt();

        ArrayList<String> nomeProduto = new ArrayList<>();
        ArrayList<Double> precoProduto = new ArrayList<>();

        for (int i = 0; i < n; i++) {
//            System.out.println("Digite (0) para sair ");
//            int sair = sc.nextInt();
//            if (sair == 0) break;

            System.out.println("Digite o nome  do "+(i+1)+"ª produto: ");
            nomeProduto.add(sc.next());

            System.out.println("Digite o preço do "+(i+1)+" produto: ");
            precoProduto.add(sc.nextDouble());
        }

        System.out.println("Produtos: ");

         for (int i = 0; i < n; i++) {
             System.out.println(nomeProduto.get(i)+" "+precoProduto.get(i));
         }

        System.out.println("Qual o numero do produto que voce quer consutar? ");
         int q = sc.nextInt();

        System.out.println(nomeProduto.get(q-1) + " "+precoProduto.get(q-1));
    }
}
