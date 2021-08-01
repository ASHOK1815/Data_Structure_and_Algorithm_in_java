

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

    public void display()
    {
        ListNode<E> temp = head;

        while (temp!= null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }

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
        linkedList.display();
    }
}
