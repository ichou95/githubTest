public class Demo2 {
    private volatile static Demo2 demo2;
    private  void Demo2(){}
    public void Demo2Init(){
        if(demo2==null){
            synchronized (Demo2.class){
                if(demo2==null){
                    demo2=new Demo2();
                }
            }

        }
    }
}
