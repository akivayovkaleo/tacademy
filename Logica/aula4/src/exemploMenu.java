import java.util.Scanner;

public class exemploMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("(1) cadastrar cliente: ");
            System.out.println("(2) cadastrar pet: ");
            System.out.println("(3) comprar pet: ");
            System.out.println("(4) excluir pet: ");
            System.out.println("(0) sair");
            System.out.println("Opção: ");
            String menu = sc.next();

            if (menu.equals("0")) break;

            switch (menu) {
                case "1" -> {
                    System.out.println("Digite o nome do cliente: ");
                }

                case "2" -> {
                    System.out.println("Digite o nome do pet: ");
                }
                case "3" -> {
                    System.out.println("Digite o nome do pet: ");
                }
                case "4" -> {
                    System.out.println("Digite o nome do pet: ");
                }

                default -> System.out.println("Entrada invalida");
            }
        }
    }
}
