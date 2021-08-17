package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int ar1[]={1,2,3,4,5,6,7};
        int ar2[]={2,4,5,8,9};

        //   i=4;
        //   j=2;
        //   k=4;
        //   arr= 1 2 2 3 4 4
        int finalarray[]= new int[ar1.length+ar2.length];


        int i=0;
        int j=0;
        int k=0;

        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]<ar2[j])
            {
                finalarray[k]=ar1[i];
                i++;
                k++;

            }
            else if(ar2[j]<ar1[i])
            {
                finalarray[k]= ar2[j];
                j++;
                k++;
            }
            else if(ar2[j]==ar1[i])
            {
                finalarray[k]= ar1[i];
                k++;
                finalarray[k]= ar2[j];
                i++;
                j++;
                k++;
            }

        }

        while (i<ar1.length)
        {
            finalarray[k]=ar1[i];
            i++;
            k++;
        }

        while(j<ar2.length)
        {
            finalarray[k]=ar2[j];
            j++;
            k++;
        }
        for( i=0;i<finalarray.length;i++)
        {
            System.out.print(finalarray[i]+" ");
        }

    }
}
