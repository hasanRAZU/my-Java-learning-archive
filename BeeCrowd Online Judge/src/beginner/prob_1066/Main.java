package beginner.prob_1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddCount = 0, evenCount = 0, positiveCount = 0, negativeCount = 0;

        for(int i = 0; i < 5; i++){
            int number = scanner.nextInt();
            if(number % 2 == 0 )evenCount++;
            else oddCount++;


            if (number > 0) positiveCount++;
            else if(number < 0) negativeCount++;
        }

        System.out.println(evenCount + " valor(es) par(es)");
        System.out.println(oddCount + " valor(es) impar(es)");
        System.out.println(positiveCount +" valor(es) positivo(s)");
        System.out.println(negativeCount + " valor(es) negativo(s)");

    }
}
