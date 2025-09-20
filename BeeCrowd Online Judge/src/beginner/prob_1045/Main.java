package beginner.prob_1045;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strArray = bufferedReader.readLine().split(" ");
        Double[] doubles = new Double[strArray.length];

        int index = 0;
        for (String str : strArray){
            doubles[index++] = Double.parseDouble(str);
        }

        Arrays.sort(doubles, Collections.reverseOrder());

        if(doubles[0] >= doubles[1] + doubles[2]) {
            System.out.println("NAO FORMA TRIANGULO");
            System.exit(0);
        }



        if(doubles[0]*doubles[0] == doubles[1]*doubles[1] + doubles[2]*doubles[2]) System.out.println("TRIANGULO RETANGULO");

        if(doubles[0]*doubles[0] > doubles[1]*doubles[1] + doubles[2]*doubles[2]) System.out.println("TRIANGULO OBTUSANGULO");

        if(doubles[0]*doubles[0] < doubles[1]*doubles[1] + doubles[2]*doubles[2]) System.out.println("TRIANGULO ACUTANGULO");

        if(doubles[0].equals(doubles[1]) && doubles[1].equals(doubles[2])) System.out.println("TRIANGULO EQUILATERO");

        if(doubles[0].equals(doubles[1]) && !doubles[0].equals(doubles[2]) ||
                doubles[0].equals(doubles[2]) && !doubles[0].equals(doubles[1]) ||
                doubles[1].equals(doubles[2]) && !doubles[1].equals(doubles[0]))
            System.out.println("TRIANGULO ISOSCELES");

    }

}
