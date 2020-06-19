package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.utils.DateUtil;

public class ExitCommand implements CommandExecution {

    private DateUtil dateUtil = new DateUtil();
    @Override
    public boolean onExecute(String command, String[] args) {
        System.out.println(dateUtil.getTime() + "Exiting Application.");
        System.exit(0);
        return false;
    }
}
