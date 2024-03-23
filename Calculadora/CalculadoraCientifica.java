public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(int[] array, char op) {
        super(array, op);
    }

    public CalculadoraCientifica() {
        super(new int[] {}, ' ');
    }

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public double logaritimo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }
}
