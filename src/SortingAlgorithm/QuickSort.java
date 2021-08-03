package SortingAlgorithm;

import java.util.Scanner;

public class QuickSort {

    public static int partion(int arr[],int l,int r)
    {
        int pivot = arr[l];

        int i=l;
        int j=r+1;

        do{

            do{
                i++;
            }while(arr[i]<=pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }



        }while(i<j);

        arr[l] = arr[j];
        arr[j] = pivot;

        return  j;

    }

    public static void quicksort(int arr[],int l,int r)
    {

        if(l<r)
        {
            int j = partion(arr,l,r);


            quicksort(arr,l,j-1);
            quicksort(arr,j+1,r);


        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        quicksort(arr,0,n-1);

        System.out.println("After sorting");


        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
