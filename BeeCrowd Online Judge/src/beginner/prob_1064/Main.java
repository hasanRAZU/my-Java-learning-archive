package beginner.prob_1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        float sum = 0;
        for(int i = 0; i < 6; i++){
            float f = scanner.nextFloat();
            if(f > 0) {
                count++;
                sum+=f;
            }
        }
        System.out.println(count +" valores positivos" );
        System.out.printf("%.1f\n", sum / count);
    }
}
