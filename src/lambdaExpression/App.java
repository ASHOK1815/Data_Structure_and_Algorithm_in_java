package lambdaExpression;

interface Lambda{

    public void demo();
}

public class App {

    public static void main(String[] args) {

//        Lambda lambda = new Lambda() {
//            @Override
//            public void demo() {
//                System.out.println("HEY I AM IN DEMO METHOD");
//            }
//        };

        Lambda lambda = ()->{
            System.out.println("hey i am in demo method 2");
        };
        lambda.demo();

    }
}
