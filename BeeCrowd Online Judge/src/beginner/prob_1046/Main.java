package beginner.prob_1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strArray = string.split(" ");

        int startingTime = Integer.parseInt(strArray[0]);
        int endingTime = Integer.parseInt(strArray[1]);

        int gameTime = 0;

        if(endingTime == startingTime){
            System.out.println("O JOGO DUROU " + (24) + " HORA(S)");

        }else if(endingTime < startingTime){
            System.out.println("O JOGO DUROU " +  (24 + endingTime - startingTime) + " HORA(S)");
        }
        else System.out.println("O JOGO DUROU " + (endingTime-startingTime) + " HORA(S)");

    }
}
