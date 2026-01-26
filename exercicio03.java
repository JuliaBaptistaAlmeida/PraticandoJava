import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("\nDigite o nome " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("\n--- Lista de nomes ---");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        sc.close();
    }
}
