
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TruckExpress {

    static String rotaEscolhida = "";
    static final List<String> rotas = new ArrayList<>();
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║       TRUCK EXPRESS SYSTEM     ║");
        System.out.println("╚════════════════════════════════╝\n");

        while (true) {
            System.out.println("╔════════Main Menu═════════╗");
            System.out.println("║ 1 - Acessar como Admin   ║");
            System.out.println("║ 2 - Acessar como Usuário ║");
            System.out.println("║ 0 - Sair do Sistema      ║");
            System.out.println("╚══════════════════════════╝");
            System.out.print("Opção: ");
            int escolha = scan.nextInt();
            System.out.println();
            switch (escolha) {
                case 1 -> adminLogin();
                case 2 -> userMenu();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida! Tente novamente.\n");
            }
        }
    }

    static void adminLogin() {
        while (true) {
            System.out.print("Login: ");
            String login = scan.next();
            System.out.print("Senha: ");
            String senha = scan.next();

            if ("admin".equals(login) && "admin".equals(senha)) {
                System.out.println("\nBem vindo, Administrador!\n");
                adminMenu();
                return;
            } else {
                System.out.println("**************************");
                System.out.println("Login ou senha incorretos!");
                System.out.println("**************************\n");
            }
        }
    }

    static void adminMenu() {
        while (true) {
            System.out.println("╔═════ Admin Menu ═════╗");
            System.out.println("║ 1 - Criar rota       ║");
            System.out.println("║ 2 - Editar rota      ║");
            System.out.println("║ 3 - Ver rotas        ║");
            System.out.println("║ 4 - Deletar rota     ║");
            System.out.println("║ 0 - Voltar           ║");
            System.out.println("╚══════════════════════╝");
            System.out.print("Escolha: ");
            int op = scan.nextInt();
            System.out.println();
            switch (op) {
                case 1 -> criarRotas();
                case 2 -> modificarRota();
                case 3 -> verRotas();
                case 4 -> deletarRota();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida!\n");
            }
        }
    }

    static void userMenu() {
        System.out.println("Bem vindo, Usuário!\n");
        while (true) {
            System.out.println("╔══════ User Menu ═════╗");
            System.out.println("║ 1 - Ver rotas        ║");
            System.out.println("║ 2 - Escolher rota    ║");
            System.out.println("║ 0 - Voltar           ║");
            System.out.println("╚══════════════════════╝");
            System.out.print("Escolha: ");
            int op = scan.nextInt();
            System.out.println();
            switch (op) {
                case 1 -> verRotas();
                case 2 -> escolherRotas();
                case 0 -> {
                    return;
                }
                default -> System.out.println("Opção inválida!\n");
            }
        }
    }

    public static void criarRotas() {
        while (true) {
            System.out.print("Origem: ");
            String origem = scan.next();
            System.out.print("Destino: ");
            String destino = scan.next();
            System.out.print("Distância em KM: ");
            double distancia = scan.nextDouble();
            System.out.print("Consumo (km/l): ");
            double kmLitro = scan.nextDouble();
            System.out.print("Preço do combustível: ");
            double preco = scan.nextDouble();
            double custo = (distancia / kmLitro) * preco;
            System.out.print("Carga: ");
            String carga = scan.next();
            System.out.print("Código (3 dígitos): ");
            int codigo = scan.nextInt();

            if (codigo < 100 || codigo > 999) {
                System.out.println("Código inválido. Precisa ter 3 dígitos.\n");
                continue;
            }

            boolean existe = rotas.stream().anyMatch(r -> r.contains("Código: " + codigo));
            if (existe) {
                System.out.println("Código já usado. Tente outro.\n");
                continue;
            }

            String dados = String.format(
                    "Origem: %s | Destino: %s | Distância: %.2fKm | Custo: R$ %.2f | Carga: %s | Código: %d",
                    origem, destino, distancia, custo, carga, codigo
            );

            rotas.add(dados);
            System.out.print("Adicionar outra rota? (s/n): ");
            String resp = scan.next().trim().toLowerCase();
            System.out.println();
            if ("n".equals(resp)) break;
        }
    }

    static void verRotas() {
        if (rotas.isEmpty()) {
            System.out.println("Nenhuma rota cadastrada.\n");
            return;
        }
        System.out.println("╔════ Rotas Disponíveis ════╗");
        for (int i = 0; i < rotas.size(); i++) {
            System.out.printf("║ %d - %s %n", i + 1, rotas.get(i));
        }
        System.out.println("╚═══════════════════════════╝\n");
    }

    static void deletarRota() {
        if (rotas.isEmpty()) {
            System.out.println("Nenhuma rota cadastrada.\n");
            return;
        }
        System.out.print("Código da rota para deletar: ");
        int codigo = scan.nextInt();
        for (int i = 0; i < rotas.size(); i++) {
            if (rotas.get(i).contains("Código: " + codigo)) {
                System.out.println("Rota deletada: " + rotas.get(i) + "\n");
                rotas.remove(i);
                return;
            }
        }
        System.out.println("Código não encontrado.\n");
    }

    static void modificarRota() {
        if (rotas.isEmpty()) {
            System.out.println("Nenhuma rota cadastrada.\n");
            return;
        }
        System.out.print("Código da rota a modificar: ");
        int codigo = scan.nextInt();
        for (int i = 0; i < rotas.size(); i++) {
            if (rotas.get(i).contains("Código: " + codigo)) {
                System.out.println("Rota para ser modificada: " + rotas.get(i) + "\n");
                rotas.remove(i);
                criarRotas();
                return;
            }
        }
        System.out.println("Código não encontrado.\n");
    }

    static void escolherRotas() {
        if (rotas.isEmpty()) {
            System.out.println("Nenhuma rota cadastrada.\n");
            return;
        }
        System.out.print("Código da rota a escolher: ");
        int codigo = scan.nextInt();
        System.out.println();
        for (String rota : rotas) {
            if (rota.contains("Código: " + codigo)) {
                rotaEscolhida = rota;
                System.out.println("Você escolheu:");
                System.out.println("» " + rotaEscolhida + "\n");
                cadastroMotorista();
                return;
            }
        }
        System.out.println("Código não encontrado.\n");
    }

    static void cadastroMotorista() {
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Sobrenome: ");
        String sobrenome = scan.next();
        System.out.print("Sexo (m/f): ");
        String sexo = scan.next().trim().toLowerCase();
        sexo = "m".equals(sexo) ? "Masculino" : "Feminino";
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        System.out.println();

        if (idade < 18) {
            System.out.println("Apenas maiores de 18 podem prosseguir.\n");
            return;
        }

        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("║                                                  DADOS DA VIAGEM                                                 ");
        System.out.println("╠════════╗═════════════════════════════════════════════════════════════════════════════════════════════════════════");
        System.out.println("║ Nome:  ║" + nome + " " + sobrenome + "                                                                           ");
        System.out.println("║ Sexo:  ║" + sexo + "                                                                                             ");
        System.out.println("║ Idade: ║" + idade + "                                                                                            ");
        System.out.println("║ Rota:  ║" + rotaEscolhida + "                                                                                    ");
        System.out.println("╚════════╝═════════════════════════════════════════════════════════════════════════════════════════════════════════");
    }

}
