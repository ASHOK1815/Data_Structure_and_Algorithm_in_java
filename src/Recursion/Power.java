package Recursion;

import java.util.Scanner;

public class Power {

    public static int pow(int n,int power)
    {
        if(power == 0) return 1;
        return n*pow(n,power-1);


    }

    public static int pow1(int n,int power)
    {
        int res=1;

        while(power!=0)
        {
            if(power%2==0)
            {
                power = power/2;
                n = n*n;
            }
            else
            {
                power = power-1;
                res = res*n;


            }

        }

        return res;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(pow(2,13));
        System.out.println(pow1(2,13));



    }
}
