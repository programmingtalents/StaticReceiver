package com.programmingtalents.android.broadcast;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NotifyMessage extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt = new TextView(this);

        txt.setText("Notification");
        setContentView(txt);
    }
}