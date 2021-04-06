package decorator;

public class Trousers extends Decorator{
    private String trousers;
    public Trousers(People people) {
        super(people);
    }
    private void doTrousers(String trousers){
        this.trousers=trousers;
    }
    @Override
    public void doDecorator(){
        this.doTrousers("西裤");
        super.doDecorator();
    }
}
