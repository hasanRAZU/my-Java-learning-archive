package beginner.prob_1160__CalculationError;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int testCase = scanner.nextInt();
        if(testCase < 1 || testCase > 3000) return;

        for(int i = 1; i <= testCase; i++){

            long currentPopulationOfA = 0;
            long currentPopulationOfB = 0;

            String[] readLine = bufferedReader.readLine().split(" ");

            long popOfCityA = Long.parseLong(readLine[0]);
            long popOfCityB = Long.parseLong(readLine[1]);

            double growthRateOfCityA = Double.parseDouble(readLine[2]);
            double growthRateOfCityB = Double.parseDouble(readLine[3]);

            if(popOfCityA < 100 || popOfCityA >= 1000000 || popOfCityB < 100 || popOfCityB > 1000000 || popOfCityA >= popOfCityB) return;
            if(growthRateOfCityA < 0.1 || growthRateOfCityA > 10.0 || growthRateOfCityB < 0.0 || growthRateOfCityB > 10.0 || growthRateOfCityA <= growthRateOfCityB) return;



            currentPopulationOfA = popOfCityA;
            currentPopulationOfB = popOfCityB;

            for(int j = 1; j <= 101; j++){

                currentPopulationOfA += (long)(currentPopulationOfA*growthRateOfCityA/100);
                currentPopulationOfB += (long)(currentPopulationOfB*growthRateOfCityB/100);



                System.out.println("popA: " + currentPopulationOfA +"\nPopB: " + currentPopulationOfB +"\n");


                if(currentPopulationOfA > currentPopulationOfB){
                    System.out.println("\nGreater");
                    System.out.println(j + " anos.");
                    return;
                }



                if(currentPopulationOfA == currentPopulationOfB){
                    System.out.println(j + " anos.");
                    break;
                }

                if(j == 101){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
        }
    }
}
