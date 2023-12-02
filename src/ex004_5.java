import java.util.Scanner;

public class ex004_5 {
    public static void main(String[] args){
        //triângulo

        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        double base = input.nextDouble();

        System.out.print("Altura: ");
        double altura = input.nextDouble();

        double resultado = (base*altura)/2;

        System.out.println("Resultado: " + resultado);
    }
}
