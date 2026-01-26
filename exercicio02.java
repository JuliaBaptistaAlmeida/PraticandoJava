import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2;
        int opcao;
        double resultado;

        while (true) {
            System.out.print("\nDigite o primeiro número: ");

            if (sc.hasNextDouble()) {
                num1 = sc.nextDouble();
                break;
            } else {
                System.out.println("Erro: digite um número válido.");
                sc.next(); // limpa entrada errada
            }
        }

        while (true) {
            System.out.print("\nDigite o segundo número: ");

            if (sc.hasNextDouble()) {
                num2 = sc.nextDouble();
                break;
            } else {
                System.out.println("Erro: digite um número válido.");
                sc.next();
            }
        }

        while (true) {
            System.out.println("""
            Escolha a operação:
            1 - Soma
            2 - Subtração
            3 - Multiplicação
            4 - Divisão
            """);
            System.out.print("\nOpção: ");

            if (sc.hasNextInt()) {
                opcao = sc.nextInt();

                if (opcao >= 1 && opcao <= 4) {
                    break;
                } else {
                    System.out.println("Erro: escolha entre 1 e 4.");
                }

            } else {
                System.out.println("Erro: digite apenas números.");
                sc.next();
            }
        }

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;

            case 2:
                resultado = num1 - num2;
                break;

            case 3:
                resultado = num1 * num2;
                break;

            case 4:
                while (num2 == 0) {
                    System.out.println("Erro: divisão por zero.");
                    System.out.print("Digite outro número: ");

                    if (sc.hasNextDouble()) {
                        num2 = sc.nextDouble();
                    } else {
                        System.out.println("Número inválido.");
                        sc.next();
                    }
                }
                resultado = num1 / num2;
                break;

            default:
                System.out.println("Erro inesperado.");
                return;
        }

        System.out.println("\nResultado: " + resultado);
    }
}
