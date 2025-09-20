package beginner.prob_1175;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arraySize = 20;
        Integer[] arr = new Integer[arraySize];

        for (int i = 0; i < arraySize; i++){
            arr[i] = scanner.nextInt();
        }
        //reverseMethod1(arr, arraySize);
        reverseMethod2(arr, arraySize);

    }

    static void reverseMethod1(Integer[] arr, int arrSize){
        List<Integer> arrayList = Arrays.asList(arr);

        Collections.reverse(arrayList);

        for(int i = 0; i < arrSize; i++){
            arr[i] = arrayList.get(i);
            System.out.println("N[" + i +"] = " + arr[i]);
        }
    }

    static void reverseMethod2(Integer[] arr, int arrSize){
        for (int i = 0; i < arrSize/2; i++) {
            Integer value1 = arr[i];
            Integer value2 = arr[arrSize-1 - i];

            arr[i] = value2;
            arr[arrSize-1-i] = value1;
        }

        for (int i = 0; i < arrSize; i++){
            System.out.println("N[" + i +"] = " + arr[i]);
        }
    }
}
