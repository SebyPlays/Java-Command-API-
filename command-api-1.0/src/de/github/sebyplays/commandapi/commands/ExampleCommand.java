package de.github.sebyplays.commandapi.commands;

import de.github.sebyplays.commandapi.api.CommandExecution;
import de.github.sebyplays.commandapi.utils.DateUtil;

import java.util.Date;

public class ExampleCommand implements CommandExecution {

    @Override
    public boolean onExecute(String command, String[] args) {
        DateUtil dateUtil = new DateUtil();
        System.out.println(dateUtil.getTime() + "Example command executed successfully.");
        return false;
    }
}
