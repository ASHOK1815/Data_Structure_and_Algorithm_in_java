package SortingAlgorithm;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }


        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }



        // ANOTHER WAY IS

        for(int i=0;i<n;i++)
        {

            for(int j=0;j<=n-2;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }

}