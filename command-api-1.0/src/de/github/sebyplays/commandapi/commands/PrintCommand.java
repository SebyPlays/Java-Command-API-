package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class PrintCommand implements CommandExecution {
private String message = "";
    @Override
    public boolean onExecute(String command, String[] args) {

        for(int i = 0; i < args.length; i++){
            this.message = this.message + " " + args[i];
        }

        ConsolePrinter.print(this.message, true, false);
        this.message = "";
        return false;
    }
}
