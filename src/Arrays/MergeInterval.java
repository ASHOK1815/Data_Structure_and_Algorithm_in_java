package Arrays;


public class MergeInterval {
    public static void main(String[] args) {

        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};

        java.util.Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));


        java.util.Stack<Integer> stk1 = new java.util.Stack<>();
        java.util.Stack<Integer> stk2 = new java.util.Stack<>();

        stk1.add(arr[0][0]);
        stk2.add(arr[0][1]);

        for(int i=1;i< arr.length;i++)
        {
            int arrFirst = arr[i][0];
            int arrSecond = arr[i][1];

            if(arrFirst<stk2.peek())
            {
                stk2.pop();
                stk2.add(arrSecond);
            }
            else
            {
                stk1.add(arrFirst);
                stk2.add(arrSecond);
            }

        }

        while (!stk1.empty())
        {
            System.out.println(stk1.peek()+" "+stk2.peek());
            stk1.pop();
            stk2.pop();
        }



    }
}
