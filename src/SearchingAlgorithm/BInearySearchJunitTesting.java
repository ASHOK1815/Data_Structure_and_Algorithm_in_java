package SearchingAlgorithm;

import org.junit.Test;
import stack.BalanceParenthesis;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BInearySearchJunitTesting {

    @Test
    public void testingBinearySearchAlgorithm() {

        BinearySearch binearySearch = new BinearySearch();

        int arr[] = new  int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        assertEquals("Result", -1, binearySearch.BinearySearching(arr,5,6));
        assertEquals("Result", 3, binearySearch.BinearySearching(arr,5,3));

    }


}
