package factory;

public class PhonFactory {
    public Phone doAnyPhone(String name){
        Phone p=null;
        if("mi".equals(name)){
            p=new MiPhone();
        }else {
            p=new HuaWeiPhone();
        }
        return p;
    }
}
