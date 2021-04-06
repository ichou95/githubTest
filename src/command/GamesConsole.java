package command;

import java.util.List;

public class GamesConsole {
   private List<Command> commands;

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void doCommand(){
        for(Command command:commands){
            command.doCommand();
        }
    }
}
