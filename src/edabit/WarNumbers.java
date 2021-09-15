package edabit;

public class WarNumbers {

    public static void main(String[] args) {

        //There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. You have to determine which group sums larger: the even, or the odd. The larger group wins.
        //
        //Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between sum of even and odd numbers.

        int arr[] = {2,8,7,5};

        int odd=0;
        int even=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even+=arr[i];
            }
            else
            {
                odd+=arr[i];
            }
        }

        System.out.println(Math.abs(even-odd));



    }
}
