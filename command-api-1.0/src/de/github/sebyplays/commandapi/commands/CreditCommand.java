package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.api.CommandProcessor;

public class CreditCommand implements CommandExecution {
    private CommandProcessor commandProcessor = new CommandProcessor();
    @Override
    public boolean onExecute(String command, String[] args) {
        System.out.println(command + args[0]);
        if (args.length == 1){
            if (args[0].equalsIgnoreCase("github")){
                System.out.println("\n------------------------- \nGitHub of Seby_Plays : https://github.com/SebyPlays \n-------------------------");
                return false;
            }
            if (args[0].equalsIgnoreCase("website")){
                System.out.println("\n------------------------- \nWebsite of Seby_Plays : https://mcsilent.de \n-------------------------");
                return false;
            }
        }
        commandProcessor.invalidArguments();
        return false;
    }
}
