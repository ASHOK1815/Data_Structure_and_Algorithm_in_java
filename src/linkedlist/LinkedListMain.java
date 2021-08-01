package linkedlist;

class LinkedList<E>{

    class ListNode<E>{

        E data;
        ListNode next;

        ListNode(E data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode<E> head;
    public ListNode<E> tail;
    public ListNode<E> newElement;

    public LinkedList()
    {
        head = null;
        tail = null;
    }

    public void insert(E data)
    {
        newElement = new ListNode<>(data);
        if(head==null)
        {
            head=tail=newElement;
            return;
        }
        else
        {
            tail.next = newElement;
            tail = newElement;
        }
    }

    public  void insertHead(E data)
    {
        newElement = new ListNode<>(data);
        newElement.next = head;
        head = newElement;

    }

    public void insertTail(E data)
    {
        newElement = new ListNode<>(data);
        tail.next  = newElement;
    }

    public void insertPosition(int position,E data)
    {
        newElement = head;

        for(int count=1;count<position;count++)
        {
            count++;
            newElement = newElement.next;
        }
        ListNode<E> newDummyVariable = new ListNode<>(data);
        newDummyVariable.next = newElement.next;
        newElement.next = newDummyVariable;


    }

    public void deleteFirstNode()
    {
        newElement = head;
        head =  head.next;
    }

    public void deleteLastNode()
    {
        newElement = head;
        ListNode<E> dummyVariable = null;
        while (newElement.next != null)
        {
            dummyVariable = newElement;
            newElement = newElement.next;
        }

        dummyVariable.next = null;
    }


    public void deletePostion(int position)
    {
        newElement = head;

        if(position == 0)
        {
            head = head.next;
            return;
        }

        for(int count=1;count<position;count++)
        {
            newElement = newElement.next;
        }

        newElement.next = newElement.next.next;

    }


    public void displayReverse()
    {
        ListNode<E> currentElement = head;
        ListNode<E> prev = null;
        ListNode<E> next = null;

        while(currentElement != null)
        {
            next = currentElement.next;
            currentElement.next = prev;
            prev = currentElement;
            currentElement = next;
        }

        head = prev;
        dispalyUsingRecursion(head);
    }

    public void display()
    {
        ListNode<E> temp = head;

        while (temp!= null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public void  dispalyUsingRecursion(ListNode head)
    {
        if(head == null)
        {
            return;
        }

        System.out.println(head.data+" ");
        dispalyUsingRecursion(head.next);

    }
    public void displayInReverseUsingRecursion(ListNode head)
    {
        if(head == null)
        {
            return;
        }
        dispalyUsingRecursion(head.next);
        System.out.println(head.data+" ");
    }

}

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insertHead(100);
        linkedList.insertTail(100);
        linkedList.insertPosition(2,786);
        linkedList.deleteFirstNode();
        linkedList.deleteLastNode();
        linkedList.deletePostion(1);
        linkedList.displayReverse();
        //linkedList.displayInReverseUsingRecursion(linkedList.head);
        //linkedList.display();
    }
}
