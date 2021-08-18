package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation {

    public static void main(String[] args) {

        Integer[] arr = {5,4,7,5,3,2};

        int idx=-1;
        int n = arr.length;
        for(int i=n-1;i>0;i--)
        {
            if(arr[i]>arr[i-1])
            {
                idx = i;
                break;
            }
        }

        if(idx == -1)
        {
            Arrays.sort(arr, Collections.reverseOrder());
        }
        else
        {
            int prev=idx;


            for(int i=idx+1;i<n;i++)
            {
                if(arr[i]>arr[idx-1] && arr[i]<=arr[prev])
                {
                    prev=i;
                }

            }



            int temp = arr[idx-1];
            arr[idx-1] = arr[prev];
            arr[prev] = temp;



            int i=idx;
            int j=arr.length-1;

            while (i<j)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }

            for (int k=0;k<arr.length;k++)
            {
                System.out.print(arr[k]+" ");
            }







        }



    }
}
