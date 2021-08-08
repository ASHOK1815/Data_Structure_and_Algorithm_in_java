package stack;

public class ReversePolishNotation {

    public int reverseNotation(String tokens[])
    {

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        for(int i=0; i<tokens.length;i++)
        {
            if(tokens[i]=="+" || tokens[i]=="-" || tokens[i]=="*" || tokens[i]=="/") {
                int topelment = stack.peek();
                stack.pop();
                int secondTopElement = stack.lastElement();
                stack.pop();

                if (tokens[i] == "+") {
                    stack.add(topelment + secondTopElement);
                } else if (tokens[i] == "-") {
                    stack.add(topelment - secondTopElement);
                } else if (tokens[i] == "*") {
                    stack.add(topelment * secondTopElement);
                } else if (tokens[i] == "/") {
                    stack.add(topelment / secondTopElement);
                }


            }
            else
            {
                stack.add(Integer.parseInt(tokens[i]));
            }


        }

        return stack.peek();
    }
}
