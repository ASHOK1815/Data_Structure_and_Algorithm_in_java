package edabit;

import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {


        //A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions
        // for real values of x. Given a, b and c, you should return the number of solutions to the equation
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a and b and c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = b*b-4*a*c;


        if(d<0)
        {
            System.out.println("Root is not existed");
        }
        else
        {
            double x1=(int)((-b)+Math.sqrt(d) )/2*a;
            double x2=(int)((-b)-Math.sqrt(d) )/2*a;

            System.out.println("the root of the value is  "+x1+' '+x2);
        }

    }

}
