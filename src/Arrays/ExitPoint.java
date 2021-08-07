package Arrays;

import java.util.Scanner;

public class ExitPoint {

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

        int dir=0;
        int i=0;
        int j=0;

        while (true)
        {
            dir +=(dir+arr[i][j])%4;

            if(dir == 0)
            {
                j++;
            }

            if(dir == 1)
            {
                i++;
            }
            if(dir == 2)
            {
                j--;
            }

            if(dir == 3)
            {
                i--;
            }

            if(i<0)
            {
                i++;
                break;
            }

            if(j<0)
            {
                j++;
                break;
            }

            if(i==n)
            {
                i--;
                break;
            }

            if(i==m)
            {
                j--;
                break;
            }


        }





    }
}
