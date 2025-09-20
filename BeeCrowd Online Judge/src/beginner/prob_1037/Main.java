package beginner.prob_1037;

/*You must make a program that read a float-point number and print a message saying in which of following intervals
the number belongs: [0,25] (25,50], (50,75], (75,100]. If the read number is less than zero or greather than 100,
the program must print the message “Fora de intervalo” that means "Out of Interval".*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();

        if(f < 0.0f || f > 100.0f) System.out.println("Fora de intervalo");
        else if (f >= 0.0f && f <= 25.0f) System.out.println("Intervalo [0,25]");
        else if (f > 25.0f && f <= 50.0f) System.out.println("Intervalo (25,50]");
        else if (f > 50.0f && f <= 75.0f) System.out.println("Intervalo (50,75]");
        else System.out.println("Intervalo (75,100]");
    }
}