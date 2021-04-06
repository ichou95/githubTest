import java.util.concurrent.TimeUnit;

public class Demo1 {
    public static void main(String[] args) {
        Object lock1=new Object();
        Object lock2=new Object();
        Thread t1= new Thread(()->{
            synchronized (lock1){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("锁住2");
                    synchronized (lock2){
                        System.out.println("closeT1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2= new Thread(()->{
            synchronized (lock2){
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("锁住1");
                    synchronized (lock1){
                        System.out.println("closeT2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }
}
