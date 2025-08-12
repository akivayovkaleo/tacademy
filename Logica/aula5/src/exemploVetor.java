import java.util.Scanner;

public class exemploVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        double[] nota = new double[3];
//        System.out.printf("Iforme a nota do aluno: ");
//        nota[0] = sc.nextDouble();
//        System.out.printf("Iforme a nota do aluno: ");
//        nota[1] = sc.nextDouble();
//        System.out.printf("Iforme a nota do aluno: ");
//        nota[2] = sc.nextDouble();
//        System.out.printf("Iforme a nota do aluno: ");
//        nota[3] = sc.nextDouble();

        double[] vetor = new double[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

    }
}