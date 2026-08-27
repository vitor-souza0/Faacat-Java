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


    }

}
