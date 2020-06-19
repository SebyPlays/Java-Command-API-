package de.github.sebyplays.commandapi;

import de.github.sebyplays.commandapi.api.CommandListener;
import de.github.sebyplays.commandapi.api.CommandProcessor;
import de.github.sebyplays.commandapi.commands.*;

import java.io.IOException;
import java.util.Scanner;

public class CommandAPI extends CommandProcessor {
    private static CommandAPI commandAPI = new CommandAPI();
    private static CommandListener commandListener = new CommandListener();
    public static void main(String[] args) throws IOException {
        commandAPI.initializeCommands();
        System.out.println("\n\n\n#################################");
        System.out.println("# CommandAPI example executable #");
        System.out.println("#           _________           #");
        System.out.println("#       Author Seby_Plays       #");
        System.out.println("#################################");
        System.out.println("\n \n");
        commandListener.initializeListener();
    }

    @Override
    public void initializeCommands() {
        registerCommand("help", "to show the list of available commands", new HelpCommand());
        registerCommand("example", "let's see what happens ^^.", new ExampleCommand());
        registerCommand("credits", "to show the credits of the api", new CreditCommand());
        registerCommand("exit", "to exit the application", new ExitCommand());
    }
}
