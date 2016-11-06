package com.jpuyo.android.broadcastreceiverplayground;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvMessage)
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnStartBroadcast)
    public void startBroadcast() {
        Intent intent = new Intent("MyCustomIntent");
        intent.putExtra("message", (CharSequence)tvMessage.getText().toString());
        intent.setAction("com.jpuyo.android.broadcastreceiverplayground.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}
