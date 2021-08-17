package Arrays;

import java.util.Scanner;

public class AllNegativeTogether {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ar[] ={1,2,3,-1,-3,-4,5};

        int j=-1;

        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<=j)
            {
                j++;
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
            }
        }


        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }


    }
}
