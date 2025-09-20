package chapter4_oopConcept.lecture3;

import java.security.MessageDigest;

class StudentAccount{
    private final int userId;
    private final String password;


    public StudentAccount(int userId, String password){
        this.userId = userId;
        this.password = encode(password);
    }

    private String encode(String password){

        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = digest.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(byte arr: bytes){
                sb.append(String.format("%02x", arr));
                sb2.append(arr);
            }
            System.out.println(bytes.length);
            System.out.println("Password: " + password);
            System.out.println("Without Formatting: " + sb2);
            System.out.println("With Formatting: " + sb);

            return sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }
    public String getAccountInfo(){
        return "User Id: " + this.userId +"\nPassword: " +this.password;
    }

}

public class PasswordEncodingTechnique {

    public static void main(String[] args) {
        StudentAccount studentAccount1 = new StudentAccount(01, "razu");
        //System.out.println(studentAccount1.getAccountInfo());
    }
}
