package factory2;

public class MiPhoneFactory extends PhonFactory{
    @Override
    public Phone doPhoneFactory() {
        Phone p=new  MiPhone();
        return p;
    }


}
