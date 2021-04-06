package factory2;

import factory2.PhonFactory;
import factory2.Phone;

public class FactoryTest {
    public static void main(String[] args) {
        PhonFactory pf=new MiPhoneFactory();
        Phone p=pf.doPhoneFactory();
        p.doPhone();
    }
}
