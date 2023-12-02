import java.util.Scanner;

public class ex004_4 {
    public static void main(String[] args){
        //paralelogramo

        Scanner input = new Scanner(System.in);

        System.out.print("Base: ");
        double base = input.nextDouble();

        System.out.print("Altura: ");
        double altura = input.nextDouble();

        double resultado = base*altura;

        System.out.println("Resultado: " + resultado);


    }
}
