import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = sc.next();

        System.out.println("Informe a nota 1 do aluno: ");
        double n1 = sc.nextDouble();

        System.out.println("Informe a nota 2 do aluno: ");
        double n2 = sc.nextDouble();

        System.out.println("Informe a nota 3 do aluno: ");
        double n3 = sc.nextDouble();

        System.out.println("Informe a nota 4 do aluno: ");
        double n4 = sc.nextDouble();

        double media = (n1+n2+n3+n4)/4;

        if (media > 8) {
            System.out.println("O aluno "+ nome + "é A e foi aprovado, parabéns!!");
        } else if (media < 8 && media > 6) {
            System.out.println("O aluno "+ nome + "é B e foi aprovado");
        } else if (media < 6 && media > 3) {
            System.out.println("O aluno "+ nome + "é C, e está em recuperação");
        } else if (media < 3 && media > 0) {
            System.out.println("O aluno "+ nome + "é d e foi reprovado automaticamente");
        }

    }
}
