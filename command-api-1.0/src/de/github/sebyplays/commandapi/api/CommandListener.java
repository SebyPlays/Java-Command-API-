package de.github.sebyplays.commandapi.api;

public class CommandListener {
    private static CommandProcessor commandProcessor = new CommandProcessor();
    /**
     * always call this method at the end of your main method.
     * */

    public void initializeListener(){
        this.commandProcessor.getCommand(this.commandProcessor.getInput());
        initializeListener();
    }

    public void universalProcessCommand(String command){
        this.commandProcessor.getCommand(command);
        return;
    }

}
