import java.util.Scanner;

public class ex009 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 10;
        System.out.println("Média aritmética: " + media);

        scanner.close();
    }
}
