package Faccat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class completo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EXERCÍCIOS DE LÓGICA =====");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercìcio 3");
        System.out.println("4 - Exercìcio 4");
        System.out.println("5 - Exercìcio 5");
        System.out.println("13 - Exercìcio 13");
        System.out.println("14 - Exercìcio 14");
        System.out.println("0 - Sair");

        System.out.print("Escolha um exercício: ");
        int opcao = scanner.nextInt();

        switch (opcao) {

            case 1:
                exercicio1();
                break;

            case 2:
                exercicio2();
                break;

            case 3:
                exercicio3();
                break;

            case 4:
                exercicio4();
                break;

            case 5:
                exercicio5();
                break;

            case 13:
                exercicio13();
                break;
            case 14:
                exercicio14();
                break;


            case 0:
                System.out.println("Programa encerrado.");
                break;

            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void exercicio1() {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("O valor de A é = " + a);
        System.out.println("O valor de B é " + b);
    }

    public static void exercicio2() {
        Scanner Ex2 = new Scanner(System.in);
        System.out.println("Digite um numero para saber o seu antecessor e sucessor.");
         int numeroInteiro = Integer.parseInt(Ex2.next());

        int antecessor = numeroInteiro - 1;
        int sucessor = numeroInteiro + 1;
        System.out.println("O antecessor do numero " + numeroInteiro + " é " + antecessor + " e seu sucessor é "+ sucessor);
        Ex2.close();
    }

    public static void exercicio3(){
        Scanner Ex3 = new Scanner(System.in);
        System.out.println("Descubra a área de um retangulo");
        System.out.println("Digite a base do seu retangulo");
        double numeroBase = Double.parseDouble(Ex3.next());
        System.out.println("Agora digite a altura do retangulo");
        double numeroAltura = Double.parseDouble(Ex3.next());
        double Area = numeroBase * numeroAltura;
        System.out.println("a area do do retangulo que com as informaçoes que você digitou é "+ Area +(" unidades"));


    }

    public static void exercicio4(){
        Scanner Ex4 = new Scanner(System.in);
        System.out.println("descubra sua idade em dias.");
        System.out.println("Digite quantos anos você tem.");
        byte anos = Ex4.nextByte();
        System.out.println("Digite quantos meses se passaram deste seu ultimo anivesario.");
        byte meses = Ex4.nextByte();
        System.out.println("Digite quantos dias se passaram deste seu ultimo anivesario.");
        short dias = Ex4.nextShort();
        short idadeEmDias = (short) ((anos * 365) + (meses * 30) + dias);
        System.out.println("Sua idade em dias é : " + idadeEmDias + " dias");


    }
    public static void exercicio5(){
        Scanner Ex5 = new Scanner(System.in);
        System.out.println("Total eleitoral");
        System.out.println("Digite o numero de total de eleitores:");
        int totalEleitores = Ex5.nextInt();
        System.out.println("Digite o numero de votos validos");
        int totalValido = Ex5.nextInt();
        System.out.println("Digite o numero de votos Nulos");
        int totalNulo = Ex5.nextInt();
        System.out.println("Digite o numero de votos Brancos");
        int totalBranco = Ex5.nextInt();

        double percentualBranco = (double) (totalBranco * 100) /totalEleitores;
        double percentualNulo = (double) (totalNulo * 100) /totalEleitores;
        double percentualvalido = (double) (totalValido * 100) /totalEleitores;

        System.out.println("o total de eleitores é :"+totalEleitores);
        System.out.println("Percentual de votos Valido é :"+percentualvalido+"%");
        System.out.println("Percentual de votos Branco é :"+percentualBranco+"%");
        System.out.println("Percentual de votos Nulo é :"+percentualNulo+"%");
    }

    public static void exercicio13 (){
        Scanner Ex13 = new Scanner(System.in);
        System.out.println("Saiba sua media escolar.");
        System.out.println("Digite a Primeira nota: ");
        double primeiraNota = Ex13.nextDouble();
        System.out.println("Digite sua segunda nota");
        double segundaNota = Ex13.nextDouble();
        System.out.println("Digite sua terceira nota");
        double terceiraNota = Ex13.nextDouble();
        double media =(primeiraNota*2 + segundaNota*3 + terceiraNota*5) /10;
        System.out.println("As notas "+ primeiraNota + ","+segundaNota +" e "+terceiraNota+" tem a media de "+media);

    }
    public static void exercicio14(){
        Scanner Ex14 = new Scanner(System.in);
        System.out.println("verificador de numero maior ou menor que de 10");
        System.out.println("digite um numero para a verificação. Atenção apenas numeros inteiros");
        int numeroDigitado = Ex14.nextInt();

        if(numeroDigitado > 10){
            System.out.println("É maior que de 10");
        }else if (numeroDigitado < 10) {
            System.out.println("É menor que 10);");
        }else if (numeroDigitado == 10) {
            System.out.println("O numero é 10");
        } 
    }

}