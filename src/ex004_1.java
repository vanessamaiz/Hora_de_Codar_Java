import java.util.Scanner;

public class ex004_1 {
    public static void main(String[] args) {
        //quadrado

        Scanner input = new Scanner(System.in);

        System.out.print("Lado do quadrado: ");
        double lado = input.nextDouble();

        double resultado = Math.pow(lado,2);

        System.out.println("Resultado: " + resultado);

        input.close();
    }
}
