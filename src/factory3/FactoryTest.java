package factory3;

public class FactoryTest {
    public static void main(String[] args) {
        Factory pf=new MiFactory();
        Phone p=pf.doPhoneFactory();
        p.doPhone();
        Computer c=pf.doComputerFactory();
        c.doComputer();
    }
}
