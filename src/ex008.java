import java.util.Scanner;

public class ex008 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();

        double segundoValor;
        do{
            System.out.print("Digite o segundo valor (não pode ser zero ou negativo): ");
            segundoValor = scanner.nextDouble();
        }while (segundoValor <= 0);

        double resultado = primeiroValor / segundoValor;
        System.out.println("Resultado da divisão: " + resultado);

        scanner.close();
    }
}
