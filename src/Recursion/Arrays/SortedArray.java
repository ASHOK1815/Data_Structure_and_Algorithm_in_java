package Recursion.Arrays;

import java.util.Scanner;

public class SortedArray {

    public static boolean sorted(int arr[],int n,int i)
    {
        if(n==0)
        {
            return true;
        }

        if(arr[i]>arr[i+1])
        {

            return false;
        }

        return sorted(arr,n-1,i+1);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements...");
        for(int i=0; i<n; i++)
        {
            arr[i] =  scanner.nextInt();
        }

        if(sorted(arr,n-1,0))
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not sorted");
        }

    }
}
