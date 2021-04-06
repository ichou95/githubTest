package factory2;

public class HuaWeiPhoneFactory extends PhonFactory{
    @Override
    public Phone doPhoneFactory() {
        Phone p=new HuaWeiPhone();
        return p;
    }


}
