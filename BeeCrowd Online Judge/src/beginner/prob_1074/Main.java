package beginner.prob_1074;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n < 10000){
            List<String> answerList = new ArrayList<>();

            for(int i = 1; i <= n; i++){
                int x = scanner.nextInt();

                if(x > -10000000 && x < 10000000){
                    if(x % 2 == 0 && x > 0) answerList.add("EVEN POSITIVE");
                    else if (x % 2 == 1 && x > 0) answerList.add("ODD POSITIVE");
                    else if(x % 2 == -1 ) answerList.add("ODD NEGATIVE");
                    else if( x == 0) answerList.add("NULL");
                    else answerList.add("EVEN NEGATIVE");
                }
            }
            for(String str : answerList) {
                System.out.println(str);
            }
        }

    }
}