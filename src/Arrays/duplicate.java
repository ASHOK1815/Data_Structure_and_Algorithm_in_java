package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {

        int ar[] ={1,2,3,4,5,6,7,10,12,4};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<ar.length;i++)
        {
            if(map.containsKey(ar[i]))
            {
                map.put(ar[i],map.get(ar[i])+1);
            }
            else
            {
                map.put(ar[i],1);
            }

        }

        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer,Integer> entry = itr.next();
            if(entry.getValue()>=2)
            {
                System.out.println(entry.getKey());
            }
        }

    }
}
