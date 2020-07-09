package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class ExitCommand implements CommandExecution {
    @Override
    public boolean onExecute(String command, String[] args) {
        ConsolePrinter.print("Exiting Application...", false, true);
        System.exit(0);
        return false;
    }
}
