import java.util.Scanner;

public class ex014 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados = 0;
        char calcularOutroAluno;

        do {
            double somaNotas = 0;
            for(int i = 1; i <= 6; i++){
               System.out.print("Informe a nota " + i + ": ");
               double nota = scanner.nextDouble();
               somaNotas += nota;
            }

            double media = somaNotas / 6;

            if(media >= 6.5){
                System.out.println("Média fial: " + media);
                System.out.println("Aluno APROVADO!\n");
                alunosAprovados++;
            }else{
                System.out.println("Média Final: " + media);
                System.out.println("Aluno REPROVADO!\n");
            }

            System.out.print("Calcular a média de outro aluno? (S/N): ");
            calcularOutroAluno = scanner.next().charAt(0);

        }while (Character.toUpperCase(calcularOutroAluno) == 'S');

        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}
