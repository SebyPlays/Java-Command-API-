package de.github.sebyplays.commandapi.api;

import java.util.Scanner;

public class CommandListener {
    private static CommandProcessor commandProcessor = new CommandProcessor();
    private static Scanner scanner = new Scanner(System.in);
    /**
     * always call this method at the end of your main method.
     * */

    public void initializeListener(){
        commandProcessor.getCommand(scanner.nextLine());
        initializeListener();
    }

}
