import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        int numeroUm = 0;
        int numeroDois = 0;

        try (Scanner sc = new Scanner(System.in)) {
            // Solicita ao usuário os valores dos parâmetros
            System.out.println("Digite o primeiro número inteiro: ");
            numeroUm = sc.nextInt();

            System.out.println("Digite o segundo número inteiro: ");
            numeroDois = sc.nextInt();

            // Verifica se o primeiro parâmetro é maior ou igual ao segundo
            if (numeroUm >= numeroDois) {
                throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
            }

            // Imprime os números do intervalo
            for (int i = numeroUm; i <= numeroDois; i++) {
                System.out.println("Imprimindo o número " + 1);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro ao processar os números. Certifique-se de que você está inserindo números inteiros válidos.");
        }
    }
}