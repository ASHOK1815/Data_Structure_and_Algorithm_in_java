package PracticeTime;


import java.util.*;

public class CollectionFramework {

    public static void main(String[] args) {

        // working with the arraylist;

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(Integer element:list)
        {
            System.out.print(element+" ");
        }
        System.out.println();

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

        System.out.println();


        // working withe the linked list in java


        List<String> newlist= new LinkedList<>();
        newlist.add("ashok");
        newlist.add("sunil");
        newlist.add("kumar");

        newlist.add(0,"Ashutosh_sharma");


        Iterator it = newlist.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

         // Now working with the stack
        System.out.println();
        Stack<Integer> stk = new Stack<>();

        stk.add(1);
        stk.add(2);
        stk.add(3);
        System.out.println(stk.get(2));
        System.out.println(stk.peek());



        // working with the vector and they are synchronized

        List<Integer> vk = new Vector<>();
        vk.add(1);
        vk.add(5);
        vk.add(3);
        vk.add(4);
        vk.add(5);


        vk.sort(Integer::compareTo);
        System.out.println(vk);

        // working with the set

        Set<Integer> hashset = new HashSet<>(); // hashset does not maintain the order
        hashset.add(1);
        hashset.add(2);
        hashset.add(15);
        hashset.add(91);
        hashset.add(3);
        hashset.add(4);
        hashset.add(10);
        System.out.println(hashset);


        //...... solution is that if you want to maintain the insertion order use linkedhashmap

        Set<String > linkedhashset= new LinkedHashSet<>();

        linkedhashset.add("ASHOK");
        linkedhashset.add("SUNIL");
        linkedhashset.add("ASHUTOSH");
        linkedhashset.add("JAVED");


        System.out.println(linkedhashset);


        // IN order to maintian in the sorting order we can use hashset


        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(14);
        treeSet.add(41);
        treeSet.add(12);

        System.out.println(treeSet);



        // now working of the map;


        HashMap<Integer,Character> hashMap = new LinkedHashMap<Integer, Character>();

        hashMap.put(6735,'A');
        hashMap.put(2467,'B');
        hashMap.put(6705,'C');


        for(Map.Entry entry : hashMap.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }











    }
}
