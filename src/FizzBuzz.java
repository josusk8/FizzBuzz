import static java.lang.Integer.*;

public class FizzBuzz {

    public FizzBuzz() {

    }

    public void mostrar() {
        for (int i = 0; i < 100; i++) {
            int[] imprimir = new int[100];

            imprimir[i] = i + 1;
            int fizzbuzzCompare = i;

            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                System.out.println("FizzBuzz");
                fizzbuzzCompare = -2;
                imprimir[i] = -1;
            }
            if ((fizzbuzzCompare + 1) % 3 == 0) {
                System.out.println("Fizz");
                imprimir[i] = -1;
            }
            if ((fizzbuzzCompare + 1) % 5 == 0) {
                System.out.println("Buzz");
                imprimir[i] = -1;
            }
            if (imprimir[i] > 0) {
                System.out.println(imprimir[i]);
            }


        }
    }
}

