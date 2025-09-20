package beginner.prob_1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String line = bufferedReader.readLine();
        String[] numbers =  line.split(" ");

        float[] unsortedFloats = new float[numbers.length];
        int index = 0;
        for (String number : numbers){
            unsortedFloats[index] = Float.parseFloat(number);
            index++;
        }

        if(unsortedFloats[0] + unsortedFloats[1] > unsortedFloats[2]  &&
                unsortedFloats[1] + unsortedFloats[2] > unsortedFloats[0]  &&
                unsortedFloats[2] + unsortedFloats[0] > unsortedFloats[1])
        {
            System.out.println("Perimetro = " + (unsortedFloats[0] + unsortedFloats[1] + unsortedFloats[2]));
        }else{
            System.out.println("Area = " + ((unsortedFloats[0] + unsortedFloats[1] ) * unsortedFloats[2] / 2));
        }


    }
}
