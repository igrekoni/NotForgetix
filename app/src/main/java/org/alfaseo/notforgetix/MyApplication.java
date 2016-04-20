package org.alfaseo.notforgetix;

import android.app.Application;

/**
 * Created by Gre on 20.04.2016.
 */
public class MyApplication extends Application {

    private static boolean activityVisible;

    public static boolean isActivityVisible(){
        return activityVisible;
    }

    public static void activityResumed(){
        activityVisible = true;
    }

    public static void activityPaused(){
        activityVisible = false;
    }

}
