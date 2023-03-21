import java.util.*;

public class A1093342_0317_1 {
    public static void main(String [] argv){
        Scanner isScan = new Scanner(System.in);
        System.out.print("Please input n: ");
        int n = isScan.nextInt();

        System.out.print("Please input m: ");
        int m = isScan.nextInt();

        int[][] isArray = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               isArray[i][j]=(i+1)*(j+1);
               
            }
        }
        for(int[] array : isArray){
            for(int value : array){
                System.out.print(value+" ");

            }
            System.out.println();
        }
    }
}
