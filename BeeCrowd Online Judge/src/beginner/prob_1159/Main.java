package beginner.prob_1159;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            int x =scanner.nextInt();
            int sum = 0;

            if(x == 0) return;
            if(x % 2 != 0) x+=1;

            for(int i = 1; i <= 5; i++){

                sum+= x;
                x+=2;

            }

            System.out.println(sum);
        }


    }
}
