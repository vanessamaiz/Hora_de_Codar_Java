import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá " + nome +", sua idade é: " + idade);
        scanner.close();
    }
}
