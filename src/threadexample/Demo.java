package threadexample;

public class Demo extends Thread{

    public static void main(String[] args){

        Demo d = new Demo();

        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        t1.setName("Thread T1 ");
        t2.setName("Thread T2 ");
        t3.setName("Thread T3 ");
        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
    }

    public void run(){

        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread() + "Executing thread");
        }

    }
}
