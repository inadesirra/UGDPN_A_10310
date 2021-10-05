package com.example.ugdpn_a_10310;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class DirectReplyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle remoteInput = RemoteInput.getResultsFromIntent(intent);
        if (remoteInput != null) {
            CharSequence replyMessage = remoteInput.getCharSequence("key_text_reply");
            MyMessage answer = new MyMessage(replyMessage, null);
            MainActivity.MESSAGES.add(answer);
            MainActivity.sendChannel5Notification(context);
        }
    }
}
