package command;

public class AttackCommand extends Command{

    @Override
    public void doCommand() {
        String name=getRole().getName();
        System.out.println(name+"执行攻击");
    }
}
