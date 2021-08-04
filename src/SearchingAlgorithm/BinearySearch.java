package SearchingAlgorithm;

import java.util.Scanner;

public class BinearySearch {

    static Scanner scanner = new Scanner(System.in);
    public  static int BinearySearching(int arr[],int n,int k)
    {
        int low = 0;
        int high = n-1;

        while(low<=high)
        {
            int mid =(low+high)/2;

            if(arr[mid] == k)
            {
                return  mid+1;
            }
            if(k<arr[mid])
            {
                high = mid-1;
            }
            if(k>arr[mid])
            {
                low = mid+1;
            }



        }

        return  -1;
    }

    public static void main(String[] args) {



        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n +" element ");

        for(int i=0 ;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }





    }

}
