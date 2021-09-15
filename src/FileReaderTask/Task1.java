package FileReaderTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        File myObj = new File("ASHOK.txt");
        //CODE FOR CREATING FILE.....................................................................
        try {
            if(myObj.createNewFile())
            {
                System.out.println("FILE SUCCESSFUL CREATED SIR");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // WRITING IN THE FILE......................................................................


        try {
            FileWriter fileWriter = new FileWriter("ASHOK.txt");

            fileWriter.write("HEY MY NAME IS ASHOK KUMAWAT");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        // Reading  the data from the files............................................................

        try {
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
