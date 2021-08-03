package SortingAlgorithm;

import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Selection Sort");



        for(int i=0;i<n;i++)
        {
            int mid = i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[mid]>arr[j])
                {
                    mid =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[mid];
            arr[mid] = temp;

        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}

