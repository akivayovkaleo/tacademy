import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> sintomas = new ArrayList<>();
        List<String> diagnosticoPreliminar = new ArrayList<>();
        String dataConsultaEspecializada = "";

        System.out.println("Digite seu nome: ");
        String nome = scan.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.next();

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite seu email para contato: ");
        String email = scan.next();

        if (!email.contains("@")) {
            email = "email inválido";
            System.out.println("Email inválido!");
        }

        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scan.nextDouble();

        System.out.println("Digite seu sexo(M/F): ");
        String sexo = scan.next().toLowerCase();

        if (sexo.equals("m")){
            sexo = "Masculino";
        } else if (sexo.equals("f")) {
            sexo = "Feminino";
        }else {
            sexo = "Indefinido";
        }

//      Calcular IMC
        double calculoIMC = peso / (altura * altura);

        String valorIMC = "";

        if (calculoIMC < 18.5) valorIMC = "Baixo do peso";
        else if (calculoIMC < 24.99) valorIMC = "Normal";
        else if (calculoIMC < 29.99) valorIMC = "Sobrepeso";
        else valorIMC = "Obesidade";

        System.out.println();

        String dadosCadastrias = (" | DADOS CADASTRAIS | \n " +
                "| Nome:            | " + nome +
                "\n | Sobrenome:       | " + sobrenome +
                "\n | Idade:           | " + idade +
                "\n | Email:           | " + email +
                "\n | Peso:            | " + peso +
                "\n | Altura:          | " + altura +
                "\n | Sexo:            | " + sexo +
                "\n | IMC:             | " + calculoIMC +
                "\n | Classificação    | " + valorIMC
        );

        boolean marcarConsultaEspecialista = false;

        System.out.println("DESEJA INICAR A CONSULTA(S/N): ");
        String iniciarConsulta = scan.next().toLowerCase();

        int qntSim = 0;

        if (iniciarConsulta.equals("s"))
        {
            System.out.print("Você está com dor de cabeça(S/N)? ");
            String dorDeCabeça = scan.next().toLowerCase();

            if (dorDeCabeça.equals("s")) {
                sintomas.add("Dor de cabeça");
                qntSim += 1;
            }

            System.out.print("Você está enjoado(S/N)? ");
            String enjoo = scan.next().toLowerCase();

            if (enjoo.equals("s")) {
                sintomas.add("Enjoo");
                qntSim += 1;
            }

            System.out.print("Você está com tosse(S/N)? ");
            String tosse = scan.next().toLowerCase();

            if (tosse.equals("s")) {
                sintomas.add("Tosse");
                qntSim += 1;
            }

            System.out.print("Você está com dor no corpo(S/N)? ");
            String dorNoCorpo = scan.next().toLowerCase();

            if (dorNoCorpo.equals("s")) {
                sintomas.add("Dor no corpo");
                qntSim += 1;
            }

            System.out.print("Você está com dor de garganta(S/N)? ");
            String dorDeGarganta = scan.next().toLowerCase();

            if (dorDeGarganta.equals("s")) {
                sintomas.add("Dor de garganta");
                qntSim += 1;
            }

            if (qntSim == 0) {
                sintomas.add("Sem sintomas aparentes");
                System.out.println("Você está bem e só quer atestado!");
            }
            else if (qntSim == 1) {
                diagnosticoPreliminar.add("Imunidade Baixa");
                System.out.println("Você está com a imunidade baixa!");
            }
            else if (qntSim == 2) {
                diagnosticoPreliminar.add("Febre");
                System.out.println("Você está com febre!");
            }
            else if (qntSim == 3) {
                diagnosticoPreliminar.add("Gripe");
                System.out.println("Você está com gripe!");
            }
            else if (qntSim == 4) {
                diagnosticoPreliminar.add("Dengue");
                System.out.println("Você está com dengue!");
            }
            else if (qntSim == 5) {
                diagnosticoPreliminar.add("Não diagnosticado");
                System.out.println("Você deve marcar uma consulta com um especialista!");
                marcarConsultaEspecialista = true;
            }
        }
        if (marcarConsultaEspecialista) {
            System.out.println();
            System.out.println("Nossos 4 próximos horários disponiveis para consulta são: \n" +
                    "--------------------------------------------- \n" +
                    " 1 - |08/08 às 9:30  | Dra. Roselene \n " +
                    "2 - |08/08 às 10:00 | Dr. Marcos \n " +
                    "3 - |08/08 às 16:00 | Dr. Nathanael \n " +
                    "4 - |08/08 às 18:00 | Dra. Karol \n ");
            int escolhaDataConsultaEspecializada = scan.nextInt();

            switch (escolhaDataConsultaEspecializada){
                case 1:
                    dataConsultaEspecializada = "Consulta marcada para dia 08/08 às 9:30 com Dra. Roselene.";
                    break;
                case 2:
                    dataConsultaEspecializada = "Consulta marcada para dia 08/08 às 10:00 com Dr. Marcos.";
                    break;
                case 3:
                    dataConsultaEspecializada = "Consulta marcada para dia 08/08 às 16:00 com Dr. Nathanael.";
                    break;
                case 4:
                    dataConsultaEspecializada = "Consulta marcada para dia 08/08 às 18:00 com Dra. Karol.";
                    break;
            }
        }

        System.out.println();
        System.out.println("Deseja imprimir seu relatório final das informações de hoje(S/N): ");
        String relatorioFinal = scan.next().toLowerCase();

        if (relatorioFinal.equals("s")) {
            System.out.println(dadosCadastrias);
            System.out.println("Sintomas:    "+sintomas);
            System.out.println("Diagnóstico: "+ diagnosticoPreliminar);
            System.out.println(dataConsultaEspecializada);
        }
    }
}
