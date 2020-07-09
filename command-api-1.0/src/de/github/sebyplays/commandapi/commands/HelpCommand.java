package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.api.CommandProcessor;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class HelpCommand implements CommandExecution {
    private CommandProcessor commandProcessor = new CommandProcessor();
    @Override
    public boolean onExecute(String command, String[] args) {

        ConsolePrinter.print("#############################", false, false);
        ConsolePrinter.print(" Available Example Commands \n", false, false);
        for(String commands : this.commandProcessor.getCommandList()){
            ConsolePrinter.print(" - " + commands + " (" + this.commandProcessor.getCommandDescription(commands) + ") ", false, false);
        }
        ConsolePrinter.print("#############################", false, false);
        return false;
    }
}
