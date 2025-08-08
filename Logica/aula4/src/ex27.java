import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Qual carne da promoção você quer?");
            System.out.println("1 - Filé Duplo");
            System.out.println("2 - Alcatra");
            System.out.print("Digite sua escolha (1 ou 2): ");
            int escolha = scan.nextInt();

            double precoPorKg = 0.0;
            double peso = 0.0;
            String nomeCarne = "";

            switch (escolha) {
                case 1:
                    nomeCarne = "Filé Duplo";
                    System.out.print("Digite quantos Kg de Filé Duplo: ");
                    peso = scan.nextDouble();
                    precoPorKg = (peso <= 5) ? 4.90 : 5.80;
                    break;
                case 2:
                    nomeCarne = "Alcatra";
                    System.out.print("Digite quantos Kg de Alcatra: ");
                    peso = scan.nextDouble();
                    precoPorKg = (peso <= 5) ? 5.90 : 6.80;
                    break;
                default:
                    System.out.println("Escolha inválida! Tente novamente.\n");
                    continue;
            }

            double valorTotal = precoPorKg * peso;

            System.out.printf("Valor a ser pago pelo %s: R$ %.2f%n", nomeCarne, valorTotal);

            System.out.print("Deseja pagar com o cartão Tabajara e ganhar 5% de desconto? (S/N): ");
            String resposta = scan.next().toLowerCase();

            if (resposta.equals("s")) {
                double desconto = valorTotal * 0.05;
                valorTotal -= desconto;
                System.out.printf("Você ganhou 5%% de desconto! Valor final: R$ %.2f%n", valorTotal);
            } else if (resposta.equals("n")) {
                System.out.printf("Sem desconto. Valor final: R$ %.2f%n", valorTotal);
            } else {
                System.out.println("Resposta inválida. Considerando que não deseja desconto.");
                System.out.printf("Valor final: R$ %.2f%n", valorTotal);
            }

            repetir = false;
        }

        scan.close();
    }
}
