package stack;

class Stack<E>{

    class StackNode<E>{
        E data;
        StackNode next;

        StackNode(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public StackNode<E> top;
    public StackNode<E> newElement;

    public Stack()
    {
       top =null;
    }

    void push(E data)
    {
        newElement = new StackNode<>(data);

        if(top == null)
        {
             top = newElement;
        }
        else
        {
            newElement.next = top;
            top = newElement;
        }


    }

    void pop()
    {
        if(top == null)
        {
            System.out.println("stack is empty");
        }
        else
        {
            top = top.next;
        }

    }

    void display()
    {
        if(top == null)
        {
            System.out.println("stack is empty");
        }
        else
        {
            StackNode<E> temp = top;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }
    }


}

public class StackMain {
    public static void main(String[] args) {

        Stack<String> stk = new Stack<>();
        stk.push("ASHOK");
        stk.push("SUNIL");
        stk.push("JAVED");
        stk.push("ASHUTOSH");
        stk.push("KUMAR");
        stk.pop();
        stk.display();
    }
}
