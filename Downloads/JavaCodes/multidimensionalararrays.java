import java.util.Arrays;
import java.util.*;
public class multidimensionalararrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows in array:");
        int row = sc.nextInt();

        System.out.println("Enter no of columns in array:");
        int column = sc.nextInt();

        int[][] a = new int[row][column];
        for(int i = 0;i<row;i++){
            for(int j=0;j<column;j++){
                a[i][j]=(i+1)*(j+1);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
