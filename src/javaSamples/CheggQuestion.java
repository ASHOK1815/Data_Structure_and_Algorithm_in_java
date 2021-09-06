package javaSamples;

class StackContainer {

     private int stackSize;
     private int[] stackArr;
     private int top;

     /* constructor to create stack with size*/

     public StackContainer(int size) {
         this.stackSize = size;
         this.stackArr = new int[stackSize];
         this.top = -1;
     }

     /* This method adds new entry to the top */
     public void push(int entry) throws Exception {
         if (this.isStackFull()) {
             throw new Exception("Stack is already full. Can not add element.");
         }
         System.out.println("Adding: " + entry);
         this.stackArr[++top] = entry;
     }

     /*  This method removes an entry from the  top of the stack.*/
     public int pop() throws Exception {
         if (this.isStackEmpty()) {
             throw new Exception("Stack is empty. Can not remove element.");
         }

         int entry = this.stackArr[top--];
         System.out.println("Removed entry: " + entry);
         return entry;
     }

     /*This method returns top of the stack without removing it.*/
     public int peek() {
         return stackArr[top];
     }

     /*This method returns true if the stack is */
     public boolean isStackEmpty() {
         return (top == -1);
     }

     /*This method returns true if the stack is full */
     public boolean isStackFull() {
         return (top == stackSize - 1);
     }

     public void print()
     {
         for(int i=0;i<=top;i++)
         {
             System.out.print(stackArr[i]+" ");
         }
     }

 }


public class CheggQuestion {




    public static void main(String[] args) throws Exception {


        stackcontainer stk = new stackcontainer(5);

        stk.push(4);
        stk.push(5);
        mystery(stk, 3);

        System.out.println("The element available in stack are  ");
        stk.print();


    }

    public static void mystery(stackcontainer stk, int n) throws Exception {
        for (int i = 0; i <= n; i++) {
            stk.push(i);
            stk.pop();
            stk.push(stk.pop());
        }
    }




}


