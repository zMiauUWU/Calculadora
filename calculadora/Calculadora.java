package calculadora;

public class Calculadora {

    private double resultado;
    private char op;
    private double[] array;

    Calculadora(double[] array, char op) {
        this.array = array;
        this.op = op;

        switch (this.op) {

            case '+':
                System.out.println("A operação é soma!");
                Soma();
                break;

            case '-':
                System.out.println("A operação é subtração!");
                Sub();
                break;

            case '*':
                System.out.println("A operação é multiplicação!");
                Multi();
                break;

            case '/':
                System.out.println("A operação é Divisão");
                Div();
                break;

            default:
                System.out.println("Não foi possivel realizar operação!");
                break;

        }
    }

    private void Soma() {
        for (int i = 0; i < this.array.length; i++) {
            this.resultado += this.array[i];
        }
    }

    private void Sub() {

        for (int i = 0; i < this.array.length; i++) {
            this.resultado -= this.array[i];
        }
    }

    private void Multi() {
        this.resultado = 1;
        for (int i = 0; i < this.array.length; i++) {
            this.resultado *= this.array[i];
        }
    }

    private void Div() {
        boolean flag = true;
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] != 0 && flag == true) {
                this.resultado = array[0];
                flag = false;
            } else {
                continue;
            }
            if (this.array[i] == 0)
                ;
            else
                this.resultado = this.resultado / array[i];

        }

    }

    public double GetResultado() {
        return this.resultado;
    }

}