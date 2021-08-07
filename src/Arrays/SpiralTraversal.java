package Arrays;

import java.util.Scanner;

public class SpiralTraversal {
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

        int lrow = 0;
        int mrow = n-1;
        int lcol = 0;
        int mcol = m-1;


        int count = 0;

        while(count<m*n)
        {

            for(int i=lrow,j=lcol;i<=mrow;i++)
            {
                System.out.print(arr[i][j]+ " ");
                count++;
            }
            System.out.println();
            lcol++;

            for(int i=mrow,j=lcol;j<=mcol;j++)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            System.out.println();

            mrow--;

            for(int i=mrow ,j=mcol;i>=lrow;i--)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            System.out.println();

            mcol--;

            for(int i=lrow,j=mcol;j>=lcol;j--)
            {
                System.out.print(arr[i][j]+" ");
                count++;
            }
            lrow++;


        }


    }
}
