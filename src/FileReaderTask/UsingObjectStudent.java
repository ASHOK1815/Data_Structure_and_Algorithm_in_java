package FileReaderTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{

    private String name;
    private int  rollNumber;
    private  String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name+' '+rollNumber+' '+department;
    }
}


public class UsingObjectStudent {

    public static void main(String[] args) {


        Student s1 = new Student();
        s1.setName("ASHOK KUMAWAT");
        s1.setDepartment("CSE");
        s1.setRollNumber(6735);

        try {
            FileWriter fileWriter = new FileWriter("ASHOK.txt");
            fileWriter.write(s1.toString());
            System.out.println("WRITING DONE IN TXT FILE");
            fileWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File myObj = new File("ASHOK.txt");
            Scanner scanner = new Scanner(myObj);

            while (scanner.hasNextLine())
            {
                String data = scanner.next();
                System.out.println(data);
            }

            scanner.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
