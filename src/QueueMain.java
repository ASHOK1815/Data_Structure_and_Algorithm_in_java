
class Queue<E>{

    class Node<E>{

        E data;
        Node next;

        Node(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node<E> frontNode;
    public Node<E> rearNode;
    public Node<E> newElement;

    public Queue()
    {
        frontNode = null;
        rearNode  = null;
    }


    void  push(E data)
    {
        newElement = new Node<>(data);

        if(rearNode == null)
        {
            rearNode = frontNode = newElement;
        }
        else
        {
            rearNode.next = newElement;
            rearNode = newElement;
        }
    }

    void pop()
    {
        if(frontNode == null)
        {
            System.out.println("Queue is empty can't pop element");
            return;
        }
        else
        {
             frontNode = frontNode.next;
        }
    }

    void display()
    {
        if(rearNode == null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            Node<E> temp = frontNode;
            while (frontNode != null)
            {
                System.out.println(frontNode.data);
                frontNode = frontNode.next;
            }



        }
    }


}

public class QueueMain {
    public static void main(String[] args) {

        Queue<String> queue = new Queue<>();
        queue.push("ASHOK");
        queue.push("SUNIL");
        queue.push("JAVED");
        queue.push("ASHUTOSH");
        queue.push("KUMAR");
        queue.pop();

        queue.display();
    }
}
