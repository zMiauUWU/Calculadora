public class Calculadora {

    private float resultado;
    private char op;
    private int[] array;

    Calculadora(int[] array, char op) {
        this.array = array;
        this.op = op;
        if (this.op == '+') {
            System.out.println("A operação é soma!");
            Soma();

        } else if (this.op == '-') {
            System.out.println("A operação é subtração!");
            Subtração();

        } else if (this.op == '*') {
            System.out.println("A operação é multiplicação!");
            Multiplicação();
        } else if (this.op == '/') {
            System.out.println("A operação é Divisão");
            Divisão();
        }

        System.out.println(this.op);

    }

    private void Soma() {
        for (int i = 0; i < this.array.length; i++) {
            this.resultado += this.array[i];
        }
    }

    private void Subtração() {
        for (int i = 0; i < this.array.length; i++) {
            if (i == 0) {
                this.resultado = this.array[i];
            } else {
                this.resultado -= this.array[i];
            }
        }
    }

    private void Multiplicação() {
        this.resultado = this.array[0];
        for (int i = 1; i < this.array.length; i++) {
            this.resultado *= this.array[i];
        }
    }

    private void Divisão() {
        this.resultado = this.array[0];
        for (int i = 1; i < this.array.length; i++) {
            this.resultado /= this.array[i];
        }
    }

    public Float GetResultado() {
        return this.resultado;
    }

}
