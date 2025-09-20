package beginner.prob_1179;

import java.util.Scanner;

public class Main {

    static int countPar = 0;
    static int countImpar = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] par = new long[5];       // array of even numbers
        long[] impar = new long[5];     // array of odd numbers

        for(int i = 0; i < 15; i++){
            long currentNumber = scanner.nextLong();

            if(currentNumber %2 == 0) {
                par[countPar] = currentNumber;
                countPar++;
            }
            else {
                impar[countImpar] = currentNumber;
                countImpar++;
            }

            if(countPar == 5) {
                printArray("par", par, countPar);
                countPar = 0;

            }
            if(countImpar == 5) {
                printArray("impar", impar, countImpar);
                countImpar = 0;

            }
        }

        if(countImpar > 0 && countImpar <= 5) printArray("impar", impar, countImpar);
        if(countPar > 0 && countPar <= 5 ) printArray("par", par, countPar);

    }

    static void printArray(String par_impar, long[] arr, int loop){
        for(int i = 0; i < loop; i++){
            System.out.println(par_impar +"[" + i +"] = " + arr[i]);
        }
    }
}
