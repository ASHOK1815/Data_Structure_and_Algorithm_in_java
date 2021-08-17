package Arrays;

public class KadaneAlgorithm {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};

        int mx = Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<ar.length;i++)
        {
            count+=ar[i];
            if(count>mx)
            {
                mx = count;
            }

            if(count<0)
            {
                count =0;
            }

        }

        System.out.println(mx);
    }
}
