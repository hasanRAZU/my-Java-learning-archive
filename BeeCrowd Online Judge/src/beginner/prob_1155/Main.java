package beginner.prob_1155;

public class Main {
    public static void main(String[] args) {

        double d = 0;
        for(int i = 1; i <= 100; i++){
            d += (double) 1/i;
        }
        System.out.printf("%.2f\n", d);

    }
}
