import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3 {
    public static volatile AtomicInteger i;
    public static void main(String[] args) {
        i = new AtomicInteger(1);
        Lock lock=new ReentrantLock();
        Condition condition1=lock.newCondition();
        Condition condition2=lock.newCondition();
        Condition condition3=lock.newCondition();
        Condition condition4=lock.newCondition();
            Thread t1 = new Thread(() -> {
                lock.lock();
                try {
                    int j=i.get()%4;
                    while(j!=1){
                        condition2.wait();
                    }
                        System.out.println(Thread.currentThread().getName() + ":" + i.get());
                        i.incrementAndGet();
                        condition2.signalAll();


                }catch (Exception e){

                }finally {
                    lock.unlock();
                }
            });
            Thread t2 = new Thread(() -> {
                lock.lock();
                try {
                    int j=i.get()%4;
                    while(j!=2){
                        condition2.wait();
                    }
                        System.out.println(Thread.currentThread().getName() + ":" + i.get());
                        i.incrementAndGet();
                        condition3.signalAll();
                }catch (Exception e){

                }finally {
                    lock.unlock();
                }
            });
            Thread t3 = new Thread(() -> {
                lock.lock();
                try {
                    int j=i.get()%4;
                    while(j!=3){
                        condition2.wait();
                    }
                        System.out.println(Thread.currentThread().getName() + ":" + i.get());
                        i.incrementAndGet();
                        condition4.signalAll();


                }catch (Exception e){

                }finally {
                    lock.unlock();
                }
            });
            Thread t4 = new Thread(() -> {
                lock.lock();
                try {
                    int j=i.get()%4;
                    while(j!=0){
                        condition2.wait();
                    }
                        System.out.println(Thread.currentThread().getName() + ":" + i.get());
                        i.incrementAndGet();

                }catch (Exception e){

                }finally {
                    lock.unlock();
                }
            });

            t1.setName("thread1");
            t2.setName("thread2");
            t3.setName("thread3");
            t4.setName("thread4");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }

}
