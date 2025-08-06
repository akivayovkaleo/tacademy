import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, informe os dados cientificos de um Animal, e o nome do animal ");

        System.out.println("Iforme o nome: ");
        String nome = sc.next();

        System.out.println("Iforme o Reino: ");
        String reino = sc.next();

        System.out.println("Iforme o filo: ");
        String filo = sc.next();

        System.out.println("Iforme o classe: ");
        String classe = sc.next();

        System.out.println("Iforme o Familia: ");
        String familia = sc.next();

        System.out.println("Iforme o Gênero: ");
        String genero = sc.next();

        for (int i = 0; i < 15; i++) {
            System.out.println("\n");
        }

    System.out.println("O nome é: " + nome +
            "\nO reino é " + reino + "" +
            "\nO filo é " + filo + "\n" +
            "A classe é " + classe + "\n" +
            "A familia é " + familia + "\n" +
            "O gênero é" + genero);
    }

}
