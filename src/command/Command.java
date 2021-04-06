package command;

public abstract class Command {
    private GameRole role;

    public void setRole(GameRole role){
        this.role=role;
    }

    public GameRole getRole (){
        return this.role;
    }

    public abstract void doCommand();
}
