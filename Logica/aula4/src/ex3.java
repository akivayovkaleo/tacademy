import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite um nome: ");
            String nome = sc.next();
            while (!nome.equalsIgnoreCase(nome)) {
                System.out.println(nome+"Invalido, o nome precisa ter pelo menos 3 caracteres");
                System.out.println("Digite o seu nome: ");
                nome = sc.next();
            }

            System.out.println("Digite Sua idade: ");
            int idade = sc.nextInt();
            while (idade < 0 || idade > 150) {
                System.out.println("idade invalida");
                System.out.println("Digite Sua idade novamente: ");
                idade = sc.nextInt();

            }
            System.out.println("Digite seu salário: ");
            double salario = sc.nextDouble();
            while (salario < 0 || salario > 100) {
                System.out.println("salario invalido");
                System.out.println("Digite seu salario: ");
                salario = sc.nextDouble();
            }
        System.out.println("Digite seu sexo (M/F): ");
        String sexo = sc.next().toLowerCase();
        String sexoString = String.valueOf(sexo);
        while (!sexoString.equals("m") && !sexoString.equals("f")) {
            System.out.println("Sexo inválido! Digite novamente (M/F): ");
            sexo = sc.next().toLowerCase();

        }
            System.out.println("Digite se estado civil S/C: ");
            String estadoCivil = sc.next();
            while (!estadoCivil.equalsIgnoreCase("c") && !estadoCivil.equalsIgnoreCase("s")) {
                System.out.println("Estado civil invalido");
                System.out.println("Digite seu estado civil S/C: ");
                estadoCivil = sc.next();
            }

    }
}
