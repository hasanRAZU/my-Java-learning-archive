package beginner.prob_1118;

import java.util.Scanner;

public class Main {
    static int flag = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] validValue = new double[2];


        while(true){
            double d = scanner.nextDouble();
            if(d >= 0.0 && d <= 10.0){


                if(flag == 0){              // Store first valid value
                    validValue[0] = d;
                    flag = 1;
                }else {                     // Store Second valid value
                    validValue[1] = d;
                    flag = 0;
                    printResult(validValue[0], validValue[1]);      // Print Median and ask for Fresh Start

                    // Check Continuity
                    while(true) {
                        int i = scanner.nextInt();
                        if (i == 1) break;
                        else if (i == 2) return;
                        else System.out.println("novo calculo (1-sim 2-nao)");
                    }
                }
            }else System.out.println("nota invalida");
        }
    }


    static void printResult(double num1, double num2){
        double avg = (num1 + num2 ) / 2;
        System.out.printf("media = %.2f\n", avg);
        System.out.println("novo calculo (1-sim 2-nao)");
    }
}
