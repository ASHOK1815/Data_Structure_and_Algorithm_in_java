package stack;

public class RemoveAllAdjacentDuplicate {

    public String swap(String str,int i,int j)
    {
        char[] dummarray = str.toCharArray();

        char temp = dummarray[i];
        dummarray[i] = dummarray[j];
        dummarray[j] = temp;

        return String.valueOf(dummarray);

    }

    public String removeDuplicate(String s)
    {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.empty() || stack.peek()!=s.charAt(i))
            {
                stack.add(s.charAt(i));
            }
            else
            {
                stack.pop();
            }


        }

        String ans="";

        while (!stack.empty())
        {
            ans+=stack.peek();
            stack.pop();

        }
        int i=0;
        int j=ans.length()-1;
        while(i<j)
        {

            ans=swap(ans,i,j);
            i++;
            j--;
        }

        return ans;

    }

}
