import static java.lang.Integer.*;

public class FizzBuzz {

    public FizzBuzz() {

    }

    static void mostrar() {

        int numero = 1;

        while (numero <= 100) {
            int entrada = 1000;

            if (numero % 5 == 0 && numero % 3 == 0) {
                System.out.println("FizzBuzz");
                entrada = numero;
                numero++;
            }
            if (entrada > numero && numero % 5 == 0) {
                System.out.println("Buzz");
                entrada = numero;
                numero++;
            }
            if (entrada > numero && numero % 3 == 0) {
                System.out.println("Fizz");
                entrada = numero;
                numero++;
            }
            if (entrada > numero) {
                System.out.println(numero);
                numero++;
            }

        }
        
    }
}


