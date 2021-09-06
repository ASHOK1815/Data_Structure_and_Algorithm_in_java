package LearningStackPhase;

//... i found that in jdk 8 we can add this feature also means we can define method in interface

interface Student{

    default void display()
    {
        System.out.println("Hey i am student ");
    }
    static void display1()
    {
        System.out.println("I am in the static method ");
    }

}


public class NewAboutInterface implements Student{

    public static void main(String[] args) {


        NewAboutInterface testing = new NewAboutInterface();
        testing.display();
        Student.display1();

    }

}
