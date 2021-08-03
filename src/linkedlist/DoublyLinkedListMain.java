package linkedlist;

class DoublyLinkedList<E>{

    public class Node<E>{

        E data;
        Node prev;
        Node next;

        Node(E data)
        {
            this.data =  data;
            this.prev =  null;
            this.next =  null;
        }
    }

    public  Node<E> head;
    public  Node<E> tail;
    public  Node<E> newElement;

    DoublyLinkedList()
    {
        head = tail = newElement = null;
    }

    void insertData(E data)
    {
        newElement = new Node<E>(data);

        if(head == null)
        {
            head = tail = newElement;
        }
        else
        {
            tail.next = newElement;
            newElement.prev = tail;
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
            while (temp != null)
            {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    void displayReverse()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node<E> temp = tail;
            while (temp != null)
            {
                System.out.println(temp.data+" ");
                temp = temp.prev;
            }

        }


    }



}



public class DoublyLinkedListMain {

    public static void main(String[] args) {

        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.insertData("ASHOK");
        doublyLinkedList.insertData("SUNIL");
        doublyLinkedList.insertData("JAVED");
        doublyLinkedList.insertData("KUMAR");
        doublyLinkedList.display();
        doublyLinkedList.displayReverse();



    }
}
