import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome);
        scanner.close();
    }
}
