package de.github.sebyplays.commandapi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
//   #########################################
//   #             CommandAPI                #
//   #      *~* Author Seby_Plays *~*        #
//   #             __________                #
//   #     https://github.com/SebyPlays      #
//   #########################################
public class DateUtil {
    public String getDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String currentDate = simpleDateFormat.format(date) + " | ";
        return currentDate;
    }

    public String getTime(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String currentTime = simpleDateFormat.format(date) + " | ";
        return currentTime;
    }
}
