package Basic;

import java.util.Scanner;

public class Permutation {

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void permutation(String s,int l,int r)
    {
        if(l == r)
        {
            System.out.println(s);
            return;

        }

        for(int i=l;i<=r;i++)
        {
            s = swap(s,l,i);
            permutation(s, l+1, r);
            s = swap(s,l,i);
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        permutation(string,0,string.length()-1);


    }
}
