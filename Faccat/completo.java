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
        System.out.println("6 - Exercìcio 6");
        System.out.println("7 - Exercìcio 7");
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

            case 6:
                exercicio6();
                break;

            case 7:
                exercicio7();
                break;

            case 8:
                exercicio8();
                break;

            case 9:
                exercicio9();
                break;

            case 10:
                exercicio10();
                break;

            case 11:
                exercicio11();
                break;

            case 12:
                exercicio12();
                break;

            case 13:
                exercicio13();
                break;

            case 14:
                exercicio14();
                break;
            case 15:
                exercicio15();
                break;
            case 16:
                exercicio16();
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

    public static void exercicio6(){
        Scanner Ex6 = new Scanner(System.in);
        System.out.println("digite seu salário: ");
        double salario = Ex6.nextDouble();
        System.out.println("Digite o reajuste salarial atual: ");
        double reajuste = Ex6.nextDouble();
        double novoSalario = salario + (salario * reajuste /100);
        System.out.println("Seu novo salário é de R$"+ novoSalario);
    }

    public static void exercicio7(){
        Scanner Ex7 = new Scanner(System.in);
        System.out.println("Descubra o custo final de um carro");
        System.out.println("Lembrando que o distribuidor aumenta em o preço em 28% do valor de fabricação mais de 45% impostos");
        System.out.println("Custo de fabrica: ");
        double custoFabrica = Ex7.nextDouble();
         double distribuidor = custoFabrica * 28 / 100;
         double impostos = custoFabrica * 45/ 100;
         double custoFinal = custoFabrica + distribuidor + impostos;
        System.out.println("O custo final será de: R$ "+ custoFinal);
    }

    public static void exercicio8(){
        Scanner Ex8 = new Scanner(System.in);
        System.out.println("== Salario de um vendendor de carros ==");
        System.out.println("Digite seu salário fixo: ");
        double salarioFixo = Ex8.nextDouble();
        System.out.println("Digite a quantidade de carros vendidos: ");
        int quantidadeDeCarros = Ex8.nextInt();
        System.out.println("Digite o valor totais das vendas do mes: ");
        double valorTotalVendas = Ex8.nextDouble();
        System.out.println("Digite a comisão por carro vendido: ");
        double comisaoPorCarro = Ex8.nextDouble();
        double comisaoCarro = quantidadeDeCarros * comisaoPorCarro;
        double comisaoVenda = valorTotalVendas * 5 / 100;
        double salarioFinal = salarioFixo + comisaoCarro + comisaoVenda;
        System.out.println("o Salario desse vendedor deve ser de R$"+ salarioFinal);
    }

    public static void exercicio9(){
        Scanner Ex9 = new Scanner(System.in);
        System.out.println("Conversão de Celsius para Fahrenheit");
        System.out.println("Digite seu temperatura em Celsius: ");
        double temperatura = Ex9.nextDouble();
        double farenheit = (temperatura * 1.8) + 32;
        System.out.println("A tenperadura "+ temperatura+"ºC en farenheit è "+farenheit+"ºF");
    }

    public static void exercicio10 (){
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

    public static void exercicio11(){
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

    public static void exercicio12() {
        Scanner Ex12 = new Scanner(System.in);
        System.out.println("descubra se um numero é positivo ou negativo");
        System.out.println("Digite um numero inteiro");
        int numeroDigitado = Ex12.nextInt();
        if (numeroDigitado % 2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse número é impar");
        }
    }

    public static void exercicio13(){
        Scanner Ex13 = new Scanner(System.in);
        System.out.println("Descubra se o numero é positivo ou não");
        System.out.println("Digite um numero inteiro");
        int numeroDigitado = Ex13.nextInt();
        if (numeroDigitado < 0){
            System.out.println("Esse numero é negativo");
        }else if (numeroDigitado >= 0 ){
            System.out.println("esse numero é Positivo");
        }
    }

    public static void exercicio14(){
        Scanner Ex14 = new Scanner(System.in);
        System.out.println("Calculo de uma Promoção");
        System.out.println("Preço:\nMaça: R$1.20 \nPROMOÇÃO RELANPAGO \nNa compra de pelo menos 12 unidades desse produto cada undade custara 20% a menos");
        System.out.println("digite a quantidade de maças que deseja comprar");
        int quantidade = Ex14.nextInt();
        if (quantidade >=12){
            double preco = 1.0;
            double soma = quantidade*preco;
            System.out.println("o valor a ser pago será de R$"+soma);
        }else{
            double preco = 1.20;
            double soma = quantidade*preco;
            System.out.println("O valor a ser pago será de R$"+soma);
        }
    }

    public static void exercicio15() {
        Scanner Ex15 = new Scanner(System.in);
        System.out.println("Digite a primeira nota :");
        short primeiraNota = Ex15.nextShort();
        System.out.println("Digite sua segunda nota");
        short segundaNota = Ex15.nextShort();
        int media = (primeiraNota+segundaNota)/2;
        if (media < 6){
            System.out.println("voce não foi aprovado, você teve a media de "+media);
        }else{
            System.out.println("voce foi aprovado coma media de "+media);
        }

    }
    
    public static void exercicio16() {
        Scanner Ex16 = new Scanner(System.in);
        System.out.println("saiba se podera votar");
        System.out.println("Digite o ano atual");
        int anoAtual = Ex16.nextInt();
        System.out.println("Digite o ano de seu nascimento");
        int anoNascimento = Ex16.nextInt();
        int soma =  anoAtual-anoNascimento;
        if (soma >= 18){
            System.out.println("você poderá votar.");
        } else if (soma >= 16 && soma < 18) {
            System.out.println("voto Opcional");
        }else{
            System.out.println("não podera votar");
        }
    }




}