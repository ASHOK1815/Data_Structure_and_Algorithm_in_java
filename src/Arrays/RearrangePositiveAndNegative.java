package Arrays;

public class RearrangePositiveAndNegative {

    public static void main(String[] args) {

        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        int a=0;
        int b=arr.length-1;

        while(a<b)
        {
            if(arr[a]>=0 && arr[b]<0)
            {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
            else if(arr[a]<0)
            {
                a++;
            }
             else if(arr[b]>0)
            {
                b--;
            }
             else if(arr[a]>=0 && arr[b]>=0)
            {
                a++;
                b--;
            }


        }

        a = 1;
        // -1 -4 3 2 1 4
       while (a<b)
       {
           if(arr[a]<0 && arr[b]>=0)
           {
               int temp = arr[a];
               arr[a] = arr[b];
               arr[b] = temp;

           }

           a+=2;
           b--;


       }


        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
