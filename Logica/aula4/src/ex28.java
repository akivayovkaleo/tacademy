import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desc = 10;
        double precMorango = 2.50;
        double precMaca = 1.80;

        System.out.printf("Quantos kg de morango você quer? ");
        double kgMorango = sc.nextDouble();
        if (kgMorango > 8) precMorango = 1.98;
        else precMorango = 2.20;
        System.out.println("Quantos kg de maçã você quer? ");
        double kgMaca = sc.nextDouble();
        if (kgMaca > 8) precMaca = 1.35;
        else  precMaca = 1.50;


        double precFinalMorango = kgMorango * precMorango;
        double precFinalMaca = kgMaca * precMaca;
        double precTotal = precFinalMorango + precFinalMaca;

        System.out.println("O total da compra ficou: R$" +  precTotal+ "\n" +
                "O total do Morango foi de: R$" + precFinalMorango + "\n" +
                "O total da Maçã foi de : R$" + precFinalMaca);

    }
}