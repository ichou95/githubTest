public class Demo {
    public static void main(String[] args) {
        Class clazz=Demo.class;
        Thread t1=new Thread(()->{
            synchronized (clazz){
                for(int i=1;i<27;i++){

                    System.out.println(i);
                    clazz.notifyAll();
                    if(i==26){

                    }else {
                        try {
                            clazz.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        Thread t2=new Thread(()->{
            synchronized (Demo.class){
                for(char j='A';j<='Z';j++){
                    System.out.println(j);
                    clazz.notifyAll();
                    if('Z'==j){

                    }else {
                        try {
                            clazz.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }

}
