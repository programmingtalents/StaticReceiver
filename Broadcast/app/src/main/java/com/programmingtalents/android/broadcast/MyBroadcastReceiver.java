package com.programmingtalents.android.broadcast;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.support.v7.app.NotificationCompat.Builder;


public class MyBroadcastReceiver extends BroadcastReceiver {

	private static final int NOTIFY_ME_ID = 101;

	@Override
	public void onReceive(Context context, Intent intent) {

		NotificationCompat.Builder mBuilder = (Builder) new Builder(
				context.getApplicationContext()).setSmallIcon(R.drawable.android)
				.setContentTitle("Time has been Reset")
				.setContentText("Sucessfully Changed Time");

		mBuilder.setAutoCancel(true);

		Intent resultIntent = new Intent(context,NotifyMessage.class);
		PendingIntent resultPendingIntent = PendingIntent.getActivity(context, 0, resultIntent, 0);
		mBuilder.setContentIntent(resultPendingIntent);


		NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
		mNotificationManager.notify(NOTIFY_ME_ID, mBuilder.build());


	}

}
