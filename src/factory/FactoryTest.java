package factory;

public class FactoryTest {
    public static void main(String[] args) {
        PhonFactory pf=new PhonFactory();
        Phone p=pf.doAnyPhone("mi");
        p.doPhone();
    }
}
