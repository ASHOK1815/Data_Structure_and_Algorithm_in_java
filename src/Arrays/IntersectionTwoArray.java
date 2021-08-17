package Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionTwoArray {
    public static void main(String[] args) {


        Set<Integer>set = new HashSet<>();
        int ar1[] ={1,2,3,4,5,6};
        int ar2[] ={1,2,5,6,8,9,10};

        for(int i=0;i<ar1.length;i++)
        {
            for (int j=0;j<ar2.length;j++)
            {
                if(ar2[j]==ar1[i])
                {
                    set.add(ar1[i]);
                }
            }
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
