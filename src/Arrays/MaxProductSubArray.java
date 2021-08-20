package Arrays;

public class MaxProductSubArray {

    public static void main(String[] args) {

        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };

        int result = arr[0];

        for(int i=0;i<arr.length;i++)
        {
            int temp = arr[i];

            for(int j=i+1;j<arr.length;j++)
            {

                result = Integer.max(result,temp);
                temp*=arr[j];
            }

            result = Integer.max(result,temp);
        }

        System.out.println(result);

    }
}
