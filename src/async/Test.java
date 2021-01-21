package async;

public class Test {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("-hello");
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

        //System.out.println("hello from main thread");
//        System.out.println("Im going to sleep");
//        Thread.sleep(3000);
//        System.out.println("im awake");
        Thread thread = new Thread(new Runner());
        thread.start();


    }
}
class Runner implements  Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello from my thread " + i);
        }
    }
}
class MyThread extends Thread {
    public void run() {

        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello from my thread " + i);
        }
    }
}
