import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Crie um programa que contenha os seguintes métodos:
        //a. public static String dizerInformacao(String nome);
        //Deve retornar um texto dizendo: “ Meu nome é “ + nome .
        //b. public static String dizerInformacao(int idade);
        //Deve retornar um texto dizendo: “ Minha idade é “ + idade .
        //c. public static String dizerInformacao(double peso, double
        //altura);
        //Deve retornar um texto dizendo: “ Meu peso é “ + peso + “ e
        //minha altura é “ + altura .

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o nome: ");
        String nome = sc.next();

        System.out.println("Meu nome e: " + dizerInformacao(nome));

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        System.out.println("Minha idade e: " + dizerInformacao(idade) + " anos");

        System.out.print("Digite o peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        System.out.println("Meu peso e: " + peso + " kg" + " e minha altura e: " + altura);


    }

    public static String dizerInformacao(String nome) {
        return nome;

    }

    public static Integer dizerInformacao(int idade) {
        return idade;
    }

    public static Double dizerInformacao(double peso, double altura) {
        return dizerInformacao(peso, altura);
    }

}
