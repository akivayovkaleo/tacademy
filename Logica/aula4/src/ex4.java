import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a população do pais A:");
        double populacaoA = sc.nextDouble();
        System.out.println("Digite a porcentagem de crescimento do pais A:");
        double porcentagemA = sc.nextDouble();
        System.out.println("Digite a população do pais B:");
        double populacaoB = sc.nextDouble();
        System.out.println("Digite a porcentagem de crescimento do pais B:");
        double porcentagemB = sc.nextDouble();

        int anos = 0;
        double fatorCrescimentoA = 1 + (porcentagemA / 100.0);
        double fatorCrescimentoB = 1 + (porcentagemB / 100.0);


        while (populacaoA <= populacaoB) {

            if (fatorCrescimentoA <= fatorCrescimentoB) {
                System.out.println("O país A nunca alcançará ou ultrapassará o país B.");
                break;
            }
            populacaoA = populacaoA * fatorCrescimentoA;
            populacaoB = populacaoB * fatorCrescimentoB;
            anos++;
        }

        System.out.printf("População do país A: %.2f\n", populacaoA);
        System.out.printf("População do país B: %.2f\n", populacaoB);
        System.out.println("Tempo para o país A ultrapassar o país B: " + anos + " anos");

        sc.close();
    }
}
