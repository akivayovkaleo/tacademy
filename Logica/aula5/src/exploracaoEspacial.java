import java.util.ArrayList;
import java.util.Scanner;

public class exploracaoEspacial {
    static ArrayList<String> nomesFrota = new ArrayList<>();
    static ArrayList<Double> precoFrota = new ArrayList<>();
    static ArrayList<Integer> quantidadesNaves = new ArrayList<>();
    static ArrayList<Integer> codigoFrota = new ArrayList<>();
    static ArrayList<ArrayList<String>> tripulacaoPorFrota = new ArrayList<>(); // Nova lista para tripulação por frota
    static ArrayList<String> tripulacao = new ArrayList<>();
    static ArrayList<Planeta> planetas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void cadastrarTripulacao(){
        System.out.print("Digite o nome tripulante: ");
        tripulacao.add(sc.next());
        System.out.println("Tripulante Adicionado!\n");
    }

    static void mostrarTripulacao(){
        System.out.println("Tripulantes:");
        for (int i = 0; i < tripulacao.size(); i++) {
            System.out.println(i + " - " + tripulacao.get(i));
        }
        System.out.println("");
    }

    static void deletarTripulacao(){
        System.out.print("Digite o indice a remover: ");
        int index = sc.nextInt();
        if (index >= 0 && index < tripulacao.size()) {
            tripulacao.remove(index);
            System.out.println("Tripulante removido!\n");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void alterarTripulacao(){
        System.out.print("Digite o indice a alterar: ");
        int opt = sc.nextInt();
        if (opt >= 0 && opt < tripulacao.size()) {
            System.out.print("Tripulante: " + tripulacao.get(opt) + " alterar para: ");
            String novo = sc.next();
            tripulacao.set(opt, novo);
            System.out.println("Tripulante " + opt + " Alterado\n");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    static void cadastroFrota() {
        System.out.println("Informe o nome da frota: ");
        nomesFrota.add(sc.next());
        System.out.println("Informe o valor da frota: ");
        precoFrota.add(sc.nextDouble());
        System.out.println("Informe quantas naves: ");
        quantidadesNaves.add(sc.nextInt());
        codigoFrota.add(nomesFrota.size() - 1);
        tripulacaoPorFrota.add(new ArrayList<>()); // Inicializa a lista de tripulantes para a nova frota
        System.out.println("Frota cadastrada com sucesso! O código da Frota é: " + (nomesFrota.size() - 1));
    }

    static void deletarFrota() {
        System.out.println("Informe o codigo da Frota para eliminar: ");
        int codigo = sc.nextInt();
        if (codigo >= 0 && codigo < nomesFrota.size()) {
            nomesFrota.remove(codigo);
            precoFrota.remove(codigo);
            quantidadesNaves.remove(codigo);
            codigoFrota.remove(Integer.valueOf(codigo));
            tripulacaoPorFrota.remove(codigo);
            System.out.println("Nave removida com sucesso");
        } else {
            System.out.println("Código inválido!");
        }
    }

    static void verFrota() {
        System.out.println("Frota atual: ");
        for (int i = 0; i < nomesFrota.size(); i++) {
            System.out.println("Código: " + codigoFrota.get(i) + " -\n Nome: " + nomesFrota.get(i) + " -\n Preço: "
                    + precoFrota.get(i) + " -\n Quantidade de naves: " + quantidadesNaves.get(i));
            System.out.println("Tripulação: " + tripulacaoPorFrota.get(i));
            System.out.println("--------------------");
        }
    }

    static void adicionarTripulanteAFrota() {
        verFrota();
        System.out.println("Digite o código da frota para adicionar tripulante: ");
        int codigoFrotaSelecionada = sc.nextInt();

        if (codigoFrotaSelecionada >= 0 && codigoFrotaSelecionada < nomesFrota.size()) {
            mostrarTripulacao();
            System.out.println("Digite o índice do tripulante a ser adicionado: ");
            int indiceTripulante = sc.nextInt();

            if (indiceTripulante >= 0 && indiceTripulante < tripulacao.size()) {
                tripulacaoPorFrota.get(codigoFrotaSelecionada).add(tripulacao.get(indiceTripulante));
                System.out.println("Tripulante adicionado à frota com sucesso!");
            } else {
                System.out.println("Índice de tripulante inválido.");
            }
        } else {
            System.out.println("Código de frota inválido.");
        }
    }

    static class Planeta {
        public final String nome;
        public final String tipo;
        public final ArrayList<String> frotasAssociadas = new ArrayList<>(); // Lista de frotas

        public Planeta(String nome, String tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }

        @Override
        public String toString() {
            return nome + " (" + tipo + ")";
        }
    }

    public static void cadastrarPlaneta() {
        System.out.println("Planeta: ");
        String nome = sc.next();
        System.out.println("Tipo: ");
        String tipo = sc.next();
        planetas.add(new Planeta(nome, tipo));
    }

    public static void mostrarPlanetas() {
        if (planetas.isEmpty()) {
            System.out.println("Nenhum planeta cadastrado.");
            return;
        }
        for (int i = 0; i < planetas.size(); i++) {
            Planeta planeta = planetas.get(i);
            System.out.println((i + 1) + " - " + planeta);
            System.out.println("  Frotas associadas: " + planeta.frotasAssociadas);
        }
    }

    public static void removerPlaneta() {
        if (planetas.isEmpty()) {
            System.out.println("Nada para remover.");
            return;
        }
        mostrarPlanetas();
        System.out.println("Número do planeta a remover:");
        int idx = sc.nextInt() - 1;
        if (idx >= 0 && idx < planetas.size()) {
            planetas.remove(idx);
            System.out.println("Planeta removido.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public static void adicionarFrotaAplaneta() {
        if (planetas.isEmpty() || nomesFrota.isEmpty()) {
            System.out.println("Nenhum planeta ou frota cadastrada.");
            return;
        }

        mostrarPlanetas();
        System.out.println("Número do planeta para associar frota:");
        int idxPlaneta = sc.nextInt() - 1;

        if (idxPlaneta >= 0 && idxPlaneta < planetas.size()) {
            verFrota();
            System.out.println("Código da frota para associar:");
            int codigoFrota = sc.nextInt();

            if (codigoFrota >= 0 && codigoFrota < nomesFrota.size()) {
                planetas.get(idxPlaneta).frotasAssociadas.add(nomesFrota.get(codigoFrota));
                System.out.println("Frota associada ao planeta com sucesso!");
            } else {
                System.out.println("Código de frota inválido.");
            }
        } else {
            System.out.println("Índice de planeta inválido.");
        }
    }

    public static void menuPlanetas() {
        while (true) {
            System.out.println("Menu de Planetas:");
            System.out.println("(1) - Novo planeta");
            System.out.println("(2) - Ver planetas");
            System.out.println("(3) - Remover planeta");
            System.out.println("(4) - Adicionar frota a um planeta"); // Nova opção
            System.out.println("(0) - Sair");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 -> cadastrarPlaneta();
                case 2 -> mostrarPlanetas();
                case 3 -> removerPlaneta();
                case 4 -> adicionarFrotaAplaneta(); // Chamada do novo método
                case 0 -> {
                    System.out.println("Saindo…");
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    static void menuFrota() {
        System.out.println("Menu da Frota:");
        while (true) {
            System.out.println("(1) - Ver frotas");
            System.out.println("(2) - Cadastrar Frota");
            System.out.println("(3) - Deletar Frota");
            System.out.println("(4) - Adicionar tripulante a frota"); // Nova opção
            System.out.println("(0) - Sair");
            int opcao = sc.nextInt();
            if (opcao == 0) break;
            switch (opcao) {
                case 1:
                    verFrota();
                    break;
                case 2:
                    cadastroFrota();
                    break;
                case 3:
                    deletarFrota();
                    break;
                case 4:
                    adicionarTripulanteAFrota(); // Chamada do novo método
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    static void menuTripulacao() {
        while (true) {
            System.out.println("Sistema de cadastro tripulação:");
            System.out.println("(1) - Cadastrar Tripulante");
            System.out.println("(2) - Ver Tripulantes");
            System.out.println("(3) - Alterar Tripulante");
            System.out.println("(4) - Remover Tripulante");
            System.out.println("(0) - Sair");
            String opt = sc.next();
            System.out.println();

            if (opt.equalsIgnoreCase("0")) break;

            switch (opt) {
                case "1" -> cadastrarTripulacao();
                case "2" -> mostrarTripulacao();
                case "3" -> alterarTripulacao();
                case "4" -> deletarTripulacao();
                default -> System.out.println("Comando invalido");
            }
        }
    }
S
    static void menu(){
        while(true){
            System.out.println("Selecione uma opção:");
            System.out.println("(1) - Menu Frotas");
            System.out.println("(2) - Menu Tripulantes");
            System.out.println("(3) - Menu Planetas");
            System.out.println("(0) - Sair");
            String opt = sc.next();
            System.out.println();

            if (opt.equalsIgnoreCase("0")) break;

            switch (opt){
                case "1" -> menuFrota();
                case "2" -> menuTripulacao();
                case "3" -> menuPlanetas();
                default -> System.out.println("Comando invalido");
            }
        }
    }
}