import java.util.Scanner;

public class ex004_2 {
    public static void main(String[] args){
        //losango

        Scanner input = new Scanner(System.in);

        System.out.print("Diagonal maior: ");
        double maior = input.nextDouble();

        System.out.print("Diagonal menor: ");
        double menor = input.nextDouble();

        double resultado = (maior*menor)/2;

        System.out.println("Resultado: " + resultado);
    }
}
