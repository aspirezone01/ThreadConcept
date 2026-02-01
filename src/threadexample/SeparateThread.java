package threadexample;

public class SeparateThread extends Thread{

    public static void main(String[] args){

        SeparateThread st = new SeparateThread();

        Thread t1 = new Thread(st, "Thread A");
        Thread t2 = new Thread(st, "Thread B");

        t1.start();
        t2.start();
    }

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " running " );
        }
    }
}
