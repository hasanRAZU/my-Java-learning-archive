package beginner.prob_1098;

public class Main {
    public static void main(String[] args) {

        double i = 0;
        double increment = 0.2f;
        while(true){

                String[] convertToString = String.valueOf(i).split("\\.");
                char c = convertToString[1].charAt(0);
                if(c == '0'){
                    printForInteger((int) i);
                } else{
                    printForDouble(i);
                }

                i+= 0.2f;


                if(i>2.1) break;
        }
    }

    static void printForInteger(int i){
        for(int k = 1; k <= 3; k++){
            System.out.println("I=" + i +" J=" + (i + k) );
        }
    }

    static void printForDouble(double i){
        for(int k = 1; k <= 3; k++){
            System.out.printf("I=%.1f J=%.1f\n", i, (i + k));
        }
    }
}
