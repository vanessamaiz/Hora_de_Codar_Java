import java.util.Scanner;

public class ex007_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double maiorValor = Double.MIN_VALUE;
        double segundoMaiorValor = Double.MIN_VALUE;

        for(int i = 0; i < 5; i++){
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            double valor = scanner.nextDouble();

            if(valor > maiorValor){
                segundoMaiorValor = maiorValor;
                maiorValor = valor;
            }else if(valor > segundoMaiorValor){
                segundoMaiorValor = valor;
            }
        }

        double somaDosMaiores = maiorValor + segundoMaiorValor;

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}
