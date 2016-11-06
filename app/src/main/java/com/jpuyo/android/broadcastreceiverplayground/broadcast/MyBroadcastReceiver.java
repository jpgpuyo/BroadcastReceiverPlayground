package com.jpuyo.android.broadcastreceiverplayground.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		CharSequence intentData = intent.getCharSequenceExtra("message");	
		Toast.makeText(context, "Intent's message received: "+intentData, Toast.LENGTH_LONG).show();
	}

}
