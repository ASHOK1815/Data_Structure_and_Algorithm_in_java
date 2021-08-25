package Threading;


class Counter extends Thread{

    private int threadNo;


    public Counter(int threadNo) {
        this.threadNo = threadNo;
    }

    public void CountMe()
    {
        for(int i=0;i<=9;i++)
        {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("The value of i "+ i +" and the thread is  "+threadNo);
        }


    }

}

public class MyCounter {

    public static void main(String[] args) {

        Counter counter1 = new Counter(1);
        counter1.CountMe();
        System.out.println("*************************************");
        Counter counter2 = new Counter(2);
        counter2.CountMe();


    }
}
