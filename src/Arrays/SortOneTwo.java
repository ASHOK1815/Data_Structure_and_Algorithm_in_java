package Arrays;

public class SortOneTwo {

    public static void main(String[] args) {

        int ar1[] = {0,0,1,2,0,0,1,2,1,2,1,2,1,2,1,1,1,2,2,1};

        int countZero=0;
        int countOne=0;
        int countTwo=0;

        for(int i=0;i<ar1.length;i++)
        {
            if(ar1[i]==0) countZero++;
            if(ar1[i]==1) countOne++;
            if(ar1[i]==2) countTwo++;
        }

        int i=0;

        while(countZero>0)
        {
            ar1[i]=0;
            i++;
            countZero--;

        }
        while(countOne>0)
        {
            ar1[i]=1;
            i++;
            countOne--;

        }
        while(countTwo>0)
        {
            ar1[i]=2;
            i++;
            countTwo--;

        }

        for(Integer value:ar1)
        {
            System.out.println(value);
        }
    }
}
