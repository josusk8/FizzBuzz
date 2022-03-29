
public class FizzBuzz {


    static void mostrar() {
        String numeros = "";
        String mensaje = "";
        boolean validador;
        boolean bloqueo;
        String[] codigos = {"Fizz", "Buzz", "FizzBuzz"};

        for (int i = 0; i < 100; i++) {
            validador = true;
            bloqueo = false;

            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                mensaje = codigos[2];
                numeros += mensaje + "\r\n";
                validador = false;
                bloqueo = true;
            }
            if ((i + 1) % 3 == 0 && bloqueo == false) {
                mensaje = codigos[0];
                numeros += mensaje + "\r\n";
                validador = false;
            }
            if ((i + 1) % 5 == 0 && bloqueo == false) {
                mensaje = codigos[1];
                numeros += mensaje + "\r\n";
                validador = false;
            }

            if (validador == true || bloqueo == true) {
                numeros += (i + 1) + "\r\n";
            }

        }
<<<<<<< Updated upstream
        System.out.println(numeros);
=======
>>>>>>> Stashed changes

    }
}

