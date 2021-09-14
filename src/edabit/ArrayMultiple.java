package edabit;

import java.util.Scanner;

public class ArrayMultiple {

    public static void main(String[] args) {

        //Array of Multiples
        //Create a function that takes two numbers as arguments (num, length)
        // and returns an array of multiples of num until the array length reaches length.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int arr[] = new int[b+1];
        for(int i=1;i<=b;i++)
        {
            arr[i]=i*a;
        }

        for(int i=1;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }

}
