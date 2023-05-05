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

        LinkedList<Integer> listaControle = new LinkedList<>();

        while (true) {

            System.out.println("Escolha uma opcao: ");
            System.out.println("1. Escolha a potencia do volume desejado ");
            System.out.println("2. Diminuir o  volume");
            System.out.println("3. Aumentar o volume");
            System.out.println("4. Escolha o canal ");
            System.out.println("5. Aumentar o canal");
            System.out.println("6. Diminuir o canal");
            System.out.println("7. Consultar volume e o canal selecionado");
            System.out.println("8. Sair");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a potencia do volume desejado: ");
                    int volume = sc.nextInt();
                    listaControle.add(volume);
                    System.out.println("Volume adicionado");
                    break;
                case 2:
                    if (listaControle.isEmpty()) {
                        System.out.println("O volume atual sera mantido");
                    } else {
                        int diminuirVolume = listaControle.remove();
                        diminuirVolume = diminuirVolume - 1;
                        System.out.println("O volume atual e: " + diminuirVolume);
                    }
                    break;
                case 3:
                    if (listaControle.isEmpty()) {
                        System.out.println("O volume atual sera mantido");
                    } else {
                        int aumentarVolume = listaControle.remove();
                        aumentarVolume = aumentarVolume + 1;
                        System.out.println("O volume atual e: " + aumentarVolume);
                    }
                    break;
                case 4:
                    System.out.println("Digite o numero do canal: ");
                    int canal = sc.nextInt();
                    listaControle.add(canal);
                    System.out.println("Canal adicionado");
                    break;
                case 5:
                    if (listaControle.isEmpty()) {
                        System.out.println("O canal atual sera mantido");
                    } else {
                        int aumentarCanal = listaControle.remove();
                        aumentarCanal = aumentarCanal + 1;
                        System.out.println("O volume atual e: " + aumentarCanal);
                    }
                    break;
                case 6:
                    if (listaControle.isEmpty()) {
                        System.out.println("O canal atual sera mantido");
                    } else {
                        int diminuirCanal = listaControle.remove();
                        diminuirCanal = diminuirCanal - 1;
                        System.out.println("O volume atual e: " + diminuirCanal);
                    }
                    break;
                case 7:
                    if (listaControle.isEmpty()){
                        System.out.println("Ainda nao foi adicionado o volume e o canal");
                    }else {
                        for (int dadosvolCan : listaControle){
                            System.out.println("1° valor: volume / 2° valor: canal " +  dadosvolCan);
                        }
                    }
                    break;
                case 8:
                    System.out.println("O programa foi encerrado.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }
    }
}
