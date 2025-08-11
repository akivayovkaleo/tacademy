import java.util.ArrayList;
import java.util.Scanner;

public class exemploLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        ArrayList<String> nomes = new ArrayList<>();
//        nomes.add("Juanito");//adicionar algo na lista
//
//        ArrayList<Double> notas = new ArrayList<>();
//
//        System.out.println(nomes.get(0));
//
//        for (int i = 0; i < nomes.size(); i++) {
//
//        }

//        -------------------------------------------------------------

        ArrayList<String> frutas = new ArrayList<>();

        while(true){
            System.out.println("Nome da fruta: ");
            String fruta = sc.nextLine();

            if (fruta.equals("0")) break;
            frutas.add(fruta);
        }

        System.out.println("Frutas:");

        for (int i = 0; i < frutas.size(); i++) {

            System.out.println(frutas.get(i));
        }
    }
}
