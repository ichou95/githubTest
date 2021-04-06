package decorator;

public class Clothes extends Decorator{
    private String clothes;
    public Clothes(People people) {
        super(people);
    }
    public void  doClothes(String clothes){
        this.clothes=clothes;
    }
    @Override
    public void doDecorator(){
        this.doClothes("大衣");
        super.doDecorator();
    }

}
