package edabit;

import java.util.LinkedList;
import java.util.List;

public class HallMonitor {

    public static void main(String[] args) {

        //Hall Monitor
        //A floor plan is arranged as follows:
        //
        //Four rooms, which all lead into the hallway.
        //It's impossible to move between rooms without first going into the hallway.
        //Room
        //
        //Create a function which validates whether the path between rooms is possible. The hallway will be given as the letter "H"


        List list = new LinkedList();
        list.add(1);
        list.add('H');
        list.add(2);
        list.add('H');
        list.add(3);
        list.add('H');
        list.add(4);
        list.add('H');
        list.add(5);


        boolean flag = true;
        Object value = list.get(0);

        if(value.equals('H'))
        {
            int counter=0;
            for(Object lst:list)
            {
                if(counter%2==0 && !lst.equals('H'))
                {
                    flag=false;
                    break;
                }
                counter++;
            }

        }
        else
        {
            int counter=0;
            for(Object lst:list)
            {
                if(counter%2==1 && !lst.equals('H'))
                {
                    flag=false;
                    break;
                }
                counter++;
            }

        }

        if(flag)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }












    }
}
