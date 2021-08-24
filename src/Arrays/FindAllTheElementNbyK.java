package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindAllTheElementNbyK {
    public static void main(String[] args) {

        int arr[] = {1,1,1,12,2,2,2,23,4,3,5,5,5,5};
        int n= arr.length;
        int k =4;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0 ;i<arr.length;i++)
        {
            if(!hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],1);
            }
            else
            {
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }

        }

        Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();

        while (it.hasNext())
        {
            Map.Entry<Integer, Integer> entry = it.next();

            if(entry.getValue()>(int)n/k)
            {
                System.out.print(entry.getKey()+" ");
            }



        }






    }
}
