package edabit;

public class RecursinSumArray {



    public static int solve(int arr[],int i)
    {
        if(i==arr.length)
        {
            return 0;
        }

        return arr[i]+solve(arr,i+1);
    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        System.out.println(solve(arr,0));

    }
}
