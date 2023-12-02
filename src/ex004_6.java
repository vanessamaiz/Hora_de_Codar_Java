import java.util.Scanner;

public class ex004_6 {
    public static void main(String[] args){
        //círculo

        Scanner input = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = input.nextDouble();

        double resultado = Math.PI*Math.pow(raio,2);

        System.out.println("Resultado: " + String.format("%.2f",resultado));
    }
}
