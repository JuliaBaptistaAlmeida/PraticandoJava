import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double nota;

        for (int i = 1; i <= 5; i++) {
            System.out.print("\nDigite a nota " + i + ": ");
            nota = sc.nextDouble();
            soma += nota;
        }

        double media = soma / 5;

        System.out.println("\nMédia: " + media);

        if (media >= 7) {
            System.out.println("\nStatus: Aprovado ✅");
        } else if (media >= 5) {
            System.out.println("\nStatus: Recuperação ⚠️");
        } else {
            System.out.println("\nStatus: Reprovado ❌");
        }

        sc.close();
    }
}
