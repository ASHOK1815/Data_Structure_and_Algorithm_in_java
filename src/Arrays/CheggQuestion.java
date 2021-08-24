package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class CheggQuestion {

    public static void printCharacterInLinkedList(LinkedList<Character> linkedList,int frequency)// method to print character of frequency
    {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        // checking each char of strArray
        for (char c : linkedList) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap,
                // incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {

                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        // Printing the charCountMap
        for (Map.Entry entry : charCountMap.entrySet()) {

            int value = (int) entry.getValue();
            if(value == frequency)
            {
                System.out.println(entry.getKey());
            }

        }



    }
    public static void main(String[] args) {


        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(java.util.Arrays.asList(2,0,1,7,1,1,4,9,8));  // arraylist
        LinkedList<Character> linkedList = new LinkedList<>(java.util.Arrays.asList('D','u','a','a','S','a','m','a','r','a')); // linkedlist

        int rand = ThreadLocalRandom.current().nextInt(4,8);  // in build method to print random number between two number
        System.out.println("The random number is " + rand);
        System.out.println("The character with " + arrayList1.get(rand) +" frquency");


        printCharacterInLinkedList(linkedList,arrayList1.get(rand));










    }
}
