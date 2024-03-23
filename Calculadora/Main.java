import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println(
                "|Escolha sua operacao \n| Soma => + \n| Subtração => -\n| Multiplicação => x\n| Divisão => /\n");

        char operacao = scanner.next().charAt(0);

        int[] numeros = { (int) num1, (int) num2 };
        Calculadora calculadora = new Calculadora(numeros, operacao);

        float resultadoCalculadora = calculadora.GetResultado();

        switch (operacao) {
            case '+':
                System.out.println("Resultado da Soma: " + resultadoCalculadora);
                break;
            case '-':
                System.out.println("Resultado da Subtração: " + resultadoCalculadora);
                break;
            case '*':
                System.out.println("Resultado da Multiplicação: " + resultadoCalculadora);
                break;
            case '/':
                System.out.println("Resultado da Divisão: " + resultadoCalculadora);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        double potencia1 = calculadoraCientifica.potencia(num1, 2);
        System.out.println("Potência do primeiro número: " + potencia1);

        double potencia2 = calculadoraCientifica.potencia(num2, 2);
        System.out.println("Potência do segundo número: " + potencia2);

        double raizQuadrada1 = calculadoraCientifica.raizQuadrada(num1);
        System.out.println("Raiz Quadrada do primeiro número: " + raizQuadrada1);

        double raizQuadrada2 = calculadoraCientifica.raizQuadrada(num2);
        System.out.println("Raiz Quadrada do segundo número: " + raizQuadrada2);

        double logaritmo = calculadoraCientifica.logaritimo(num1, num2);
        System.out.println("Logaritmo do primeiro número na base do segundo número: " + logaritmo);

        scanner.close();
    }
}
