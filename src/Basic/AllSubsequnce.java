package Basic;

import java.util.Scanner;

public class AllSubsequnce {

    public static void Substring(String s,String output)
    {
        if(s.length() == 0)
        {
            System.out.println(output);
            return;
        }
        Substring(s.substring(1),output);
        Substring(s.substring(1),output+s.charAt(0));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        Substring(str,"");

    }
}
