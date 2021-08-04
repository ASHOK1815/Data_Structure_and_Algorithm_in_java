package stack;

import java.util.Scanner;
import java.util.*;


public class BalanceParenthesis {



    public static boolean isbalanced(String exp)
    {

        java.util.Stack<Character> stk = new java.util.Stack<Character>();
        for(int i=0;i<exp.length();i++)
        {
            if(exp.charAt(i) =='(' || exp.charAt(i) =='[' || exp.charAt(i)=='{')
            {
                stk.add(exp.charAt(i));
            }
            else if( exp.charAt(i) ==')' || exp.charAt(i) ==']' || exp.charAt(i) =='}')
            {
                if(stk.empty())
                {
                     return false;
                }

                if(stk.peek() == '(')
                {
                    if(exp.charAt(i)==')')
                    {
                        stk.pop();
                    }
                    else
                    {
                        return  false;
                    }

                }
                else if(stk.peek() == '{')
                {
                    if(exp.charAt(i)=='}')
                    {
                        stk.pop();
                    }
                    else
                    {
                        return  false;
                    }

                }
                else if(stk.peek() == '[')
                {
                    if(exp.charAt(i)==']')
                    {
                        stk.pop();
                    }
                    else
                    {
                        return  false;
                    }

                }

            }

        }

       return  stk.empty()? true:false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        if(isbalanced(s1))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }

    }
}
