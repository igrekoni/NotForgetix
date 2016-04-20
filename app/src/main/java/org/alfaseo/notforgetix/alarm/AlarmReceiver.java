package org.alfaseo.notforgetix.alarm;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.NotificationCompat;

import org.alfaseo.notforgetix.MainActivity;
import org.alfaseo.notforgetix.MyApplication;
import org.alfaseo.notforgetix.R;

/**
 * Created by Gre on 20.04.2016.
 */
public class AlarmReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        String title = intent.getStringExtra("title");
        long timeStamp = intent.getLongExtra("time_stamp", 0);
        int color = intent.getIntExtra("color", 0);

        Intent resultIntent = new Intent(context, MainActivity.class);

        if (MyApplication.isActivityVisible()){
            resultIntent = intent;
        }

        resultIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, (int) timeStamp,
                resultIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        builder.setContentTitle("NotForgetix");
        builder.setContentText(title);
        //builder.setColor(context.getResources().getColor(color));
        builder.setColor(ContextCompat.getColor(context, color));
        builder.setSmallIcon(R.drawable.ic_check_white_48dp);

        builder.setDefaults(Notification.DEFAULT_ALL);
        builder.setContentIntent(pendingIntent);

        Notification notification = builder.build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;

        NotificationManager notificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify((int) timeStamp, notification);

    }
}
