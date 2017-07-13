package com.lz.example.android_jni_sample;

/**
 * Created by lz on 2017/7/6.
 */

public class JniUtils {

    static {
        System.loadLibrary("app");   //defaultConfig.ndk.moduleName
    }

    public native String getStringFormC();
}