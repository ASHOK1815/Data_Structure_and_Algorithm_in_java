package SortingAlgorithm;

import java.util.Scanner;

public class MergeSort {


    public static void merge(int arr[], int l, int m, int r)
    {
        int i,j,k;

        int n1 =m-l+1;
        int n2 =r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(i=0;i<n1;i++)
        {
            L[i] = arr[i+l];
        }

        for(j=0;j<n2;j++)
        {
            R[j] = arr[j+m+1];
        }

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                arr[k] = L[i];
                i++;

            }
            else
            {
                arr[k] = R[j];
                j++;
            }

            k++;
        }


        while(i<n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j<n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


    public static void mergesort(int[] arr, int l, int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;

            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);


        }



    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }


        mergesort(arr,0,n-1);

        System.out.println("After sorting Answer is ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
