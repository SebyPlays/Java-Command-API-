package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.api.CommandProcessor;

public class HelpCommand implements CommandExecution {
    private CommandProcessor commandProcessor = new CommandProcessor();
    @Override
    public boolean onExecute(String command, String[] args) {

        System.out.println("#############################");
        System.out.println(" Available Example Commands \n");
        for(String commands : commandProcessor.getCommandList()){
            System.out.println(" - " + commands + " (" + commandProcessor.getCommandDescription(commands) + ") ");
        }
        System.out.println("#############################");
        return false;
    }
}
