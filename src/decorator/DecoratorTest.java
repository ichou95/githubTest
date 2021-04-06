package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        People xiaoming=new XiaoMing("xiaoming");
        xiaoming=new Hat(xiaoming);
        xiaoming=new Clothes(xiaoming);
        xiaoming=new Trousers(xiaoming);
        xiaoming.doDecorator();
        System.out.println("123455");

    }
}
