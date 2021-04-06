package command;

public class DefenseCommand extends Command{

    @Override
    public void doCommand() {
        String name=getRole().getName();
        System.out.println(name+"执行防御");
    }
}
