import java .util.Scanner;
import java.util.Arrays;
class TransposeMatrix{
    public static void transposematrix(int[][] array,int n,int m)
    {
       int temp=0;
       for(int i=0;i<m;i++)
       {
           for(int j=0;j<m;j++)
           {
               if(i<j)
               {
                   temp=array[i][j];
                   array[i][j]=array[j][i];
                   array[j][i]=temp;
               }
           }
       }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        TransposeMatrix tm=new TransposeMatrix();
        tm.transposematrix(arr,row,col);

    }
}