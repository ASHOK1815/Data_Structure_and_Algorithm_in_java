package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int i = 0;
        int j = n-1;

        while (i<j)
        {
            int temp = arr[i];
            arr[i]   = arr[j];
            arr[j]   = temp;

            i++;
            j--;

        }


        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
