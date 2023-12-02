import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = input.nextDouble();

        if(numero==0){
            System.out.println("O " + numero + " é neutro.");
        }else if(numero<=0){
            System.out.println("O " + numero + " é negativo.");
        }else{
            System.out.println("O " + numero + " é positivo.");
        }
    }
}
