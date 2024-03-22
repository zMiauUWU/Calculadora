package calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste - Calculadora");

        int[] array = { 1, 2, 3, 4 };

        Calculadora c = new Calculadora(array, '+');
        System.out.println(c.GetResultado());

        Calculadora c1 = new Calculadora(array, '-');
        System.out.println(c1.GetResultado());

        Calculadora c2 = new Calculadora(array, '*');
        System.out.println(c2.GetResultado());

        Calculadora c3 = new Calculadora(array, '/');
        System.out.println(c3.GetResultado());
    }
}