package factory3;

public class HuaWeiFactory extends Factory {
    @Override
    public Phone doPhoneFactory() {
        Phone p=new HuaWeiPhone();
        return p;
    }

    @Override
    public Computer doComputerFactory() {
        Computer c=new HuaWeiComputer();
        return c;
    }


}
