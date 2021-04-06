package command;

public class SkillCommand extends Command{

    @Override
    public void doCommand() {
        String name=getRole().getName();
        System.out.println(name+"使用技能");
    }
}
