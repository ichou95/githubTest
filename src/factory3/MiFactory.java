package factory3;

public class MiFactory extends Factory {
    @Override
    public Phone doPhoneFactory() {
        Phone p=new MiPhone();
        return p;
    }

    @Override
    public Computer doComputerFactory() {
        Computer c=new MiComputer();
        return c;
    }


}
