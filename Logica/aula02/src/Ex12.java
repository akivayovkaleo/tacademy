import java.util.Scanner;

import static java.lang.System.in;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Iforme o suas horas trabalhadas");
        double horas = sc.nextDouble();
        System.out.println("Iforme o valor de sua hora");
        double valorHora = sc.nextDouble();

        double salario = valorHora * horas;
        int inss = 10;
        int fgts = 11;

        double ir = 0;
        if (salario <= 900){
            ir = 0;
        }
        else if (salario <= 1500){
            ir = 5;
        } else if (salario <= 2500){
            ir = 10;
        } else if (salario > 2500){
            ir = 20;
        }
        double descIr = (salario / 100.0) * ir;
        double descInss = (salario/100) * inss;
        double descFgts = (salario/100) * fgts;
        double descTotal = descFgts+descIr+descInss;
        double salarioLiquido = salario - descTotal;

        System.out.println("Salario bruto:("+valorHora+"*"+horas+") :R$"+ salario+ "\n" +
                "(-)IR("+ir+"%): R$ "+descIr+"\n" +
                "(-)INSS(10%) :R$ " +descInss+"\n" +
                "(-)FGTS(11%) :R$ "+descFgts+"\n" +
                "Total de descontos :R$"+descTotal+"\n\n\n" +
                "Salário liquido :R$ " + salarioLiquido);

    }
}
