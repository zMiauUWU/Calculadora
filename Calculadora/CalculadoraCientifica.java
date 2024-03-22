public class CalculadoraCientifica extends Calculadora {

    public duble potencia(double basa, double expoente) {
        return Math.pow(base, expoente);
    }

    public double potencia(int exp) {
        double valor = Math.pow(super.numeros.get(0), exp);

        for (int i = 1; i < super.numeros.size(); i++) {

            valor = valor + Math.pow(super.numeros.get(i), exp);

        }
        return valor;
    }

    public double raizQuadrada(double numeros) {
        return Math.sqrt(numeros);
    }

    public double logaritimo(double numero, double base) {
        return Math.log(numero) / Math.log(base);
    }

}
