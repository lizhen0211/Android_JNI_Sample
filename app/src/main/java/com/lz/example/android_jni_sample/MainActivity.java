package com.lz.example.android_jni_sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JniUtils jniUtils = new JniUtils();
        TextView helloText = (TextView) findViewById(R.id.hello_text);
        helloText.setText(jniUtils.getStringFormC());
    }
}
