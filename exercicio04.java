import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10]; // pode cadastrar até 10
        int contador = 0;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Sair");
            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (contador < nomes.length) {
                        System.out.print("\nDigite o nome: ");
                        nomes[contador] = sc.nextLine();
                        contador++;
                        System.out.println("\nNome cadastrado com sucesso! ✅");
                    } else {
                        System.out.println("\nLista cheia! ❌");
                    }
                    break;

                case 2:
                    System.out.println("\n--- NOMES CADASTRADOS ---");

                    if (contador == 0) {
                        System.out.println("\nNenhum nome cadastrado.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + " - " + nomes[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nSaindo do sistema... 👋");
                    break;

                default:
                    System.out.println("\nOpção inválida! ⚠️");
            }

        } while (opcao != 3);

        sc.close();
    }
}
