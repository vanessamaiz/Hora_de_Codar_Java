import java.util.Scanner;

public class ex013 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        double media = (primeiroNumero + segundoNumero) / 2.0;

        System.out.println("Números inteiros no intervalo:");
        for (int i = primeiroNumero; i <= segundoNumero; i++){
            System.out.print(i + " ");
        }

        System.out.println("\nMédia aritmética: " + media);

        scanner.close();
    }
}
