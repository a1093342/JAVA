import java.util.*;

public class A1093342_0224_2 {
    public static void main(String[] argv){
        int  isCel;
        double isFah, isCon;

        System.out.print("Please input the number of the temperature in Celsius that you wish to change into Fahrenheit: ");
        Scanner isScanner = new Scanner(System.in);
        isCel = isScanner.nextInt();

        isCon = isCel;
        isFah = isCon * 9/5+32;
        System.out.println(isCel +" degree Celsius is " + isFah + " degree Fahrenheit.");

    }
}
