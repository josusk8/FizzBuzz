public class FizzBuzz {
    int[] numeros;

    public FizzBuzz() {
        numeros = new int[100];
    }

    public void mostrar() {

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;

            if (i % 3 == 0) {
                if(i%5 == 0){
                    System.out.println("FizzBuzz");
                }
                else {
                    System.out.println("Fizz");
                }
            }
            if (i % 5 == 0){

                System.out.println("Buzz");
            }
            else{
                System.out.println(numeros[i]);
            }

        }

    }

}
