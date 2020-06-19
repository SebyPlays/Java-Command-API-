package de.github.sebyplays.commandapi.api;

import com.sun.deploy.util.ArrayUtil;
import de.github.sebyplays.commandapi.utils.DateUtil;
import org.jetbrains.annotations.NotNull;

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
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, CommandExecution> commandList = new HashMap<String, CommandExecution>();
    private static HashMap<String, String> commandDescriptions = new HashMap<String, String>();
    private DateUtil dateUtil = new DateUtil();

    /**
     * in this method, commands are being registered and initialized.
     */
    public void initializeCommands() {
        //EXAMPLE : registerCommand("ExampleCommandName", new ExampleCommandExecutorClass)
    }


    /**
     * The getCommand(String command) method is splitting the given string that has been entered
     * into an string array, separates the command from the arguments
     * and checks the availability of the command.
     * If the command is available, the required parameters are being passed to
     * the next method.
     */
    //TODO TRANSFER THE ARRAY
    public void getCommand(@NotNull String command) {
        String[] savedArgs = command.split(" ");
        command = command.replace(savedArgs[0] + " ", "");
        String[] args = command.split(" ");
        command = savedArgs[0].toLowerCase();

        if (!this.commandList.containsKey(command.toLowerCase())) {
            System.out.println(this.dateUtil.getTime() + "Sorry, \"" + command + "\" seems not to be registered.");
            return;
        }

        executeCommand(this.commandList.get(command), command, args);
        return;
    }


    private void executeCommand(@NotNull CommandExecution commandExecution, String command, String[] args){
        commandExecution.onExecute(command, args);
        return;
    }

    public void invalidArguments(){
        System.out.println(this.dateUtil.getTime() + "Invalid arguments given. type \"help\" for help");
    }

    public void registerCommand(@NotNull String name, String description, CommandExecution execution){
        this.commandList.put(name.toLowerCase(), execution);
        this.commandDescriptions.put(name.toLowerCase(), description);
        return;
    }

    public String getCommandDescription(String command){
        return commandDescriptions.get(command);
    }

    public List<String> getCommandList(){
        List<String> commandCollection = new ArrayList(this.commandList.keySet());
        return commandCollection;
    }
}
