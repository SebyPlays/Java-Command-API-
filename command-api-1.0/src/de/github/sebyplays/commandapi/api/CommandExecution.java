package de.github.sebyplays.commandapi.api;
//   #########################################
//   #             CommandAPI                #
//   #      *~* Author Seby_Plays *~*        #
//   #             __________                #
//   #     https://github.com/SebyPlays      #
//   #########################################

public interface CommandExecution {
    boolean onExecute(String command, String[] args);
}
