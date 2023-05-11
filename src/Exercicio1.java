import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //1. Crie um programa que pode controlar o volume e trocar os canais
        //da televisão. O controle de volume permite:
        //a. aumentar ou diminuir a potência do volume de som em uma
        //unidade de cada vez;
        //b. aumentar e diminuir o número do canal em uma unidade
        //trocar para um canal indicado;
        //c. consultar o valor do volume de som e o canal selecionado.

        Scanner sc = new Scanner(System.in);
        int volume = 100;
        int canal = 40;

        while (true) {

            System.out.println("Escolha uma opcao: ");
            System.out.println("1. Aumentar o volume");
            System.out.println("2. Diminuir o  volume");
            System.out.println("3. Aumentar o canal");
            System.out.println("4. Diminuir o canal ");
            System.out.println("5. Trocar de canal");
            System.out.println("6. Consultar o valor do volume e do canal selecionado");
            System.out.println("7. Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (volume >= 100){
                        System.out.println("O volume atual sera mantido");
                    } else {
                        int aumentarVolume = volume += 1;
                        System.out.println("O volume atual e: " + volume);
                    }
                    break;
                case 2:
                    if (volume > 100){
                        System.out.println("O volume atual sera mantido");
                    } else {
                        int diminuirVolume = volume -= 1;
                        System.out.println("O volume atual e: " + volume);
                    }
                    break;
                case 3:
                    if (canal >= 40) {
                        System.out.println("O canal atual sera mantido");
                    } else {
                        int aumentarCanal = canal + 1;
                        System.out.println("O canal foi para: " + aumentarCanal);
                    }
                    break;
                case 4:
                    if (canal > 40) {
                        System.out.println("O canal atual sera mantido");
                    } else {
                        int diminuirCanal = canal - 1;
                        System.out.println("O canal foi para: " + diminuirCanal);
                    }
                    break;
                case 5:
                    System.out.println("Digite o numero do canal: ");
                    int auxCanal = sc.nextInt();
                    if (auxCanal > 40 || auxCanal < 1){
                        System.out.println("Os canais existentes na TV é de 1 a 40");
                    } else {
                        canal = auxCanal;
                        System.out.println("O canal atual e: " + canal);
                    }
                    break;
                case 6:
                    System.out.println("Canal atual: " + canal);
                    System.out.println("Volume atual: " + volume);
                case 7:
                    System.out.println("O programa foi encerrado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
