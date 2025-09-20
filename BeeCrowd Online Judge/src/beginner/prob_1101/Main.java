package beginner.prob_1101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){

            String[] strArray = bufferedReader.readLine().split(" ");
            int num1 = Integer.parseInt(strArray[0]);
            int num2 = Integer.parseInt(strArray[1]);

            if(num1 <= 0 || num2 <= 0){
                break;
            }

            if(num1 < num2) Main.printNumberAndSum(num1, num2);
            else Main.printNumberAndSum(num2, num1);
        }
    }


    static void printNumberAndSum(int num1, int num2){
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            System.out.print(i +" ");
            sum+= i;
        }
        System.out.println("Sum=" + sum);
    }
}
