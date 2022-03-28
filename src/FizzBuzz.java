import static java.lang.Integer.*;

public class FizzBuzz {

    public FizzBuzz() {

    }

    public void mostrar() {
        for (int i = 0; i < 100; i++) {
            int [] a = new int[100];

            a[i] = i+1;
            if ((i + 1) % 5 == 0 && (i + 1) % 3 == 0) {
                System.out.println("FizzBuzz");
                a[i]= -1;
            }
            if ((i + 1) % 3 == 0) {
                System.out.println("Fizz");
                a[i]= -1;
            }
            if ((i + 1) % 5 == 0) {
                System.out.println("Buzz");
                a[i]= -1;
            }
            if (a[i] >0){
                System.out.println(a[i]);
            }


        }
    }
}

