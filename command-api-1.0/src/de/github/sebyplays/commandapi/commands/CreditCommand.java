package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.api.CommandProcessor;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class CreditCommand implements CommandExecution {
    private CommandProcessor commandProcessor = new CommandProcessor();
    @Override
    public boolean onExecute(String command, String[] args) {
        ConsolePrinter.print(command + args[0], false, false);
        if (args.length == 1){
            if (args[0].equalsIgnoreCase("github")){
                ConsolePrinter.print("\n------------------------- \nGitHub of Seby_Plays : https://github.com/SebyPlays \n-------------------------", false, false);
                return false;
            }
            if (args[0].equalsIgnoreCase("website")){
                ConsolePrinter.print("\n------------------------- \nWebsite of Seby_Plays : https://mcsilent.de \n-------------------------", false, false);
                return false;
            }
        }
        this.commandProcessor.invalidArguments();
        return false;
    }
}
