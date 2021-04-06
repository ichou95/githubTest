package command;

import java.util.ArrayList;
import java.util.List;

public class CommandTest {
    public static void main(String[] args) {

        GamesConsole gamesConsole=new GamesConsole();

        List<Command> commands=new ArrayList<>();
        GameRole warrior=new GameRole("战士");
        GameRole sworder=new GameRole("剑士");
        GameRole minister=new GameRole("牧师");

        Command defence=new DefenseCommand();
        defence.setRole(warrior);
        Command attack=new AttackCommand();
        attack.setRole(sworder);
        Command skill=new SkillCommand();
        skill.setRole(minister);
        commands.add(skill);
        commands.add(attack);
        commands.add(defence);

        gamesConsole.setCommands(commands);
        gamesConsole.doCommand();



    }
}
