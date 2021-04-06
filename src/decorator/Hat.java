package decorator;

public class Hat extends Decorator{
    private String hat;

    public Hat(People people) {
        super(people);
    }

    private void doHat(String hat){
        this.hat=hat;
    }
    @Override
    public void doDecorator(){
        this.doHat("礼帽");
        super.doDecorator();
    }

}
