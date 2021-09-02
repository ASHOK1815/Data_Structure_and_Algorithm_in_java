package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{

    private String name;
    public String getName() {
        return name;
    }
    public Data(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class SmartApp {

    public static void main(String[] args) {

        List<Data> data = new ArrayList<>();

        data.add(new Data("ASHOK"));
        data.add(new Data("ASHUTOSH"));
        data.add(new Data("SUNIL"));
        data.add(new Data("JAVED"));
        data.add(new Data("SOLZAR"));

        //FIRST WAY
        Collections.sort(data, (Data obj1, Data obj2)->{

            return obj1.getName().compareTo(obj2.getName());
        });

        // SECOND WAY

        Collections.sort(data, (Data obj1, Data obj2)->{

            if(obj1.getName().length() == obj2.getName().length())
            {
                return 0;
            }
            else if(obj1.getName().length() > obj2.getName().length())
            {
                return 1;
            }

            return -1;
        });


        System.out.println(data);

    }


}
