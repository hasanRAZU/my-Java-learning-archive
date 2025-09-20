package beginner.prob_1047;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strArray = string.split(" ");

        int startingHour = Integer.parseInt(strArray[0]);
        int startingMinute = Integer.parseInt(strArray[1]);

        int endingHour = Integer.parseInt(strArray[2]);
        int endingMinute = Integer.parseInt(strArray[3]);


        int gameMinute, gameHour;

        if(startingHour == endingHour){
            if(startingMinute == endingMinute){
                gameHour = 24;
                gameMinute = 0;
            }
            else if(startingMinute < endingMinute){
                gameHour = 0;
                gameMinute = endingMinute - startingMinute;
            }
            else {
                gameHour = 23;
                gameMinute = 60 - startingMinute + endingMinute;
            }

        }



        else if(startingHour < endingHour) {
            if(startingMinute == endingMinute){
                gameHour = endingHour - startingHour;
                gameMinute = 0;
            }
            else if(startingMinute < endingMinute){
                gameHour = endingHour - startingHour;
                gameMinute = endingMinute - startingMinute;
            }
            else {
                gameHour = endingHour - startingHour - 1;
                gameMinute = 60 - startingMinute + endingMinute;
            }

        }

        else {

            if(startingMinute == endingMinute){
                gameHour = endingHour + 24 - startingHour;
                gameMinute = 0;
            }
            else if(startingMinute < endingMinute){
                gameHour = endingHour + 24 - startingHour;
                gameMinute = endingMinute - startingMinute;
            }
            else {
                gameHour = endingHour + 24 - startingHour - 1;
                gameMinute = 60 - startingMinute + endingMinute;
            }

        }
        System.out.println("O JOGO DUROU " + gameHour +" HORA(S) E " + gameMinute +" MINUTO(S)");


    }
}
