package Arrays;

public class CountInversion {

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 20, 6, 4, 5 };

        int totalCount=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    totalCount++;
                }
            }
        }

        System.out.println(totalCount);

    }
}
