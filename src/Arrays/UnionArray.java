package Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class UnionArray {
    public static void main(String[] args) {

        int ar1[]={1,2,3,4,5,5,5};
        int ar2[] ={6,7,8,9,10};

        Set<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<ar1.length;i++)
        {
            set.add(ar1[i]);
        }

        for(int i=0;i<ar2.length;i++)
        {
            set.add(ar2[i]);
        }

        for(Integer Union :set)
        {
            System.out.println(Union);
        }

    }
}
