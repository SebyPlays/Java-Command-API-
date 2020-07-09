package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class ExampleCommand implements CommandExecution {

    @Override
    public boolean onExecute(String command, String[] args) {
        ConsolePrinter.print("§1Example §2command §3executed §4succe§5ssfu§6l§7ly.", true, true);
        return false;
    }
}
