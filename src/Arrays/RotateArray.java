package Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int ar[] = {1,2,3,4,5};
        int n = 2;

        while (n!=0)
        {

            int holdLastValue = ar[ar.length-1];

            for(int i=ar.length-1;i>0;i--)
            {
                ar[i] = ar[i-1];
            }

            ar[0] = holdLastValue;
            n--;
        }


        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
