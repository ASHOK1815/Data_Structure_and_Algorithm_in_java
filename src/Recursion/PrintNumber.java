package Recursion;

import java.util.Scanner;

public class PrintNumber {

    public static  void printNumber(int n)
    {
        if(n == 0) return;

        printNumber(n/10);
        System.out.println(n%10);

    }

    public static int countNumberOfDigit(int n)
    {
        if( n ==0 )return 0;

        return 1+countNumberOfDigit(n/10);
    }

    public static int sumOfDigit(int n)
    {
        if( n==0 )return 0;

        int small = sumOfDigit(n/10);
        int large = n%10;

        return large + small;
    }

    public static int multiplicationOfDigit(int n)
    {
        if( n==0 )return 0;

        int small = sumOfDigit(n/10);
        int large = n%10;

        return large * small;
    }

    public static int countZeroes(int n)
    {
        if(n==0) return 0;

        int small = countZeroes(n/10);
        int large = n%10;

        if(large == 0)
        {
            return  1+small;
        }
        else
        {
            return small;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printNumber(1234);
        System.out.println(countNumberOfDigit(123456));
        System.out.println(sumOfDigit(12345));
        System.out.println(countZeroes(123002));

    }
}
