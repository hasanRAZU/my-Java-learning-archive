package beginner.prob_1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        switch (firstWord){
            case "vertebrado" : {
                switch (secondWord){
                    case "ave" :{
                        switch (thirdWord){
                            case "carnivoro" : {
                                System.out.println("aguia");
                                break;
                            }
                            case "onivoro" : {
                                System.out.println("pomba");
                                break;
                            }
                        }
                        break;
                    }
                    case "mamifero" : {
                        switch (thirdWord) {
                            case "onivoro" :{
                                System.out.println("homem");
                                break;
                            }
                            case "herbivoro":{
                                System.out.println("vaca");
                                break;
                            }
                        }
                        break;

                    }
                }
                break;

            }






            case "invertebrado" : {
                switch (secondWord){
                    case "inseto":{
                        switch (thirdWord){
                            case "hematofago":{
                                System.out.println("pulga");
                                break;
                            }
                            case "herbivoro": {
                                System.out.println("lagarta");
                                break;
                            }
                        }
                        break;
                    }
                    case "anelideo": {
                        switch (thirdWord){
                            case "hematofago" :{
                                System.out.println("sanguessuga");
                                break;
                            }
                            case "onivoro" :{
                                System.out.println("minhoca");
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }

        }
    }
}
