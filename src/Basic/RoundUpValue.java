package Basic;

import java.util.Scanner;

public class RoundUpValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double n =2.125;
       // Here is the trick bro.....................

        n=n*100;
        n=(int)(n+0.5);
        n=n/100.0;

        System.out.println(n);// Answer is 2.13



    }
}
