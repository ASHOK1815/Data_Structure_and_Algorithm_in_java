package Basic;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 1234;
        int result =0;

        while(n!=0)
        {
            int temp = n%10;
            result = result*10+temp;
            n=n/10;


        }

        System.out.println(result);

    }
}
