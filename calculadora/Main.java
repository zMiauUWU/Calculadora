package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a calculadora");
        System.out.println("Por favor insira operador do calculo ");
        Scanner reader = new Scanner(System.in);
        char oper = reader.next().charAt(0);

        int size;
        Scanner input = new Scanner(System.in);
        System.out.println("insira o tamanho do array até 2");
        size = input.nextInt();
        double[] array = new double[size];

        System.out.println("Insira os elementos do array");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }

        Calculadora c = new Calculadora(array, oper);
        System.out.println("o resultado é: " + c.GetResultado());
        reader.close();
        input.close();

        System.out.println();

    }
}