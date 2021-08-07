package Arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[][]  = new int[2][3];
        int arr1[][] = new int[3][4];
        int arr2[][] = new int[2][4];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr1[i][j] = scanner.nextInt();
            }

        }


        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                arr2[i][j] = 0;
            }
        }



        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<3;k++)
                {

                    arr2[i][j]+=(arr[i][k]*arr1[k][j]);
                }
            }
        }

        System.out.println("Answer......");

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }




    }
}
