package org.alfaseo.notforgetix;

import java.text.SimpleDateFormat;

/**
 * Created by Gre on 16.03.2016.
 */
public class Utils {

    public static String getDate(long date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(date);
    }

    public static String getTime(long time){
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return timeFormat.format(time);
    }

}
