package Basic;

//        Given an array A of N elements. Find the majority element in the array.
//        A majority element in an array A of size N is an element that appears more than N/2 times in the array.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityELement {

    public static int solve(int arr[],int n)
    {
        HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();

        for(Integer integer:arr)
        {
            if(map.containsKey(integer))
            {
                map.put(integer,map.get(integer)+1);
            }
            else
            {
                map.put(integer,1);
            }


        }

        int size=(int)n/2;
        for (Map.Entry entry : map.entrySet()) {

            if((int)entry.getValue()>size)
            {
                return (int) entry.getKey();
            }

        }




       return -1;

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("the Majority element is  "+solve(arr,n));








    }
}
