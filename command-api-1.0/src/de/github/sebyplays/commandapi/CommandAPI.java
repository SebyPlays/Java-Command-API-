package de.github.sebyplays.commandapi;

import de.github.sebyplays.commandapi.api.CommandListener;
import de.github.sebyplays.commandapi.api.CommandProcessor;
import de.github.sebyplays.commandapi.commands.*;
import de.github.sebyplays.commandapi.utils.DoubleEntryException;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

public class CommandAPI extends CommandProcessor {
    private static CommandAPI commandAPI = new CommandAPI();
    private static CommandListener commandListener = new CommandListener();
    public static void main(String[] args) {
        commandAPI.initializeCommands();
        ConsolePrinter.print("\n\n\n#################################", false, false);
        ConsolePrinter.print("# CommandAPI example executable #", false, false);
        ConsolePrinter.print("#           _________           #", false, false);
        ConsolePrinter.print("#       Author Seby_Plays       #", false, false);
        ConsolePrinter.print("#################################\n \n", false, false);
        commandListener.initializeListener();
    }

    @Override
    public void initializeCommands() {
        try{
            registerCommand("help", "to show the list of available commands", new HelpCommand());
            registerCommand("example", "let's see what happens ^^.", new ExampleCommand());
            registerCommand("credits", "to show the credits of the api", new CreditCommand());
            registerCommand("exit", "to exit the application", new ExitCommand());
            registerCommand("print", "takes use of the ConsolePrinter API", new PrintCommand());
        } catch (DoubleEntryException exception){
            exception.printStackTrace();
            System.exit(-1);
            return;
        }
    }
}
