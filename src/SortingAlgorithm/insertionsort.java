package SortingAlgorithm;

import java.util.Scanner;

public class insertionsort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }


        System.out.println("Insertion sort");

        int j;
        for(int i=1;i<n;i++)
        {
            int temp = arr[i];

            for(j=i;j>0 && temp<arr[j-1] ;j--)
            {
                arr[j] = arr[j-1];
            }

            arr[j] = temp;


        }


        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }







    }

}
