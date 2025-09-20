package beginner.prob_1174;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arraySize = 100;
        double[] array = new double[100];
        for (int i = 0; i < arraySize; i++){
            array[i] = scanner.nextDouble();
        }

        for (int i = 0; i < arraySize; i++){
            if(array[i] <= 10) {
                System.out.print("A[" + i + "] = ");
                System.out.printf("%.1f\n", array[i]);
            }

        }

    }
}
