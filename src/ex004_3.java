import java.util.Scanner;

public class ex004_3 {
    public static void main(String[] args){
        //trapézio

        Scanner input = new Scanner(System.in);

        System.out.print("Base maior: ");
        double maior = input.nextDouble();

        System.out.print("Base menor: ");
        double menor = input.nextDouble();

        System.out.println("Altura: ");
        double altura = input.nextDouble();

        double resultado = ((maior+menor)*altura)/2;
        System.out.println("Resultado: " + resultado);

    }
}
