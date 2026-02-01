package threadexample;

public class SleepRunnable implements Runnable{

    public static void main(String[] args){

       SleepRunnable sr = new SleepRunnable();

       Thread t1 = new Thread(sr,"Getting OTP");
       Thread t2 = new Thread(sr, "Completing Payment");

       t1.start();
       t2.start();

    }

    public void run(){

        for(int i = 1; i <= 3; i++){
            System.out.println(System.currentTimeMillis() + " - " + Thread.currentThread().getName() + " Processing ");

        try{

            Thread.sleep(1000);

        }catch(Exception e) {
            e.printStackTrace();
           }
        }
    }
}
