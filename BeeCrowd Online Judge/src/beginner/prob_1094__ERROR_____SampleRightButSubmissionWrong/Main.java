package beginner.prob_1094__ERROR_____SampleRightButSubmissionWrong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        // Create List and put default value
        Map<String, Integer> listMap = new HashMap<>();

        int testCase = scanner.nextInt();
        if(testCase > 15 || testCase < 1) return;

        // Iterate till the testcase and update value to the hashmap
        for (int i = 0; i < testCase; i ++){
            boolean flag = false;
            String[] inputLine = bufferedReader.readLine().split(" ");

            if(inputLine[1].equals("C")) inputLine[1] = "coelhos";
            else if(inputLine[1].equals("R")) inputLine[1] = "ratos";
            else inputLine[1] = "sapos";

            if(! listMap.isEmpty()){
                for(String str : listMap.keySet()){
                    if(str.equals(inputLine[1])){
                        Integer currentValue = listMap.get(str);
                        currentValue+= Integer.parseInt(inputLine[0]);
                        listMap.put(str, currentValue);
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag) listMap.put(inputLine[1], Integer.valueOf(inputLine[0]));

        }



        // Count total number of animal
        Integer totalAnimal = 0;
        for (String str : listMap.keySet()) {
            totalAnimal += listMap.get(str);
        }


        // Print the Output
        System.out.println("Total: " + totalAnimal +" cobaias");

        for (String str : listMap.keySet()){
            System.out.println("Total de " + str + ": " + listMap.get(str));
        }
        for (String str : listMap.keySet()) {
            double percentage = (100.0 * listMap.get(str) /totalAnimal);
            System.out.printf("Percentual de %s: %.2f %%\n", str, percentage);
        }
    }
}
