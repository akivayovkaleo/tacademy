import java.util.Scanner;

import static java.lang.System.in;

public class ExTabajara {
    public static void main(String[] args) {
            Scanner sc = new Scanner(in);

        System.out.println("Iforme o seu salario");
        double salario = sc.nextDouble();

        double reajuste;
        double contaRajuste;

        if(salario <= 280){
             reajuste = 20;
        } else if ( salario <= 700){
            reajuste = 15;
        }
        else if (salario <= 1500){
            reajuste = 10;
        }
        else{
            reajuste = 5;
        }

        double valorRajuste = (salario/100) * reajuste;
        contaRajuste = salario + valorRajuste;

        System.out.println("O seu salario antes do reajuste era:  " +salario+ "\n" +
                "O percentual de reajuste é de: "+reajuste+"%" +"\n" +
                "O valor do aumento foi de: " + valorRajuste+"\n" +
                "O novo salario é: "+ contaRajuste);
    }
}
