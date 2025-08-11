import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos produtos você quer cadastrar?");
        int n = sc.nextInt();

       String[] nomes = new String[n];
       double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome do "+(i+1)+"ª produto: ");
            nomes[i] = sc.next();

            System.out.println("Digite o valor do "+(i+1)+"ª produto: ");
            precos[i] = sc.nextDouble();

        }

        System.out.println("Produtos cadastrados:\n");
        for (int i = 0; i < n; i++) {
            System.out.println(  nomes[i]+" custa "+ precos[i]+"\n");
        }

        System.out.println("Qual produto voce deseja ver?");
        int q = sc.nextInt();

        System.out.println(nomes[q]+" custa "+ precos[q]+"\n");
    }
}
