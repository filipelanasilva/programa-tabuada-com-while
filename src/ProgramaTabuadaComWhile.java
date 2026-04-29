
import java.util.Scanner;

public class ProgramaTabuadaComWhile {

    public static void main(String[] args) {

        tabuada();
        menuContinuarSair();

    }






    public static void tabuada() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada de 1 à 10: ");
        int primeiroOperando = scanner.nextInt();

        System.out.print("Agora digite o tipo de operação da tabuada: ");
        String operacao = scanner.next();

        do {

            if ((operacao.equals("*") || operacao.equals("/")) || (operacao.equals("+") || operacao.equals("-"))) {
                break;
            } else {
                System.out.print("Tipo de operação (%s) inválida! Digite novamente: ");
                operacao = scanner.next();
            }

        } while (true);



        int segundoOperando = 1;

        switch (operacao) {

            case "*":
                System.out.printf("\nTABUADA DE MULTIPLICAÇÃO DO NÚMERO %d:\n\n", primeiroOperando);
                break;

            case "/":
                System.out.printf("\nTABUADA DE DIVISÃO DO NÚMERO %d:\n\n", primeiroOperando);
                break;

            case "+":
                System.out.printf("\nTABUADA DE ADIÇÃO DO NÚMERO %d:\n\n", primeiroOperando);
                break;

            case "-":
                System.out.printf("\nTABUADA DE SUBTRAÇÃO DO NÚMERO %d:\n\n", primeiroOperando);
                break;

        }

        while (segundoOperando <= 10) {

            switch (operacao) {

                case "*":
                    System.out.printf("%d x %d = %d\n", primeiroOperando, segundoOperando, primeiroOperando * segundoOperando);
                    segundoOperando++;
                    break;

                case "/":
                    System.out.printf("%d ÷ %d = %d\n", primeiroOperando, segundoOperando, primeiroOperando / segundoOperando);
                    segundoOperando++;
                    break;

                case "+":
                    System.out.printf("%d + %d = %d\n", primeiroOperando, segundoOperando, primeiroOperando + segundoOperando);
                    segundoOperando++;
                    break;

                case "-":
                    System.out.printf("%d - %d = %d\n", primeiroOperando, segundoOperando, primeiroOperando - segundoOperando);
                    segundoOperando++;
                    break;

            }




        }

        System.out.println();

    }

    public static void menuContinuarSair() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Caso deseje continuar digite (1) do contrário digite (2) para sair: ");
        int resposta = scanner.nextInt();

        do {

            if (!(resposta == 1 || resposta == 2)) {

                System.out.print("Número digitado inválido! Digite novamente: ");
                resposta = scanner.nextInt();

            } else if (resposta == 1) {

                palavraFraseDoUsuario();
                break;

            } else {

                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");
                scanner.close();
                break;

            }

        } while (true);



    }

    public static void palavraFraseDoUsuario() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou uma frase a seguir: ");
        String palavraFraseDigitada = scanner.next();

        scanner.close();

        System.out.println(palavraFraseDigitada);

    }

}
