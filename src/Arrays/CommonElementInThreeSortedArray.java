package Arrays;

import java.util.Iterator;
import java.util.TreeSet;

public class CommonElementInThreeSortedArray {

    public static void main(String[] args) {

        int[] A = {1, 5, 10, 20, 40, 80};
        int[] B = {6, 7, 20, 80, 100};
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120};

        TreeSet<Integer> Array1= new TreeSet<>();
        TreeSet<Integer> Array2= new TreeSet<>();
        TreeSet<Integer> Array3= new TreeSet<>();

        for(int i=0;i<A.length;i++)
        {
            Array1.add(A[i]);
        }
        for(int i=0;i<B.length;i++)
        {
            Array2.add(B[i]);
        }

        for(int i=0;i<C.length;i++)
        {
            Array3.add(C[i]);
        }

        Array1.retainAll(Array2);
        Array1.retainAll(Array3);

        Iterator it = Array1.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
