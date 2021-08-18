package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestElement {
    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 20, 15};
        int k=4;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++)
        {
            queue.add(arr[i]);
        }


        for(int i=k;i<arr.length;i++)
        {
            if(arr[i]<queue.peek())
            {
                queue.poll();
                queue.add(arr[i]);
            }
        }

        System.out.println(queue.peek());
    }
}
