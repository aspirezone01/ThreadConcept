package threadexample;

public class DemoRunnable implements Runnable{

    public static void main(String[] args){

        DemoRunnable dr = new DemoRunnable();

        Thread t1 = new Thread(dr);
        Thread t2 = new Thread(dr, "Thread B");

        t1.setName("Thread 1");

        t1.start();
        t2.start();
    }

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " running ");
        }
    }
}
