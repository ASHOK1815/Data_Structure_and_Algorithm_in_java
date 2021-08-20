package Arrays;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static void main(String[] args) {

        int arr[] = { -3, 2, 3, 1, 6 };

        HashSet<Integer> set = new HashSet<>();

        int sum=0;
        boolean flag = false;
        for(int  i=0;i<set.size();i++)
        {
            sum+=arr[i];

            if(arr[i] == 0 || sum==0 || set.contains(sum))
            {
                flag = true;
                break;
            }

            set.add(sum);
        }


        if(flag)
        {
            System.out.println("SubArrayPresent with sum zero");
        }
        else
        {
            System.out.println("No subArray Present with sum zero");
        }

    }
}
