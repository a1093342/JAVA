import java.util.*;

public class A1093342_0224_1 {
    public static void main(String [] argv){
       int userInput;

       System.out.print("Please input any number: ");
       Scanner isScan = new Scanner(System.in);
       userInput = isScan.nextInt();

       
       System.out.println(userInput % 2 == 0 ? "Your number is an even number" : "Your number is an odd number");

    }
}
