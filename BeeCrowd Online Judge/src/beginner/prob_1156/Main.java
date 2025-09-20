package beginner.prob_1156;

public class Main {
    public static void main(String[] args) {

        double d = 0;
        int j = 1;


        for(int i = 1; i <= 39; i+=2) {
             if( i > 1) j *= 2;
             d += (double) i /j;
        }

        System.out.printf("%.2f\n", d);
    }
}


