import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        //3. Escreva um método Java que recebe a nota de um aluno como um
        //double e a classifique e retorne um char de acordo com as seguintes
        //regras:
        //a. Maior ou igual a 9,00 - A
        //b. Maior ou igual a 8,0 e menor que 9,0 - B
        //c. Maior ou igual a 7,0 e menor que 8,0 - C
        //d. Maior ou igual a 6,0 e menor que 7,0 - D
        //e. Menor que 6,0 - E

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();
        System.out.println("Nota inserida: " + informandoNotaAluno(nota));

        String classificacao;

        if (nota >= 9.00) {
            System.out.println(classificacao = "A classificao da nota e A");
        } else if (nota >= 8.00 && nota < 9.00) {
            System.out.println(classificacao = "A classificao da nota e B");
        } else if (nota >= 7.00 && nota < 8.00) {
            System.out.println(classificacao = "A classificao da nota e C");
        } else if (nota >= 6.00 && nota < 7.00) {
            System.out.println(classificacao = "A classificao da nota e D");
        } else {
            System.out.println(classificacao = "A classificao da nota e E");
        }

    }

    public static double informandoNotaAluno(double nota) {

        return nota;
    }
}
