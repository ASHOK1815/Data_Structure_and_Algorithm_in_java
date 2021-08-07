package Arrays;

import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row and column matrix");
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int arr[][] = new int[n][m];

        System.out.println("Enter the elements");

        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }


        for(int j=0;j<m;j++)
        {
            if(j%2==0)
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int i=n-1;i>=0;i--)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();

            }
        }

    }
}
