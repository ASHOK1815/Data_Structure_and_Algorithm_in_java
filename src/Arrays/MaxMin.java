package Arrays;

public class MaxMin {
    public static void main(String[] args) {

        int ar[] ={1,2,3,4,5,6,19,20};

        int mx =Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<mn)
            {
                mn =ar[i];
            }

            if(ar[i]>mx)
            {
                mx = ar[i];
            }
        }

        System.out.println("MIN "+mn +"  "+"MAX "+mx);

    }
}
