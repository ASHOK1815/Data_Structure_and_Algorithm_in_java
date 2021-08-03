package linkedlist;

class CircularLinkedList<E>{

    public class Node<E>{

        E data;
        Node next;

        Node(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node<E> head;
    public Node<E> tail;
    public Node<E> newElement;

    CircularLinkedList()
    {
        head = null;
        newElement = null;
    }

    void insert(E data)
    {
        newElement = new Node<>(data);

        if(head == null)
        {
            head = tail = newElement;
        }
        else
        {
           tail.next = newElement;
           newElement.next = head;
           tail = newElement;
        }

    }

    void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node<E> temp = head;

            while(temp.next != head)
            {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data+" ");
        }
    }

}

public class CircularLinkedListMain {
    public static void main(String[] args) {

         CircularLinkedList<String> circularLinkedList = new CircularLinkedList<>();
         circularLinkedList.insert("ASHOK");
         circularLinkedList.insert("SUNIL");
         circularLinkedList.insert("KUMAR");
         circularLinkedList.insert("JAVED");
         circularLinkedList.insert("ASHUTOSH");

         circularLinkedList.display();
    }
}
