import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        //retangulo

        Scanner input = new Scanner(System.in);

        System.out.println("Base do retangulo: ");
        double base = input.nextDouble();

        System.out.println("Altura do retangulo: ");
        double altura = input.nextDouble();

        double area = base*altura;

        System.out.println("Resultado: " + area);

        input.close();

    }
}
