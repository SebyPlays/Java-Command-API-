package de.github.sebyplays.commandapi.api;

import com.sun.istack.internal.NotNull;
import de.github.sebyplays.commandapi.utils.DoubleEntryException;
import de.github.sebyplays.consoleprinterapi.api.ConsolePrinter;

import java.util.*;

//   #########################################
//   #             CommandAPI                #
//   #      *~* Author Seby_Plays *~*        #
//   #             __________                #
//   #     https://github.com/SebyPlays      #
//   #########################################
/**@author Seby_Plays
 * This is the main class processing the commands.
 */
public class CommandProcessor {
    private static HashMap<String, CommandExecution> commandList = new HashMap<String, CommandExecution>();
    private static HashMap<String, String> commandDescriptions = new HashMap<String, String>();
    private static Scanner scanner = new Scanner(System.in);
    /**
     * in this method, commands are being registered and initialized.
     */
    public void initializeCommands() {
        /*
         * try{
         *      registerCommand("ExampleCommandName", new ExampleCommandExecutorClass());
         *      registerCommand(new ExampleCommandExecutorClass(), "command1", "command2", "command3"...);
         * }catch(DoubleEntryException exception){
         *      exception.printStackTrace();
         * }
         *
         */
    }


    /**
     * The 'getCommand(String command);' method is splitting the given string that has been entered
     * into an string array, separates the command from the arguments
     * and checks the availability of the command.
     * If the command is available, the required parameters are being passed to
     * the next method.
     */
    public void getCommand(@NotNull String command) {
        String[] savedArgs = command.split(" ");
        command = command.replace(savedArgs[0] + " ", "");
        String[] args = command.split(" ");
        command = savedArgs[0].toLowerCase();

        if (!this.commandList.containsKey(command.toLowerCase())) {
            ConsolePrinter.print("Sorry, \"" + command + "\" seems not to be registered.", false, true);
            return;
        }

        executeCommand(this.commandList.get(command), command, args);
        return;
    }

    /**The 'executeCommand();' method passes the parameters to the executor */
    private void executeCommand(@NotNull CommandExecution commandExecution, String command, String[] args){
        commandExecution.onExecute(command, args);
        return;
    }

    public void invalidArguments(){
        ConsolePrinter.print("Invalid arguments given. type \"help\" for help", false, true);
    }

    /**This method is registering the commands.*/
    public void registerCommand(@NotNull String name, String description, CommandExecution execution) throws DoubleEntryException {
        /**command doubler prevention*/

        if(commandList.containsKey(name)){
            throw new DoubleEntryException("This command is already registered!");
        }

        this.commandList.put(name.toLowerCase(), execution);
        if(description != null){
            this.commandDescriptions.put(name.toLowerCase(), description);
            return;
        }
        this.commandDescriptions.put(name.toLowerCase(), "No description provided");
        return;
    }

    /**This method is removing commands */
    public void unregisterCommand(@NotNull String name) throws NullPointerException {
        if(!this.commandList.containsKey(name.toLowerCase())){
            throw new NullPointerException("There is no such command registered!");
        }
        this.commandList.remove(name.toLowerCase());
        if(this.commandDescriptions.get(name.toLowerCase()) != null){
            this.commandDescriptions.remove(name.toLowerCase());
            return;
        }
        return;
    }

    /**This method registers an array of commands simultaneously*/
    public void registerCommand(CommandExecution execution, @NotNull String... name) throws DoubleEntryException {
        for(String command : Arrays.asList(name)){
            if(commandList.containsKey(command)){
                throw new DoubleEntryException();
            }
            this.commandList.put(command.toLowerCase(), execution);
            this.commandDescriptions.put(command.toLowerCase(), "No description provided");
        }
        return;
    }

    /** gets the description of a command*/
    public String getCommandDescription(String command){
        return commandDescriptions.get(command);
    }
    /**get list of commands*/
    public List<String> getCommandList(){
        List<String> commandCollection = new ArrayList(this.commandList.keySet());
        return commandCollection;
    }

    public static String getInput(){
        return scanner.nextLine();
    }
}
