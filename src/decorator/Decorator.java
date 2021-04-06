package decorator;

public abstract class Decorator extends People{
    private People people;

    public Decorator(People people) {
        this.people=people;
    }

    @Override
    public void doDecorator(){
        if(people != null) {
            this.people.doDecorator();
        }
    }

}
